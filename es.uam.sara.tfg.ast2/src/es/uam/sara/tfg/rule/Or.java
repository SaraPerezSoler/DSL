package es.uam.sara.tfg.rule;

import java.util.ArrayList;
import java.util.List;
import es.uam.sara.tfg.properties.Properties;

public class Or<T> extends Properties<T>{

	protected List <And<T>> ands;
		
	public Or() {
		super();
		ands= new ArrayList<And<T>>();
	}

	public void addAnd(And<T> a){
		ands.add(a);
	}
	
	public void check(List<T> analyze) {
		
		for (And<T> a: ands){
			a.check(analyze);
			removeAllRight(a.getRight());
			addAllRight(a.getRight());
		}
		addAllWrong(analyze);
		removeAllWrong(getRight());
	}

}
