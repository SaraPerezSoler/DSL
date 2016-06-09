package es.uam.sara.tfg.ast.properties;

import java.util.ArrayList;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;

public class JavaDocPropertie {

	private boolean author;
	private boolean parameter;
	private boolean returns;
	private boolean version;
	private boolean throwss;
	private boolean see;
	
	
	public JavaDocPropertie (boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see){
		this.author=author;
		this.parameter=parameter;
		this.returns=returns;
		this.version=version;
		this.throwss=throwss;
		this.see=see;
		
	}
	
	public String generateStringPropertie(){
		String res="javaDoc ";
		if (author){res=res+ "@author ";}
		if (parameter){res=res+ "@parameter ";}
		if (returns){res=res+ "@returns ";}
		if (version){res=res+ "@version ";}
		if (throwss){res=res+ "@throws ";}
		if (see){res=res+ "@see ";}
		return res;
	}
	
	public boolean javaDoc(Javadoc j){
		
		if (j==null)
			return false;
		else {
			ArrayList<TagElement> tags=new ArrayList<TagElement>();
			for (Object t: j.tags()){
				if (t instanceof TagElement){
					tags.add((TagElement) t);
				}
			}
			if (author){
				if (bucar("@author", tags)==false) return false;
			}
			if (parameter){
				if (bucar("@parameter", tags)==false) return false;
			}
			if (returns){
				if (bucar("@returns", tags)==false) return false;
			}
			if (version){
				if (bucar("@version", tags)==false) return false;
			}
			if (throwss){
				if (bucar("@throws", tags)==false) return false;
			}
			if (see){
				if (bucar("@see", tags)==false) return false;
			} 
		}
		return true;
	}
	
	private boolean bucar(String tag, ArrayList<TagElement> list){
		for (TagElement t: list){
			if (t.getTagName().compareTo(tag)==0){
				return true;
			}
		}
		return false;
	}
	
}
