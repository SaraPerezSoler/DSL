/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.ArrayList;
import java.util.List;
import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.properties.TypeToString;


/**
 * @author Sara
 *
 */
public class Parameters extends MethodProperty{

	private int numParametres;
	private List<String> paramList=null;

	public Parameters(int num) {
		super();
		numParametres = num;
		paramList = null;
	}

	/**
	 * @param analyze
	 */
	public Parameters(List<String> param) {
		super();
		numParametres = param.size();
		paramList = param;
	}


	private boolean comparaParam(List<String> parameters) {
		if (paramList==null){
			return true;
		}
		List<String> copia= copia(paramList);
		for (String nombre: parameters){
			if (copia.contains(nombre.toLowerCase())){
				copia.remove(nombre.toLowerCase());
			}else{
				return false;
			}
		}
		return true;
	}
	
	private List<String> copia(List<String> paramList2){
		List<String> listanueva= new ArrayList<String>();
		for (String s: paramList2){
			listanueva.add(s.toLowerCase());
		}
		return listanueva;
	}

	@Override
	public String toString() {
		if (paramList==null){
			return "numParametres=" + numParametres;
		}else{
			return "numParametres=" + numParametres +" and types= "+ paramList;
		}
	}

	@Override
	public boolean checkElement(Method analyze) {
		if (analyze.getBodyDeclarations().parameters().size() != numParametres) {
			return false;
		} else if (comparaParam(TypeToString.getString(analyze.getBodyDeclarations().parameters()))) {
			return true;
		} else {
			return false;
		}
	}

}
