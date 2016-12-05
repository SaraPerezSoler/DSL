import java.io.File;
import java.io.IOException;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.elements.type.Class;
import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.properties.PropertyStringVariable.StringType;
import es.uam.sara.tfg.properties.all.NameOperation;
import es.uam.sara.tfg.properties.all.NameOperation.Operation;

public class Main {

	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		Visitors visit=new Visitors("AST2");
		ReadFiles.parseFiles(root, visit);
		NameOperation<Method> name = new NameOperation<Method>(true, Operation.EQUAL, "prueba", NameOperation.EMPTY);
		name.check(visit.getMethods());
		Method prueba = name.getRight().get(0);

		NameOperation<Class> classname = new NameOperation<Class>(true, Operation.EQUAL, "test",
				NameOperation.EMPTY);
		classname.check(visit.getClasses());
		Class test = classname.getRight().get(0);
		/*for (Method m1 : name.getRight()) {
			for (Method m : test.getMethods()) {
				if (m1.equals(m)) {
					System.out.println(m1);
				}
			}
		}*/
		
		for (Class c: classname.getRight()){
			System.out.print(c);
		}
	}

}
