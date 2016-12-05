package es.uam.sara.tfg.properties;

import java.util.List;

import es.uam.sara.tfg.elements.IElements;

public class PropertyStringVariable<T extends IElements,K extends StringProperty<T>> extends Property<T>{
	
	
	public enum StringType {
		NAME, TYPE
		
	};
	private K property;
	private List<String> variableName;
	private List<StringType> string;
	public PropertyStringVariable(boolean no, List<String> variableName, List<StringType> type, K property) {
		super(no);
		this.variableName=variableName;
		this.string=type;
		this.property=property;
	}
	
	public boolean needVariables() {
		return true;
	}
	
	@Override
	public boolean checkElement(T analyze) {
		String newString;
		
		for (int i=0; i<variableName.size(); i++){
			IElements var=this.using.get(variableName.get(i));
			if (string.get(i)==StringType.NAME){
				newString=var.getName();
			}else{
				newString=var.getStringType();
			}
			property.setString(newString, i);
		}
		
		boolean ret= property.checkElement(analyze);
		
		for (int i=0; i<variableName.size(); i++){
			IElements var=this.using.get(variableName.get(i));
			if (string.get(i)==StringType.NAME){
				newString=var.getName();
			}else{
				newString=var.getStringType();
			}
			property.deleteString(newString, i);
		}
		return ret;
	}

	@Override
	public String toString() {
		for (int i=0; i<variableName.size(); i++){
			String var=variableName.get(i);
			String type=string.get(i).toString().toLowerCase();
			property.setString(var+"."+type, i);
		}
		String cad= property.toString();
		
		for (int i=0; i<variableName.size(); i++){
			String var=variableName.get(i);
			String type=string.get(i).toString().toLowerCase();
			property.deleteString(var+"."+type, i);
		}
		return cad;
	}
	

}
