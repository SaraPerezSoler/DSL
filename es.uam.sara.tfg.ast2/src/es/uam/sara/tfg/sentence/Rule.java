package es.uam.sara.tfg.sentence;

import java.util.List;
import java.util.Map;
import java.util.Set;

import es.uam.sara.tfg.elements.IElements;

public class Rule<T extends IElements> extends Sentence<T>{

	protected boolean no;
	protected Quantifier quantifier;
	protected Or<T> filter;

	private boolean checkeado = false;
	private boolean check = false;
	

	public interface Apply{
		public boolean apply(List<?> lista, int total);
	}
	public enum Quantifier implements Apply{
		ALL{
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size()==total){
					return true;
				}
				return false;
			}
		}, ONE{
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size()==1){
					return true;
				}
				return false;
			}
		}
		, EXISTS{
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size()>=1){
					return true;
				}
				return false;
			}
		},
	}

	public Rule(boolean no, Quantifier q,List<T> elements, Or<T> filter,Or<T> satisfy,From<T> from, List<In<T>> in,String elemntJava) {
		
		super(elemntJava,elements, satisfy,from, in);
		this.no = no;
		this.quantifier = q;
		if (filter==null){
			this.filter= new NoOr<T>();
		}else{
			this.filter = filter;
		}
		
	}

	public void reset(List<T> elements) {
		this.elements = elements;
		filter.reset();
		satisfy.reset();
		checkeado = false;
	}

	public boolean checkTest() {
		if (!checkeado) {
			List<T>analyze=this.elements;
			
			for(In<T> i:in){
				analyze=i.getUnion(analyze);
			}
			filter.check(analyze);
			analyze=filter.getRight();
			satisfy.check(analyze);
			
			if (no) {
				check= !quantifier.apply(satisfy.getRight(), analyze.size());
			} else {
				check= quantifier.apply(satisfy.getRight(), analyze.size());
			}
			checkeado = true;
		}
		
		return check;
	}

	@Override
	public String toString() {
		String cad = "";
		if (no) {
			cad += "no ";
		}
		
		cad += this.quantifier.toString().toLowerCase() + " " + ielement;
		if (!(filter.isNoProperty())) {
			cad += " which " + filter;
		}
		if (!(satisfy.isNoProperty())) {
			cad += " satisfy " + satisfy + " ";
		}
		return cad;
	}

	public String printWrong() {
		if (checkeado) {
			if (no) {
				return satisfy.print(true);
			} else {
				return satisfy.print(false);
			}
		}
		return "";
	}
	private List<Map<String, IElements>> getElements(int index,Map<String, List<IElements>> var){
		String[] keys=new String[var.keySet().size()];
		keys=var.keySet().toArray(keys);
		if (index>=keys.length){
			return null;
		}
		List<Map<String, IElements>> ret=getElements(index+1, var);
		for (IElements e: var.get(keys[index])){
		}		
		return null;
	}

	public String printRight() {
		if (checkeado) {
			if (no) {
				return satisfy.print(false);
			} else {
				return satisfy.print(true);
			}
		} else {
			return "";
		}
	}

	public String log() {
		if (checkeado) {
			String cad = toString() + "\n" + "Checked.....";	
			if (check) {
				cad += "OK\n";
			} else {
				cad += "ERROR\n";
			}
			if (satisfy.isNoProperty()){
				cad+=this.printWrong().replace("\n", "\n\t")+this.printRight().replace("\n", "\n\t");
			}else{
				cad += "WRONG: \n\t" + this.printWrong().replace("\n", "\n\t")+"\n";
				cad += "RIGHT: \n\t" + this.printRight().replace("\n", "\n\t")+"\n";
			}return cad;
		} else {
			return toString() + "Rule is not checked\n";
		}

	}

}
