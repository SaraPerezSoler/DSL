import java.io.File;
import java.io.IOException;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;

public class Main {

	
	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		ReadFiles.parseFiles(root);
		
		for (String t:Visitors.getPackages()){
			System.out.println("--------------------------------");
			System.out.println(t);
		}
		// System.out.println(rootDir.listFiles());
		
		

		/*
		 * //IsImplemented i= new IsImplemented(visitors.getClasses(),
		 * visitors.getClasses()); //TypeDeclaration
		 * t=visitors.getClasses().get(3); Rule<FieldDeclaration> r= new
		 * Rule<FieldDeclaration>(false, Quantifier.EXISTS, null, null, null,
		 * "atttributes"); Properties<TypeDeclaration> no=new
		 * ClassContainAttributes(r); no.check(Visitors.getClasses());
		 * System.out.println("Right:"); System.out.println(no.getRight());
		 * System.out.println("Wrong:"); System.out.println(no.getWrong());
		 * 
		 * /* Modifiers aux=new Modifiers(); aux.addBlend("", false, false,
		 * true, false); Classes c=new Classes(visitors.getClasses());
		 * System.out.println("r:"+c.Modifiers(null, aux).getRight());
		 * System.out.println("w:"+c.Modifiers(null, aux).getWrong());
		 */

	}

}
