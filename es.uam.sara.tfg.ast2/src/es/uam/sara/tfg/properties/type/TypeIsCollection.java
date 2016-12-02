package es.uam.sara.tfg.properties.type;

public class TypeIsCollection implements TypeFunction {

	private Type of;
	private boolean variable;

	public TypeIsCollection(boolean variable) {
		of = null;
		this.variable = variable;

	}

	public TypeIsCollection(boolean variable, Type of) {
		super();
		this.of = of;
		this.variable = variable;
	}

	@Override
	public boolean compare(org.eclipse.jdt.core.dom.Type other) {

		return false;
	}

	public void setString(String string) {
		if (of.isVariable()){
			of = new TypeString(string, true);
		}	
	}

	public void removeString(String string) {
		if (of.isVariable()) {
			if (of.getString().equals(string)) {
				of = null;
			}
		}

	}

	@Override
	public String getString() {
		if (of!=null){
			return "isCollection(" + of + ")";
		}
		return "isCollection()";
	}

	public boolean isVariable() {
		if (of != null) {
			return of.isVariable();
		} else {
			return variable;
		}
	}
}
