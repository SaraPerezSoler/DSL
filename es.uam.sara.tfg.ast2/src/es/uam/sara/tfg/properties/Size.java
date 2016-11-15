package es.uam.sara.tfg.properties;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.Javadoc;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;

public class Size {

	private int max, min;
	private Map<ASTNode, Integer> map;

	public Size(int min, int max) {
		this.max = max;
		this.min = min;
		map = new HashMap<ASTNode, Integer>();
	}

	public int getSize(ASTNode m) {
		int start = 0;
		int end = 0;
		UnitVisitor uv = Visitors.getVisitor(m);
		Javadoc jd = null;
		if (m instanceof BodyDeclaration) {
			jd = ((BodyDeclaration) m).getJavadoc();
		}
		start = uv.getLineNumber(m.getStartPosition());
		end = uv.getLineNumber(m.getStartPosition() + m.getLength() - 1);
		if (jd != null) {
			start = uv.getLineNumber(m.getStartPosition() + jd.getLength());
		}
		int tam = (end - start) + 1;
		return tam;
	}

	public boolean checkElement(ASTNode analyze) {
		int size = getSize(analyze);
		map.put(analyze, size);
		if (size < min || size > max) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		if (max == Integer.MAX_VALUE) {
			return "size [" + min + ".." + "*]";
		}
		return "size [" + min + ".." + max + "]";
	}

}
