package es.uam.sara.tfg.properties.type;

public class TypeIsCollection implements TypeFunction{

	private Type of;
	public TypeIsCollection() {
		of=null;
	}
	public TypeIsCollection(Type of) {
		super();
		this.of = of;
	}


	@Override
	public boolean compare(org.eclipse.jdt.core.dom.Type other) {
		
		return false;
	}

}
