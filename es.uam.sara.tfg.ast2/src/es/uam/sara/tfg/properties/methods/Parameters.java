/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.properties.StringProperty;

/**
 * @author Sara
 *
 */
public class Parameters extends StringProperty<MMethod>{

	private int min;
	private int max;
	private List<es.uam.sara.tfg.properties.type.Type> paramListContantes = null;
	private List<es.uam.sara.tfg.properties.type.Type> paramListVariable = null;

	public Parameters(boolean no,int min) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		paramListContantes = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		paramListVariable = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
	}

	public Parameters(boolean no,int min, int max) {
		super(no);
		this.min = min;
		this.max = max;
		paramListContantes = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		paramListVariable = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
	}

	public Parameters(boolean no,List<es.uam.sara.tfg.properties.type.Type> paramList) {
		super(no);
		this.min = paramList.size();
		this.max = Integer.MAX_VALUE;
		paramListContantes = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		paramListVariable = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		for (es.uam.sara.tfg.properties.type.Type t: paramList){
			if (t.isVariable()){
				paramListVariable.add(t);
			}else{
				paramListContantes.add(t);
			}
		}
	}

	public Parameters(boolean no,int min, List<es.uam.sara.tfg.properties.type.Type> paramList) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		paramListContantes = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		paramListVariable = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		for (es.uam.sara.tfg.properties.type.Type t: paramList){
			if (t.isVariable()){
				paramListVariable.add(t);
			}else{
				paramListContantes.add(t);
			}
		}
	}

	public Parameters(boolean no,int min, int max, List<es.uam.sara.tfg.properties.type.Type> paramList) {
		super(no);
		this.min = min;
		this.max = max;
		paramListContantes = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		paramListVariable = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		for (es.uam.sara.tfg.properties.type.Type t: paramList){
			if (t.isVariable()){
				paramListVariable.add(t);
			}else{
				paramListContantes.add(t);
			}
		}
	}

	@Override
	public String toString() {
		String cad;
		if (max != Integer.MAX_VALUE) {
			cad = "num parametres: [" + min + "..*]";
		} else {
			cad = "num parametres: [" + min + ".." + max + "]";
		}
		if (!paramListContantes.isEmpty() || !paramListVariable.isEmpty()) {
			cad += "and contains [";
			for (es.uam.sara.tfg.properties.type.Type t:paramListContantes){
				cad+=t.toString();
			}
			for (es.uam.sara.tfg.properties.type.Type t:paramListVariable){
				cad+=t.toString();
			}
			cad += "]";
		}
		if (no){
			return "no (" + cad+")";
		}
		return cad;
	}

	@Override
	public boolean checkElement(MMethod analyze) {
		List<Type> params = analyze.getParametersType();
		List<es.uam.sara.tfg.properties.type.Type> paramList = new ArrayList<es.uam.sara.tfg.properties.type.Type>();
		paramList.addAll(paramListContantes);
		paramList.addAll(paramListVariable);
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
	public void setString(String string,int i) {
		paramListVariable.get(i).setString(string);
	}

	@Override
	public void deleteString(String string, int i) {
		paramListVariable.get(i).deleteString(string);
	}

}
