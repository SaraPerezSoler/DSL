package es.uam.sara.tfg.ast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class ReadFiles {
	
	public static void parseFiles(File root) throws IOException{
		/*Cogemos todos los packetes del proyecto y lo guardamos en el visitors*/
		List<String> packs = new ArrayList<String>();
		ReadFiles.getPackages(root, packs, root);
		Visitors.addPackages(packs);
		
		/*Cogemos todos los ficheros del proyecto*/
		List<File> files = new ArrayList<File>();
		ReadFiles.getFiles(root, files);
		
		String filePath = null;

		/*Por cada fichero si tiene extension .java lo parseamos y guardamos el visitor*/
		for (File f : files) {
			filePath = f.getAbsolutePath();
			//
			if (f.isFile() && f.getName().endsWith(".java")) {
				UnitVisitor u = new UnitVisitor(f.getName());
				Visitors.addVisitor(u);
				ParserAst.parse(readFileToString(filePath), u);
			}
		}
	}
	public static String readFileToString(String filePath) throws IOException {

		String fileData = new String();
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String linea;
		while((linea=reader.readLine())!=null){
			fileData=fileData.concat(linea+"\n");
		}
		reader.close();
		return fileData;	
	}
	
	public static void getFiles(File f,List<File> list){
		if (f.isFile()){
			list.add(f);
		}else{
			File[] files=f.listFiles();
			for (File faux: files){
				getFiles(faux, list);
			}
		}
	}

	public static void getPackages(File f, List<String> list, File root) {

		if (f.isFile()) {
			savePack(f.getParentFile(), list, root);
		} else {
			File[] files = f.listFiles();
			if (files.length == 0) {
				savePack(f, list, root);
			} else {
				for (File faux : files) {
					getPackages(faux, list, root);
				}
			}
		}
	}

	private static void savePack(File f, List<String> list, File root){
		String pack;
		if (f.equals(root)) {
			pack="(default package)";
		} else {
			pack=StringUtils.substringAfter(f.getAbsolutePath(), "\\src\\").replace("\\", ".");
		}
		if (!list.contains(pack)){
			list.add(pack);
		}
	}
	public static void reset(){
		Visitors.reset();
	}
}
