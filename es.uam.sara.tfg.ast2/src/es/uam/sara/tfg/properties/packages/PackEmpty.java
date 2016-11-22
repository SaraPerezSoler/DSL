package es.uam.sara.tfg.properties.packages;

import es.uam.sara.tfg.elements.Package;

public class PackEmpty extends PackageProperty {


	public PackEmpty() {
		super();

	}

	@Override
	public String toString() {
		return " empty";
	}

	@Override
	public boolean checkElement(Package analyze) {
		return analyze.isEmpty();
	}
}
