package es.uam.sara.tfg.properties.packages;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.*;
import org.eclipse.jface.text.Document;

import es.uam.sara.tfg.properties.PropertiesException;

public class NoEmpty extends Package {

	public NoEmpty(List<String> analyze) {
		super(analyze);
	}

	@Override
	public void check() {
		for (String s: super.analyze){
			File file= new File(s);
			try{
			if (file.isDirectory()){
				if (file.list().length!=0){
					super.addRight(s);
				}else{
					super.addWrong(s);
				}
			}
			}catch(PropertiesException e){
				e.printStackTrace();
			}
		}
	}
}


