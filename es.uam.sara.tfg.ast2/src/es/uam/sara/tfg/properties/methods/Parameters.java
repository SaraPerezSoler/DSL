/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;


/**
 * @author Sara
 *
 */
public class Parameters extends Method{

	private int numParametres;
	private List<String> paramList;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check(List<MethodDeclaration> analyze) {
		for (MethodDeclaration m : analyze) {
			if (m.parameters().size() != numParametres) {
				super.addWrong(m);
			} else if (comparaParam(getList(m.parameters()))) {
				super.addRight(m);
			} else {
				super.addWrong(m);
			}
		}
	}
	private List<SingleVariableDeclaration> getList(List<?> lista){
		List<SingleVariableDeclaration> list= new ArrayList<SingleVariableDeclaration>();
		for (Object a:lista){
			if (a instanceof SingleVariableDeclaration){
				list.add((SingleVariableDeclaration) a);
			}
		}
		return list;
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
