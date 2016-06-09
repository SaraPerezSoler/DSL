import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.ParserAst;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.properties.Attributes;
import es.uam.sara.tfg.ast.properties.Classes;
import es.uam.sara.tfg.ast.properties.Methods;
import es.uam.sara.tfg.ast.properties.Name;
import es.uam.sara.tfg.ast.properties.Name.Type;
import es.uam.sara.tfg.ast.properties.Result;

public class Main {

	public static String readFileToString(String filePath) throws IOException {
		StringBuilder fileData = new StringBuilder(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
 
		char[] buf = new char[10];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		} 
 
		reader.close();
 
		return  fileData.toString();	
	}
	
	private static void getFiles(File f, ArrayList<File> list){
		if (f.isFile()){
			list.add(f);
		}else{
			File[] files=f.listFiles();
			for (File faux: files){
				getFiles(faux, list);
			}
		}
	}
 
	public static void main(String[] args) throws IOException {
		
		UnitVisitor u=new UnitVisitor();
		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator+"src"+File.separator;
 
		File root = new File(dirPath);
		//System.out.println(rootDir.listFiles());
		ArrayList<File> files= new ArrayList<File>();
		getFiles (root, files);
		String filePath = null;
 
		 for (File f : files ) {
			 filePath = f.getAbsolutePath();
			 
			 if(f.isFile()){
				 ParserAst.parse(readFileToString(filePath), u);
			 }
		 }
		 /*Attributes att= new Attributes(u.getAttributes());
		 att.nameType(null, Type.upperCamelCase);*/
		 
		/* Methods ms=new Methods(u.getMethods());
		 ms.*/
		
		 
		 
		
	}

}
