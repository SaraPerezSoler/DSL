package es.uam.sara.tfg.sentence;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.elements.IElements;

public class In<T extends IElements> {

	private List<T> elements;
	public In(List<T> element) {
		this.elements=element;
	}
	
	public List<T> getUnion(List<T> other){
		List<T> ret= new ArrayList<T>();
		for (T o: other){
			if(elements.contains(o)){
				ret.add(o);
			}
		}
		return ret;
	}
}
