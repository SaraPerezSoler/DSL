/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

import es.uam.sara.tfg.properties.PropertiesException;

/**
 * @author Sara
 *
 */
public class Parametres extends Method {

	private int numParametres;
	private List<String> paramList;

	public Parametres(List<MethodDeclaration> analyze, int num) {
		super(analyze);
		numParametres = num;
		paramList = null;
	}

	/**
	 * @param analyze
	 */
	public Parametres(List<MethodDeclaration> analyze, List<String> param) {
		super(analyze);
		numParametres = param.size();
		paramList = param;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check() {
		try {
			for (MethodDeclaration m : super.analyze) {
				if (m.parameters().size() != numParametres) {
					super.addWrong(m);
				} else if (comparaParam(m.parameters())) {
					super.addRight(m);
				} else {
					super.addWrong(m);
				}
			}
		} catch (PropertiesException e) {
			e.printStackTrace();
		}
	}

	private boolean comparaParam(List<SingleVariableDeclaration> parameters) {
		if (paramList==null){
			return true;
		}
		List<String> copia= copia(paramList);
		for (SingleVariableDeclaration s: parameters){
			String nombre=s.getType().toString();
			if (copia.contains(nombre)){
				copia.remove(nombre);
			}else{
				return false;
			}
		}
		return true;
	}
	
	private List<String> copia(List<String> paramList2){
		List<String> listanueva= new ArrayList<String>();
		for (String s: paramList2){
			listanueva.add(s);
		}
		return listanueva;
	}

}
