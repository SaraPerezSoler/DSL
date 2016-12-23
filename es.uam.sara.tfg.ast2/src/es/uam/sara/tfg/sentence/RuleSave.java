package es.uam.sara.tfg.sentence;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.elements.IElements;

public class RuleSave<T extends IElements> {

	private List<List<T>> rights;
	private List<List<T>> wrongs;
	
	public RuleSave() {
		rights=new ArrayList<List<T>>();
		wrongs= new ArrayList<List<T>>();
	}
	
	@SuppressWarnings("unchecked")
	public void save(int i, List<T> right, List<T> wrong) {
		rights.add(i, (List<T>) ((ArrayList<T>)right).clone());
		wrongs.add(i, (List<T>) ((ArrayList<T>)wrong).clone());
	}
	
	public List<T> getRight(int i) {
		if (rights.size()<=i){
			return new ArrayList<T>();
		}
		List<T> ret= rights.get(i);
		return ret;
	}
	public List<T> getWrong(int i) {
		if (wrongs.size()<=i){
			return new ArrayList<T>();
		}
		List<T> ret=wrongs.get(i);
		return ret;
	}
	
	
}
