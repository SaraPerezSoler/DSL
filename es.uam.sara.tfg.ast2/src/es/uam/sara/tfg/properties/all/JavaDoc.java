package es.uam.sara.tfg.properties.all;

import java.util.ArrayList;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;

import es.uam.sara.tfg.elements.JavaElement;
import es.uam.sara.tfg.properties.Property;

public class JavaDoc<T extends JavaElement>  extends Property<T>{

	private boolean author;
	private boolean parameter;
	private boolean returns;
	private boolean version;
	private boolean throwss;
	private boolean see;

	public JavaDoc(boolean no,boolean author, boolean parameter, boolean returns, boolean version, boolean throwss,
			boolean see) {
		super(no);
		this.author = author;
		this.parameter = parameter;
		this.returns = returns;
		this.version = version;
		this.throwss = throwss;
		this.see = see;

	}

	@Override
	public boolean checkElement(T analyze) {
		Javadoc j= analyze.getJavadoc();
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
		String cad;
		if (no){
			cad= "have not JavaDoc ";
		}else{
			cad = "have JavaDoc ";
		}
		String open="[";
		String close="";
		if (author) {
			cad += open+ "@author ";
			open="";
			close="]";
		}
		if (parameter) {
			cad +=open+ "@parameter ";
			open="";
			close="]";
		}
		if (returns) {
			cad +=open+ "@returns ";
			open="";
			close="]";
		}
		if (version) {
			cad += open+"@version ";
			open="";
			close="]";
		}
		if (throwss) {
			cad +=open+ "@throwss ";
			open="";
			close="]";
		}
		if (see) {
			cad +=open+ "@see ";
			open="";
			close="]";
		}
		cad+=close;
		return cad;
	}

}
