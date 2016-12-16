import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import es.uam.sara.tfg.ast.ReadFiles;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.properties.all.NameOperation;
import es.uam.sara.tfg.properties.all.NameOperation.Operation;
import es.uam.sara.tfg.properties.type.Type;
import es.uam.sara.tfg.properties.type.TypeIsCollection;

public class Main {

	public static void main(String[] args) throws IOException {

		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;
		File root = new File(dirPath);
		Visitors visit=new Visitors("AST2");
		ReadFiles.parseFiles(root, visit);
	}
	
	
}
