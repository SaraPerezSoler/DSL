package es.uam.sara.tfg.properties.type;

import java.util.List;

public class TypeString implements Type{
	private String type;
	private boolean variable;
	
	public TypeString(String type) {
		this.type=type;
		variable=false;
		
	}
	public TypeString() {
		variable=true;
	}
	
	public boolean equals(Object other){
		boolean ret=false;
		if (other instanceof TypeString){
			ret=((TypeString) other).type.compareToIgnoreCase(type)==0;
		}
		return ret;
	}
	public boolean compare(org.eclipse.jdt.core.dom.Type other){
		List<String> strings= this.getString(other);
		return strings.contains(type.toLowerCase());
	}
	public boolean isTypeIn(List<org.eclipse.jdt.core.dom.Type> list){
		
	}
	public boolean isVariable(){
		return variable;
	}
	@Override
	public String getString() {
		return type;
	}
	@Override
	public void setString(String s) {
		if (this.isVariable()){
			this.type=s;
		}
	}
	@Override
	public void deleteString(String s) {
		if (this.variable){
			if (this.type.equals(s)){
				this.type=null;
			}
		}
		
	}
}
