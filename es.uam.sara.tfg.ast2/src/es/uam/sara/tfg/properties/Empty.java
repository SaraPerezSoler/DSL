package es.uam.sara.tfg.properties;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;

public class Empty {

	public static boolean isEmpty(AbstractTypeDeclaration t) {
		return t.bodyDeclarations().isEmpty();
	}

	public static boolean isEmpty(MethodDeclaration md) {
		return md.getBody().statements().isEmpty();
	}

	public static boolean isEmpty(String pk) {
		if (Visitors.getClasses(pk).isEmpty() && Visitors.getInterfaces(pk).isEmpty()
				&& Visitors.getEnumerations(pk).isEmpty()) {
			return true;
		}
		return false;

	}
	public static boolean isEmpty(UnitVisitor file) {
		return file.isEmpty();
	}
	
}
