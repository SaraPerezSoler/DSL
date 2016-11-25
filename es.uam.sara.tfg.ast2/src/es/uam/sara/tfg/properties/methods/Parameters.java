/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.properties.TypeProperty;

/**
 * @author Sara
 *
 */
public class Parameters extends MethodProperty implements TypeProperty {

	private int min;
	private int max;
	private List<String> paramList = null;

	public Parameters(boolean no,int min) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		paramList = new ArrayList<String>();
	}

	public Parameters(boolean no,int min, int max) {
		super(no);
		this.min = min;
		this.max = max;
		paramList = new ArrayList<String>();
	}

	public Parameters(boolean no,List<String> paramList) {
		super(no);
		this.min = paramList.size();
		this.max = Integer.MAX_VALUE;
		this.paramList = paramList;
	}

	public Parameters(boolean no,int min, List<String> paramList) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		this.paramList = paramList;
	}

	public Parameters(boolean no,int min, int max, List<String> paramList) {
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
		List<String> ok=new ArrayList<String>();
		if (params.size() >= min && params.size() <= max) {
			for (String s : paramList) {
				for (int i=0; i<params.size(); i++) {
					if (this.equalType(params.get(i), s)) {
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

}
