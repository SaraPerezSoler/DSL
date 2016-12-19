package es.uam.sara.tfg.sentence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.uam.sara.tfg.elements.IElements;

public abstract class Sentence<T extends IElements> {

	protected String ielement;
	protected Or<T> satisfy;
	protected Map<String, IElements> using;
	private List<T> elements;
	protected List<In<T>> in;
	protected In<T> from=null;
	public static Map<String, Variable<? extends IElements>> allVariables= new HashMap<String, Variable<? extends IElements>>();
	

	public Sentence(String elementJava,List<T> elements, Or<T> satisfy) {
		super();
		this.ielement = elementJava;
		this.elements=elements;
		in=new ArrayList<In<T>>();
		using= new HashMap<String, IElements>();
		if (satisfy==null){
			this.satisfy= new NoOr<T>();
		}else{
			this.satisfy = satisfy;
		}
	}
	
	public List<T> getElements(){
		List<T> analyze=this.elements;
		if (from!=null){
			analyze=from.getElements();
		}
		for (In<T> i: in){
			analyze= i.getUnion(analyze);
		}
		return analyze;
	}
	
	public void reset(List<T> elements){
		this.elements=elements;
		satisfy.reset();
	}

	public void setIn(List<T> elements, String name){
		in.add(new In<T>(elements, name));
	}
	public void setUsing(String s, IElements e){
		using.put(s, e);
	}
	public void setFrom(List<T> elements,  String name){
		from=new In<T>(elements, name);
	}
	

	public static Map<String, List<IElements>> copiar(Map<String, List<IElements>> var){
		Map<String, List<IElements>> copiar= new HashMap<String, List<IElements>>();
		Set<String> set= var.keySet();
		for (String s: set){
			copiar.put(s, var.get(s));
		}
		return copiar;
		
	}
	
	public abstract boolean check();
	
	public boolean needVariabes() {
		return this.satisfy.needVariables();
	}
	
}
