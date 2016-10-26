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
	@Override
	public String toString() {
		if(no){
			return "no "+super.toString();
		}else{
			return super.toString();
		}
		
	}
	
}
