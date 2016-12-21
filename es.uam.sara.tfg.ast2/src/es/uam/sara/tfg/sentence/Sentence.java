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
	protected Or<T> filter;
	protected Map<String, IElements> using= new HashMap<String, IElements>();;
	//protected List<String> using= new ArrayList<String>();
	private List<T> elements;
	protected List<In<T>> in;
	protected In<T> from=null;
	public static Map<String, Variable<? extends IElements>> allVariables= new HashMap<String, Variable<? extends IElements>>();


	public Sentence(String elementJava,List<T> elements, Or<T> satisfy, Or<T> filter) {
		super();
		this.ielement = elementJava;
		this.elements=elements;
		in=new ArrayList<In<T>>();
		if (filter == null) {
			this.filter = new NoOr<T>();
		} else {
			this.filter = filter;
		}
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
	
	public void reset(List<T> elements, List<T> right, List<T> wrong){
		this.elements=elements;
		satisfy.reset(right, wrong);
	}

	public void setIn(List<T> elements, String name){
		in.add(new In<T>(elements, name));
	}
	public void setUsing(String s, IElements element){
		using.put(s, element);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getRight(){
		return (List<T>) ((ArrayList<T>)satisfy.getRight()).clone();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getWrong() {
		return (List<T>) ((ArrayList<T>)satisfy.getWrong()).clone();
	}
	/*public List<Map<String, IElements>> getUsing(){
		List<Map<String, IElements>> ret= new ArrayList<Map<String,IElements>>();
		for (int i=0;i<using.size(); i++){
			ret.add(new HashMap<String, IElements>());
		}
		return getUsing(0, 0, ret);
	}
	
	public List<Map<String, IElements>> getUsing(int i, int k, List<Map<String, IElements>> ret){
		List<? extends IElements> list=allVariables.get(using.get(i)).get();
		for (IElements e: list){
			ret.get(k).put(using.get(i), e);
			getUsing(++i, k, ret);
			k++;
		}
		return ret;
	}*/
	
	public void setFrom(String name, List<T> elements){
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
	public void analize(){

		List<T> analyze = this.getElements();
		filter.reset();
		if (filter.needVariables()) {
			filter.setUsing(using);
		}
		
		filter.check(analyze);
		analyze = filter.getRight();
		if (satisfy.needVariables()) {
			satisfy.setUsing(using);
		}
		satisfy.check(analyze);
	}
	
	public boolean needVariabes() {
		return this.satisfy.needVariables();
	}
	public abstract String log();
	
}
