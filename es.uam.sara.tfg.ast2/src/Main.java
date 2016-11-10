import java.io.File;
import java.io.IOException;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Operation;
import es.uam.sara.tfg.properties.classes.ClassNameOperation;
import es.uam.sara.tfg.properties.methods.MethIsGeneric;

public class Main {

	
	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		ReadFiles.parseFiles(root);
		
		MethIsGeneric nameMeth= new MethIsGeneric();
		nameMeth.check(Visitors.getMethods());
		System.out.println(nameMeth.getRight());
		
		ClassNameOperation name= new ClassNameOperation(Operation.EQUAL, "Test", NameCheck.EMPTY);
		name.check(Visitors.getClasses());
		TypeDeclaration t= name.getRight().get(0);
		System.out.println(t.typeParameters());
		System.out.println("----------------------------");
		System.out.println(t);

	}

}
