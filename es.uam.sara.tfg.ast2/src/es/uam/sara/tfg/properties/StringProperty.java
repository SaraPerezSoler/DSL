package es.uam.sara.tfg.properties;

import es.uam.sara.tfg.elements.IElements;

public abstract class StringProperty<T extends IElements> extends Property<T>{
	public StringProperty(boolean no) {
		super(no);
	}

	public abstract void setString(String string, int i);
	public abstract void deleteString(String string, int i);
}