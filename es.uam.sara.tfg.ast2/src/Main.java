import java.io.File;
import java.io.IOException;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.properties.TypeToString;
import es.uam.sara.tfg.properties.TypeToString.Primitive;

public class Main {

	
	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		ReadFiles.parseFiles(root);
		
		for (Attribute a: Visitors.getAttributes()){
			System.out.println(a.getBodyDeclarations());
			//System.out.println(TypeToString.isPrimitiveType(a.getType(), Primitive.INT));
			TypeToString.isCollectionOf(a.getType(), "");
			
		}
		
		

	}

}
