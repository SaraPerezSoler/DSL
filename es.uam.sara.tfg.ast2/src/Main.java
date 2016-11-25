import java.io.File;
import java.io.IOException;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.properties.all.NameOperation;
import es.uam.sara.tfg.properties.all.NameOperation.Operation;

public class Main {

	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		ReadFiles.parseFiles(root);
		NameOperation<Method> name = new NameOperation<Method>(true, Operation.EQUAL, "prueba", NameOperation.EMPTY);
		name.check(Visitors.getMethods());
		Method prueba = name.getRight().get(0);

		NameOperation<ClassInterface> classname = new NameOperation<ClassInterface>(true, Operation.EQUAL, "test",
				NameOperation.EMPTY);
		classname.check(Visitors.getClasses());
		ClassInterface test = classname.getRight().get(0);
		/*for (Method m1 : name.getRight()) {
			for (Method m : test.getMethods()) {
				if (m1.equals(m)) {
					System.out.println(m1);
				}
			}
		}*/
		
		for (ClassInterface c: classname.getRight()){
			System.out.print(c);
		}
	}

}
