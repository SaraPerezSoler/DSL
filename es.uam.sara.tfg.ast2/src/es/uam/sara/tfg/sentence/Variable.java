package es.uam.sara.tfg.sentence;

import java.util.List;

import es.uam.sara.tfg.elements.IElements;

public class Variable<T extends IElements> extends Sentence<T> {

	public Variable(String elementJava, List<T> elements, Or<T> satisfy) {
		super(elementJava, elements, satisfy);
	}

	public boolean check() {
		List<T> analyze=super.getElements();
		if (satisfy.needVariables()){
			satisfy.setUsing(using);
		}
		satisfy.check(analyze);
		return true;
	}

	public List<T> get() {
		return satisfy.getRight();
	}

}
