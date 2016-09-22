package es.uam.sara.tfg.rule;

import java.util.List;

public class Filter<T> extends Or<T> {

	boolean no;
	public Filter(boolean no,List<T> analyce) {
		super(analyce);
		this.no=no;
	}
	public List<T> filter(){
		if (no){
			return this.getWrong();
		}
		return this.getRight();
	}
}
