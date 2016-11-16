package es.uam.sara.tfg.properties.packages;

import es.uam.sara.tfg.properties.Empty;

public class PackEmpty extends Package {


	public PackEmpty() {
		super();

	}

	@Override
	public String toString() {
		return " empty";
	}

	@Override
	public boolean checkElement(String analyze) {
		return Empty.isEmpty(analyze);
	}
}
