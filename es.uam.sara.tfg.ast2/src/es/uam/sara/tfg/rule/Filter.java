package es.uam.sara.tfg.rule;

import java.util.List;

public class Filter<T> extends Or<T> {

	boolean no;
	public Filter(boolean no) {
		super();
		this.no=no;
	}
	public List<T> getFiltering(){
		if (no){
			return this.getWrong();
		}
		return this.getRight();
	}
}
