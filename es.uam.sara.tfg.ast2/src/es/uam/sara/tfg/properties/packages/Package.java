
package es.uam.sara.tfg.properties.packages;

import java.util.List;
import es.uam.sara.tfg.properties.Properties;


public abstract class Package extends Properties<String> {

	public Package() {
		super();
	}

	public String printRight(){
		String cad="";
		List<String> right=super.getRight();
		for (String meth: right){
			cad+="The package "+meth+"  satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<String> wrong=super.getWrong();
		for (String meth: wrong){
			cad+="The package "+meth+" not satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
}
