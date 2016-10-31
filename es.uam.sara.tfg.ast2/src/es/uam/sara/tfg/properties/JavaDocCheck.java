package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;

public class JavaDocCheck {

	private boolean author;
	private boolean parameter;
	private boolean returns;
	private boolean version;
	private boolean throwss;
	private boolean see;

	public JavaDocCheck(boolean author, boolean parameter, boolean returns, boolean version, boolean throwss,
			boolean see) {
		this.author = author;
		this.parameter = parameter;
		this.returns = returns;
		this.version = version;
		this.throwss = throwss;
		this.see = see;

	}

	public boolean javaDoc(Javadoc j) {

		if (j == null)
			return false;
		else {
			ArrayList<TagElement> tags = new ArrayList<TagElement>();
			for (Object t : j.tags()) {
				if (t instanceof TagElement) {
					tags.add((TagElement) t);
				}
			}
			if (author) {
				if (buscar("@author", tags) == false)
					return false;
			}
			if (parameter) {
				if (buscar("@parameter", tags) == false)
					return false;
			}
			if (returns) {
				if (buscar("@returns", tags) == false)
					return false;
			}
			if (version) {
				if (buscar("@version", tags) == false)
					return false;
			}
			if (throwss) {
				if (buscar("@throws", tags) == false)
					return false;
			}
			if (see) {
				if (buscar("@see", tags) == false)
					return false;
			}
		}
		return true;
	}

	private boolean buscar(String tag, ArrayList<TagElement> list) {
		for (TagElement t : list) {
			if (t.getTagName() != null) {
				if (t.getTagName().compareTo(tag) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String cad = "JavaDoc ";
		if (author) {
			cad += "@author ";
		}
		if (parameter) {
			cad += "@parameter ";
		}
		if (returns) {
			cad += "@returns ";
		}
		if (version) {
			cad += "@version ";
		}
		if (throwss) {
			cad += "@throwss ";
		}
		if (see) {
			cad += "@see ";
		}
		return cad;
	}

}
