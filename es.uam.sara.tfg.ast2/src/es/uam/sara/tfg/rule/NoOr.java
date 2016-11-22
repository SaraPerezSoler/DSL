package es.uam.sara.tfg.rule;
import java.util.ArrayList;
import java.util.List;

public class NoOr<T> extends Filter<T> {

	public NoOr() {
		super(false);
		// TODO Auto-generated constructor stub
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
