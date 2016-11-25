package es.uam.sara.tfg.properties.all;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Properties;

public class NameType<T extends IElements> extends Properties<T> {

	
	public enum Type {
		UPPER_CAMEL_CASE, LOWER_CAMEL_CASE, UPPER_CASE, LOWER_CASE, START_UPPER_CASE, UNDEFINE
	}
	
	private Type type = Type.UNDEFINE;

	public NameType(Type type) {
		this.type = type;
	}

	public boolean checkNameType(String name) {
		switch (type) {
		case UPPER_CAMEL_CASE:
			return upperCamelCase(name);
		case LOWER_CAMEL_CASE:
			return lowerCamelCase(name);
		case UPPER_CASE:
			return upperCase(name);
		case LOWER_CASE:
			return lowerCase(name);
		case START_UPPER_CASE:
			return startUpperCase(name);
		default:
			return true;
		}
	}

	private boolean upperCamelCase(String name) {
		char[] nameArray = name.toCharArray();
		if (Character.isUpperCase(nameArray[0])) {
			for (int i = 1; i < nameArray.length; i++) {
				if (!(Character.isUpperCase(nameArray[i]) || Character.isLowerCase(nameArray[i])
						|| Character.isDigit(nameArray[i]))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private boolean lowerCamelCase(String name) {
		char[] nameArray = name.toCharArray();
		if (Character.isLowerCase(nameArray[0])) {
			for (int i = 1; i < nameArray.length; i++) {
				if (!(Character.isUpperCase(nameArray[i]) || Character.isLowerCase(nameArray[i]))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private boolean upperCase(String name) {
		char[] nameArray = name.toCharArray();
		for (int i = 0; i < nameArray.length; i++) {
			if (Character.isLetter(nameArray[i])) {
				if (!Character.isUpperCase(nameArray[i])) {
					return false;
				}
			}
		}
		return true;

	}

	private boolean lowerCase(String name) {
		char[] nameArray = name.toCharArray();
		for (int i = 0; i < nameArray.length; i++) {
			if (Character.isLetter(nameArray[i])) {
				if (!Character.isLowerCase(nameArray[i])) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean startUpperCase(String name) {
		char[] nameArray = name.toCharArray();
		if (!Character.isUpperCase(nameArray[0])) {
			return false;
		}
		return true;
	}

	

	public Type getType() {
		return type;
	}

	@Override
	public boolean checkElement(T analyze) {
		return checkNameType(analyze.getName());
	}

	@Override
	public String toString() {
		return "name type="+ type;
	}

}
