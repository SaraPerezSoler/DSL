import java.io.File;
import java.io.IOException;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.properties.all.NameOperation;
import es.uam.sara.tfg.properties.all.NameOperation.Operation;

public class Main {

	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		Visitors visit=new Visitors("AST2");
		ReadFiles.parseFiles(root, visit);
		NameOperation<MMethod> name = new NameOperation<MMethod>(true, Operation.EQUAL, "prueba", NameOperation.EMPTY);
		name.check(visit.getMethods());
		MMethod prueba = name.getRight().get(0);

		NameOperation<MClass> classname = new NameOperation<MClass>(true, Operation.EQUAL, "test",
				NameOperation.EMPTY);
		classname.check(visit.getClasses());
		MClass test = classname.getRight().get(0);
		/*for (Method m1 : name.getRight()) {
			for (Method m : test.getMethods()) {
				if (m1.equals(m)) {
					System.out.println(m1);
				}
			}
		}*/
		
		for (MClass c: classname.getRight()){
			System.out.print(c);
		}
	}

}
