package es.uam.sara.tfg.sentence;

import java.util.List;
import java.util.Set;

import es.uam.sara.tfg.elements.IElements;

public class Variable<T extends IElements> extends Sentence<T> {
	private String name;

	public Variable(String elementJava, List<T> elements, Or<T> satisfy, String name) {
		super(elementJava, elements, satisfy);
		this.name=name;
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

	@Override
	public String log() {
		String cad=  toString() + "\n" + "Checked: The variable "+name+" have "+satisfy.getRight().size()+" elements\n";
		for (IElements e: satisfy.getRight()){
			cad+="\t"+e.toString();
		}
		return cad;
	}
	
	@Override
	public String toString() {
		String cad = name+": ";
		
		cad += ielement;
		
		if (this.from!=null){
			cad+=" from "+this.from.getName();
		}
		String in=" in ";
		for (In<T> i: this.in){
			cad+=in+i.getName();
			in=", ";
		}
		String using=" using ";
		Set<String> us= this.using.keySet();
		for (String u: us){
			cad+=using+u;
			using=", ";
		}
		if (!(satisfy.isNoProperty())) {
			cad += " satisfy " + satisfy + " ";
		}
		return cad;
	}

}
