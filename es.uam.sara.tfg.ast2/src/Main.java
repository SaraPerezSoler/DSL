import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.ParserAst;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck.Operation;
import es.uam.sara.tfg.properties.Properties;
import es.uam.sara.tfg.properties.attributes.AttrNameOperation;
import es.uam.sara.tfg.properties.classes.ClassContain;
import es.uam.sara.tfg.properties.classes.ClassContainAttributes;
import es.uam.sara.tfg.rule.Rule;
import es.uam.sara.tfg.rule.Rule.Quantifier;


public class Main {

	public static String readFileToString(String filePath) throws IOException {
		/*StringBuilder fileData = new StringBuilder(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
 
		char[] buf = new char[10];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		} 
 
		reader.close();
 
		return  fileData.toString();	*/
		
		String fileData = new String();
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String linea;
		while((linea=reader.readLine())!=null){
			fileData=fileData.concat(linea+"\n");
		}
		reader.close();
		return fileData;
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
		
		
		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator+"src"+File.separator;
 
		File root = new File(dirPath);
		//System.out.println(rootDir.listFiles());
		ArrayList<File> files= new ArrayList<File>();
		getFiles (root, files);
		String filePath = null;
		 
		 for (File f : files ) {
			 filePath = f.getAbsolutePath();
			 //
			 if(f.isFile() && (f.getName().equals("Test.java")|| f.getName().equals("Hola.java"))){
				 UnitVisitor u=new UnitVisitor(f.getName());
				 Visitors.addVisitor(u);
				 ParserAst.parse(readFileToString(filePath), u);
			 }
		}
		//IsImplemented i= new IsImplemented(visitors.getClasses(), visitors.getClasses());
		//TypeDeclaration t=visitors.getClasses().get(3);
		Rule<FieldDeclaration> r= new Rule<FieldDeclaration>(false, Quantifier.EXISTS, null, null, null, "atttributes");
		Properties<TypeDeclaration> no=new ClassContainAttributes(r);
		no.check(Visitors.getClasses());
		System.out.println("Right:");
		System.out.println(no.getRight());
		System.out.println("Wrong:");
		System.out.println(no.getWrong());
		
		/* Modifiers aux=new Modifiers();
		 aux.addBlend("", false, false, true, false);
		Classes c=new Classes(visitors.getClasses());
		System.out.println("r:"+c.Modifiers(null, aux).getRight());
		System.out.println("w:"+c.Modifiers(null, aux).getWrong());
		 */
		 
		
	}

}
