/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.properties.StringProperty;
import es.uam.sara.tfg.properties.type.TypeString;

/**
 * @author Sara
 *
 */
public class Parameters extends StringProperty<Method>{

	private int min;
	private int max;
	private List<es.uam.sara.tfg.properties.type.Type> paramList = null;

	public Parameters(boolean no,int min) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		paramList = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
	}

	public Parameters(boolean no,int min, int max) {
		super(no);
		this.min = min;
		this.max = max;
		paramList = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
	}

	public Parameters(boolean no,List<es.uam.sara.tfg.properties.type.Type> paramList) {
		super(no);
		this.min = paramList.size();
		this.max = Integer.MAX_VALUE;
		this.paramList = paramList;
	}

	public Parameters(boolean no,int min, List<es.uam.sara.tfg.properties.type.Type> paramList) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		this.paramList = paramList;
	}

	public Parameters(boolean no,int min, int max, List<es.uam.sara.tfg.properties.type.Type> paramList) {
		super(no);
		this.min = min;
		this.max = max;
		this.paramList = paramList;
	}

	@Override
	public String toString() {
		String cad;
		if (max != Integer.MAX_VALUE) {
			cad = "num parametres: [" + min + "..*]";
		} else {
			cad = "num parametres: [" + min + ".." + max + "]";
		}
		if (!paramList.isEmpty()) {
			cad += "and contains [";

			cad += "]";
		}
		if (no){
			return "no (" + cad+")";
		}
		return cad;
	}

	@Override
	public boolean checkElement(Method analyze) {
		List<Type> params = analyze.getParametersType();
		List<es.uam.sara.tfg.properties.type.Type> ok=new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		if (params.size() >= min && params.size() <= max) {
			for (es.uam.sara.tfg.properties.type.Type s : paramList) {
				for (int i=0; i<params.size(); i++) {
					if (s.compare(params.get(i))) {
						params.remove(i);
						ok.add(s);
						break;
					}
				}
			}
			if (paramList.size()== ok.size()){
				return true;
			}
		}
		return false;
	}

	@Override
	public void setString(String string) {
		es.uam.sara.tfg.properties.type.Type nuevo= new TypeString(string, true);
		this.paramList.add(nuevo);
	}

	@Override
	public void deleteString(String string) {
		for (es.uam.sara.tfg.properties.type.Type t: this.paramList){
			if (t.getString().equals(string)){
				this.paramList.remove(t);
				return;
			}
		}
	}

}
