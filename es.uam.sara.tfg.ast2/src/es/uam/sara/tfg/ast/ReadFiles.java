package es.uam.sara.tfg.ast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class ReadFiles {

	public static void parseFiles(File root, Visitors visit) throws IOException {
		/*
		 * Cogemos todos los packetes del proyecto y lo guardamos en el visitors
		 */
		List<String> packs = new ArrayList<String>();
		getPackages(root, packs, root);

		/* Cogemos todos los ficheros del proyecto */
		List<File> files = new ArrayList<File>();
		ReadFiles.getFiles(root, files);

		String filePath = null;

		/*
		 * Por cada fichero si tiene extension .java lo parseamos y guardamos el
		 * visitor
		 */
		for (File f : files) {
			filePath = f.getAbsolutePath();
			//
			if (f.isFile() && f.getName().endsWith(".java")) {
				UnitVisitor u = new UnitVisitor(f.getName());
				visit.addVisitor(u);
				ParserAst.parse(readFileToString(filePath), u);
			}
		}

		visit.addPackages(packs);
	}

	public static void cargaProyectos(List<IProject> pojects, String pathThisProject) {
		try {
			for (IProject p : pojects) {

				IJavaProject javaProject = JavaCore.create(p);
				IPackageFragment[] packages;
				if (javaProject.exists()) {
					TypeVisitor u = new TypeVisitor(p.getName(), pathThisProject);
					packages = javaProject.getPackageFragments();
					for (IPackageFragment mypackage : packages) {
						if (mypackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
							for (ICompilationUnit unit : mypackage.getCompilationUnits()) {
								ParserAst.parse(unit, u);
							}
						}
					}
					u.writeObject();
				}
				
			}
			
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String readFileToString(String filePath) throws IOException {

		String fileData = new String();
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String linea;
		while ((linea = reader.readLine()) != null) {
			fileData = fileData.concat(linea + "\n");
		}
		reader.close();
		return fileData;
	}

	public static void getFiles(File f, List<File> list) {
		if (f.isFile()) {
			list.add(f);
		} else {
			File[] files = f.listFiles();
			for (File faux : files) {
				getFiles(faux, list);
			}
		}
	}

	public static void getPackages(File f, List<String> list, File root) {

		if (f.isFile()) {
			savePack(f.getParentFile(), list, root);
		} else {
			File[] files = f.listFiles();
			if (files.length == 0) {
				savePack(f, list, root);
			} else {
				for (File faux : files) {
					getPackages(faux, list, root);
				}
			}
		}
	}

	private static void savePack(File f, List<String> list, File root) {
		String pack;
		if (f.equals(root)) {
			pack = "(default package)";
		} else {
			pack = StringUtils.substringAfter(f.getAbsolutePath(), "\\src\\").replace("\\", ".");
		}
		if (!list.contains(pack)) {
			list.add(pack);
		}
	}
}
