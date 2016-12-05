package es.uam.sara.tfg.properties.type;

public class TypeIsCollection implements TypeFunction {

	private Type of;
	private boolean variable;

	public TypeIsCollection() {
		of = null;
		this.variable = false;

	}

	public TypeIsCollection(Type of) {
		super();
		this.of = of;
		this.variable = of.isVariable();
	}

	@Override
	public boolean compare(org.eclipse.jdt.core.dom.Type other) {

		return false;
	}

	public void setString(String string) {
		if (of != null) {
			if (of.isVariable()) {
				of.setString(string);
			}
		}
	}

	@Override
	public String getString() {
		if (of != null) {
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

	@Override
	public void deleteString(String s) {
		if (of!=null){
			of.deleteString(s);
		}
	}
}
