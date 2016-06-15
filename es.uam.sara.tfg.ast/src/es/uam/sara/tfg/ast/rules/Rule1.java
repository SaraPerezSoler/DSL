package es.uam.sara.tfg.ast.rules;
import java.util.ArrayList;

import org.eclipse.jdt.core.dom.PackageDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.ast.properties.Packages;
import es.uam.sara.tfg.ast.properties.Result;

public class Rule1 implements Rule{

	@Override
	public void execute(Visitors visitors) {

		Packages pack= new Packages(visitors.getPackages());
		ArrayList<Result<PackageDeclaration>> or=new ArrayList<Result<PackageDeclaration>>();
	}

}
