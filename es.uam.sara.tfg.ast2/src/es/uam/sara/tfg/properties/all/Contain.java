package es.uam.sara.tfg.properties.all;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Properties;
import es.uam.sara.tfg.rule.Rule;

public abstract class Contain<K extends Container, T extends IElements> extends Properties<K> {

	private Rule<T> rule;
	private Map<Container, String> map;

	public Contain(Rule<T> r) {
		rule = r;
		map = new HashMap<Container, String>();
	}

	public boolean checkElement(Container analyze, List<T> subTypes) {
		rule.reset(subTypes);
		boolean ret = rule.checkTest();
		map.put(analyze, rule.log());
		return ret;
	}

	public String print(K print) {
		return super.print(print) + "{\n\t" + map.get(print).replace("\n", "\n\t") + "\n}\n";

	}

	public abstract List<T> getSubType(Container t);

	@Override
	public String toString() {
		return "have {" + rule + "}";
	}

	@Override
	public boolean checkElement(K analyze) {

		return checkElement(analyze, getSubType(analyze));

	}
}
