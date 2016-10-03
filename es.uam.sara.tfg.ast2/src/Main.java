import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import es.uam.sara.tfg.ast.ParserAst;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck.Operation;
import es.uam.sara.tfg.properties.attributes.AttrNameOperation;


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
		
		
		System.out.println(Integer.MAX_VALUE);
		/*Test t=new Test();
		System.out.println();
		
		Test t2= new Test();
		System.out.println(t2.getNumCasa());
		
	/*	File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator+"src"+File.separator;
 
		File root = new File(dirPath);
		//System.out.println(rootDir.listFiles());
		ArrayList<File> files= new ArrayList<File>();
		getFiles (root, files);
		String filePath = null;
		Visitors visitors=new Visitors();
 
		 for (File f : files ) {
			 filePath = f.getAbsolutePath();
			 if(f.isFile()){
				 UnitVisitor u=new UnitVisitor(f.getName());
				 visitors.addVisitor(u);
				 ParserAst.parse(readFileToString(filePath), u);
			 }
		}
		//IsImplemented i= new IsImplemented(visitors.getClasses(), visitors.getClasses());
		//TypeDeclaration t=visitors.getClasses().get(3);
		
		AttrNameOperation no=new AttrNameOperation(visitors.getAttributes(), Operation.ENDS, "bo", 0);
		no.check();*/
		
		/* Modifiers aux=new Modifiers();
		 aux.addBlend("", false, false, true, false);
		Classes c=new Classes(visitors.getClasses());
		System.out.println("r:"+c.Modifiers(null, aux).getRight());
		System.out.println("w:"+c.Modifiers(null, aux).getWrong());*/
		 
		 
		
	}

}
