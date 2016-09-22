package es.uam.sara.tfg.rule;

import java.util.ArrayList;
import java.util.List;
import es.uam.sara.tfg.properties.Properties;

public class Or<T> extends Properties<T>{

	protected List <And<T>> ands;
		
	public Or(List<T> analyce) {
		super(analyce);
		ands= new ArrayList<And<T>>();
	}

	public void addAnd(And<T> a){
		ands.add(a);
	}
	
	public void check() {
		for (And<T> a: ands){
			a.check();
			removeAllRight(a.getRight());
			addAllRight(a.getRight());
		}
		addAllWrong(getAnalyze());
		removeAllWrong(getRight());
	}

}
