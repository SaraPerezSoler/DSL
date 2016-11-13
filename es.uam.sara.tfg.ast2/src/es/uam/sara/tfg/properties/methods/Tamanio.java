package es.uam.sara.tfg.properties.methods;
import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.ast.Visitors;

public class Tamanio extends Method {

	int max, min;

	public Tamanio(int max, int min) {
		this.max = max;
		this.min = min;
	}

	@Override
	public void check(List<MethodDeclaration> analize) {
		for (MethodDeclaration m : analize) {
			checkLimits(m);
		}
	}

	public boolean checkLimits(MethodDeclaration m) {
		int start = Visitors.getVisitor(m).getLineNumber(m.getStartPosition());
		int end = Visitors.getVisitor(m).getLineNumber(m.getStartPosition() + m.getLength());
		int tam=end-start;
		if ((min<= tam)&&(tam<=max)){
			return true;
		}
		return false;
	}
}
