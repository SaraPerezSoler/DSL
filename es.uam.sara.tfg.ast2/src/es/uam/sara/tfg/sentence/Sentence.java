package es.uam.sara.tfg.sentence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.uam.sara.tfg.elements.IElements;

public abstract class Sentence<T extends IElements> {

	protected String ielement;
	protected Or<T> satisfy;
	protected String from;
	protected List<T> elements;
	protected String in;
	public static Map<String, Variable<IElements>> allVariables= new HashMap<String, List<IElements>>();
	

	public Sentence(String elementJava,List<T> elements, Or<T> satisfy,From<T> from, List<In<T>> in) {
		super();
		this.ielement = elementJava;
		this.elements=elements;
		this.from=from;
		this.in = in;
		if (satisfy==null){
			this.satisfy= new NoOr<T>();
		}else{
			this.satisfy = satisfy;
		}
	}

	public Map<String, List<IElements>> getAllVariables() {
		return allVariables;
	}
	
	public static Map<String, List<IElements>> copiar(Map<String, List<IElements>> var){
		Map<String, List<IElements>> copiar= new HashMap<String, List<IElements>>();
		Set<String> set= var.keySet();
		for (String s: set){
			copiar.put(s, var.get(s));
		}
		return copiar;
		
	}
	
}
