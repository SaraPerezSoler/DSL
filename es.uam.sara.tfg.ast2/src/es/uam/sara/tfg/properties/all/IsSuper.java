/**
 * 
 */
package es.uam.sara.tfg.properties.all;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.properties.StringProperty;
import es.uam.sara.tfg.properties.type.TypeString;

/**
 * @author Sara
 *
 */
public abstract class IsSuper<T extends ClassInterface> extends StringProperty<T> {

	private Map<ClassInterface, List<JavaTypes>> classesExtended;
	private int intMin;
	private int intMax;
	private List<TypeString> nameSubContantes = null;
	private List<TypeString> nameSubVariable = null;
	/*
	 * a -> b :a toma el valor analyze, b toma el valor all 
	 * class->class :a is superClass of b
	 * inter->class/enum :a is implemented for b inter->inter :a is
	 * superInterface of b class->enum :XXXXXXX no es posible
	 */
	private boolean aIsInterface;
	private boolean bIsInterface;


	public IsSuper(boolean no,int min, int max, List<TypeString> subClass) {
		super(no);
		this.intMax = min;
		this.intMax = max;
		nameSubContantes = new ArrayList<TypeString>();
		nameSubVariable = new ArrayList<TypeString>();
		for (TypeString t: subClass){
			if (t.isVariable()){
				nameSubVariable.add(t);
			}else{
				nameSubContantes.add(t);
			}
		}
		classesExtended = new HashMap<ClassInterface, List<JavaTypes>>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public boolean checkElement(T td) {
		List<JavaTypes> sub = getSub(td);
		List<String> names=JavaTypes.getNames(sub);
		List<TypeString> nameSub= new ArrayList<TypeString>();
		nameSub.addAll(nameSubContantes);
		nameSub.addAll(nameSubVariable);
		classesExtended.put(td, sub);
		if (sub.size() >= this.intMin && sub.size() <= this.intMax) {
			for (TypeString s : nameSub) {
				if (!s.isTypeIn(names)) {
					return false;
				}
			}
			return true;
		}

		return false;

	}
	
	public String print(T t) {
		List<JavaTypes> subClass=classesExtended.get(t);
		String cad= "is super of:\n";
		if (subClass.isEmpty()){
			cad="";
		}
		for (JavaTypes jt: subClass){
			cad+="\t"+jt.toString()+"\n";
		}
		return t.toString()+ cad;
	}
	
	
	public void setString(String string, int i){
		nameSubVariable.get(i).setString(string);
	}
	public void deleteString(String string, int i){
		nameSubVariable.get(i).deleteString(string);
	}

	public abstract List<JavaTypes> getSub(T td);

	@Override
	public String toString() {
		
		String cad;
		if (no){
			cad="is not ";
		}else{
			cad="is ";
		}
		if (aIsInterface == false && bIsInterface == false) {
			cad += "superclass ";
		} else if (aIsInterface && bIsInterface == false) {
			cad += "implemented ";
		} else {
			cad += "superinterface ";
		}
		if (this.intMin != -1) {
			if (this.intMax != Integer.MAX_VALUE) {
				cad += "[" + intMin + "..*]";
			} else {
				cad += "[" + intMin + ".." + intMax + "]";
			}
		}
		List<TypeString> nameSub= new ArrayList<TypeString>();
		nameSub.addAll(nameSubContantes);
		nameSub.addAll(nameSubVariable);
		if (!nameSub.isEmpty()) {
			cad += "{";
			for (TypeString s : nameSub) {
				cad += s + " ";
			}
			cad += "}";
		}
		return cad;
	}

	public void setaIsInterface(boolean aIsInterface) {
		this.aIsInterface = aIsInterface;
	}

	public void setbIsInterface(boolean bIsInterface) {
		this.bIsInterface = bIsInterface;
	}
}
