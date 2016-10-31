package es.uam.sara.tfg.properties.packages;

import java.util.List;

import es.uam.sara.tfg.ast.Visitors;

public class PackEmpty extends Package {
	private boolean no;

	public PackEmpty(boolean no) {
		super();
		this.no = no;
	}

	@Override
	public void check(List<String> analyze) {

		for (String s : analyze) {
			if (Visitors.getClasses(s).isEmpty() && Visitors.getInterfaces(s).isEmpty()
					&& Visitors.getEnumerations(s).isEmpty()) {
				if (no) {
					this.addWrong(s);
				} else {
					this.addRight(s);
				}
			} else {
				if (no) {
					this.addRight(s);
				} else {
					this.addWrong(s);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "no empty";
	}
}
