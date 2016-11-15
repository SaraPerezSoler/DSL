import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.AnnotationCheck;
import es.uam.sara.tfg.properties.ModifiersCheck;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Operation;
import es.uam.sara.tfg.properties.classes.ClassNameOperation;
import es.uam.sara.tfg.properties.classes.Implements;
import es.uam.sara.tfg.properties.methods.MethSize;
import es.uam.sara.tfg.properties.methods.MethIsGeneric;
import es.uam.sara.tfg.properties.methods.MethNameOperation;

public class Main {

	
	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		ReadFiles.parseFiles(root);
		
		
		ClassNameOperation name= new ClassNameOperation(Operation.EQUAL, "Test", NameCheck.EMPTY);
		name.check(Visitors.getClasses());
		
		MethNameOperation meth= new MethNameOperation(Operation.EQUAL, "toString", NameCheck.EMPTY);
		meth.check(Visitors.getMethods(name.getRight().get(0)));
		AnnotationCheck a= new AnnotationCheck();
		a.addAnnotation("@Override");
		System.out.println(a.check(meth.getRight().get(0)));
		
		List<String>listM= AnnotationCheck.getListAnnotations(meth.getRight().get(0));
		System.out.println(listM);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		MethSize tam= new MethSize(-1, Integer.MAX_VALUE);
		tam.check(meth.getRight());
		
		Implements imp= new Implements("Comparable");
		List<String>list=imp.getInterface(name.getRight().get(0));
		System.out.println(list);
		TypeDeclaration t= name.getRight().get(0);
		System.out.println(t.getSuperclassType());
		System.out.println("----------------------------");
		System.out.println(t);

	}

}
