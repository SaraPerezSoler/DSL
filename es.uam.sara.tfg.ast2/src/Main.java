import java.io.File;
import java.io.IOException;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Operation;
import es.uam.sara.tfg.properties.classes.ClassNameOperation;
import es.uam.sara.tfg.properties.methods.Tamanio;
import es.uam.sara.tfg.properties.methods.MethIsGeneric;
import es.uam.sara.tfg.properties.methods.MethNameOperation;

public class Main {

	
	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		ReadFiles.parseFiles(root);
		
		MethNameOperation nameMeth= new MethNameOperation(Operation.EQUAL,"getNumCasa" , NameCheck.EMPTY);
		nameMeth.check(Visitors.getMethods());
		
		Tamanio lin= new Tamanio(0, 0);
		lin.check(nameMeth.getRight());
		System.out.println(lin.getRight());
		
		ClassNameOperation name= new ClassNameOperation(Operation.EQUAL, "Test", NameCheck.EMPTY);
		name.check(Visitors.getClasses());
		TypeDeclaration t= name.getRight().get(0);
		System.out.println(t.getSuperclassType());
		System.out.println("----------------------------");
		System.out.println(t);

	}

}
