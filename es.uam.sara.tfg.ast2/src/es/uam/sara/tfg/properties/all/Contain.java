package es.uam.sara.tfg.properties.all;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Property;
import es.uam.sara.tfg.sentence.Rule;

public abstract class Contain<K extends Container, T extends IElements> extends Property<K> {

	private Rule<T> rule;
	private Map<Container, String> map;
	private Map<Container, List<T>> rightMap;
	private Map<Container, List<T>> wrongMap;

	public Contain(boolean no, Rule<T> r) {
		super(no);
		rule = r;
		map = new HashMap<Container, String>();
		rightMap=new HashMap<Container, List<T>>();
		wrongMap= new HashMap<Container, List<T>>();
	}

	public boolean checkElement(Container analyze, List<T> subTypes) {
		List<T> rList=rightMap.get(analyze);
		if (rList==null){
			rList= new ArrayList<T>();
		}
		List<T> wList=wrongMap.get(analyze);
		if (wList==null){
			wList=new ArrayList<T>();
		}
		
		rule.reset(subTypes,rList ,wList );
		rule.analize();
		boolean ret = rule.check();
		rightMap.put(analyze, rule.getRight());
		wrongMap.put(analyze, rule.getWrong());
		map.put(analyze, rule.log());
		
		return ret;
	}

	public String print(K print) {
		return super.print(print) + "{\n\t" + map.get(print).replace("\n", "\n\t") + "\n}\n";

	}

	public abstract List<T> getSubType(Container t);

	@Override
	public String toString() {
		if (no){
			return "don't have {" + rule + "}";
		}else{
			return "have {" + rule + "}";
		}
	}

	@Override
	public boolean checkElement(K analyze) {

		return checkElement(analyze, getSubType(analyze));

	}
	public boolean needVariables() {
		return rule.needVariabes();
	}
	
	public void setUsing(Map<String, IElements> using) {
		Set<String> keys= using.keySet();
		
		for (String k: keys){
			rule.setUsing(k, using.get(k));
		}
		super.setUsing(using);
	}
}
