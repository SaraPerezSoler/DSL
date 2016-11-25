package es.uam.sara.tfg.properties.all;

import java.util.HashMap;
import java.util.Map;
import es.uam.sara.tfg.elements.IPosicionable;
import es.uam.sara.tfg.properties.Properties;


public class Size<T extends IPosicionable> extends Properties<T>{

	private int max, min;
	private Map<IPosicionable, Integer> map;

	public Size(int min, int max) {
		this.max = max;
		this.min = min;
		map = new HashMap<IPosicionable, Integer>();
	}

	public int getSize(IPosicionable analyze) {
		
		int start = analyze.getStartLine();
		int end = analyze.getEndLine();
		int tam = (end - start) + 1;
		return tam;
	}
	@Override
	public boolean checkElement(T analyze) {
		int size = getSize(analyze);
		map.put(analyze, size);
		if (size < min || size > max) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		if (max == Integer.MAX_VALUE) {
			return "size [" + min + ".." + "*]";
		}
		return "size [" + min + ".." + max + "]";
	}
}
