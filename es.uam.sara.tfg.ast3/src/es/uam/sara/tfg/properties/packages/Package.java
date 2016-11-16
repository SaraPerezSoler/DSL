
package es.uam.sara.tfg.properties.packages;

import es.uam.sara.tfg.properties.Properties;


public abstract class Package extends Properties<String> {

	public Package() {
		super();
	}

	public String print(String print){
		return "The packages "+print+"\n";
	}
}
