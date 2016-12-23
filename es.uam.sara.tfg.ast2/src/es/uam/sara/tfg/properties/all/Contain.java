package es.uam.sara.tfg.properties.all;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Property;
import es.uam.sara.tfg.sentence.Rule;
import es.uam.sara.tfg.sentence.RuleSave;

public abstract class Contain<K extends Container, T extends IElements> extends Property<K> {

	private Rule<T> rule;
	private Map<Container, String> map;
	private Map<Container, RuleSave<T>> save;


	public Contain(boolean no, Rule<T> r) {
		super(no);
		rule = r;
		map = new HashMap<Container, String>();
		save=new HashMap<Container, RuleSave<T>>();
	}

	public boolean checkElement(Container analyze, List<T> subTypes) {
		RuleSave<T> rsave=save.get(analyze);
		if (rsave==null){
			rsave= new RuleSave<T>();
		}
		rule.reset(subTypes, rsave);
		rule.analize();
		boolean ret = rule.check();
		save.put(analyze, rule.save());
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
	
	public void addRight(K t) {
		if (!this.getRight().contains(t)) {
			this.getRight().add(t);
		}
		if (this.getWrong().contains(t)) {
			this.getWrong().remove(t);
		}
	}

	public void addWrong(K t) {
		if (!this.getWrong().contains(t)) {
			this.getWrong().add(t);
		}
		if (this.getRight().contains(t)){
			this.getRight().remove(t);
		}
	}
	
	public boolean isChangeForContains() {
		return true;
	}
}
