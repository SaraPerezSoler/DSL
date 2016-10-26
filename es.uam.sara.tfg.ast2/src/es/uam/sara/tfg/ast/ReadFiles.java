package es.uam.sara.tfg.ast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFiles {
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
	
	public static void getFiles(File f, ArrayList<File> list){
		if (f.isFile()){
			list.add(f);
		}else{
			File[] files=f.listFiles();
			for (File faux: files){
				getFiles(faux, list);
			}
		}
	}
}
