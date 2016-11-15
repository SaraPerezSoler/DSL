package es.uam.sara.tfg.properties.file;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.Properties;

public abstract class File extends Properties<UnitVisitor>{

	@Override
	public String print(UnitVisitor print) {
		
		return "The file "+print.getNameFile()+"\n";
	}

	

}
