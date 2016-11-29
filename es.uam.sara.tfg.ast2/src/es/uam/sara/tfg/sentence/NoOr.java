package es.uam.sara.tfg.sentence;
import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.elements.IElements;

public class NoOr<T extends IElements> extends Or<T> {

	public NoOr() {
		super();
	}
	
	public String print(boolean right) {
		List<T> print;
		String cad="";
		if (right){
			print=this.getRight();
		}else{
			print=new ArrayList<T>();
		}

		for (T t : print) {
			cad+=print(t);
		}
		return cad;
	}

	@Override
	public void check(List<T> elem){
		this.addAllRight(elem);
	}

	public boolean isNoProperty(){
		return true;
	}
}
