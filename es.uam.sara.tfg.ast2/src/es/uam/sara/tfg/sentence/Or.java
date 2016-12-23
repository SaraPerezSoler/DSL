package es.uam.sara.tfg.sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.uam.sara.tfg.elements.IElements;

public class Or<T extends IElements> extends PrimaryOp<T> {

	protected List<And<T>> ands;
	private boolean changeForContains = false;

	public Or() {
		super(false);
		ands = new ArrayList<And<T>>();
	}

	public void addAnd(And<T> a) {
		ands.add(a);
	}

	public void check(List<T> analyze) {

		for (And<T> a : ands) {
			a.check(analyze);
		}
		for (T a : analyze) {
			boolean right = false;
			for (And<T> p : ands) {
				if (p.getRight().contains(a)) {
					this.addRight(a);
					right = true;
				}else if (p.isChangeForContains()){
					this.addLastWrong(a);
				}
			}
			if (right == false) {
				this.addWrong(a);
			}
		}
	}

	public void reset() {
		for (And<T> a : ands) {
			a.reset();
		}
		super.reset();
	}

	@Override
	public String toString() {
		String cad = "";
		String or = "";
		for (And<T> a : this.ands) {
			cad += or + a.toString();
			or = " or ";
		}
		return cad;
	}

	@Override
	public String print(boolean right) {
		String cad;
		if (right) {
			cad = "This elements satisfy " + this.toString() + ":\n";
		} else {
			cad = "This elements don't satisfy " + this.toString() + ":\n";
		}
		if (ands.size() <= 1) {
			cad = "";
		}
		for (And<T> a : ands) {
			cad += a.print(right);
		}
		return cad;
	}

	@Override
	public boolean checkElement(T analyze) {
		return false;
	}

	public boolean needVariables() {
		for (And<T> a : ands) {
			if (a.needVariables()) {
				return true;
			}
		}
		return false;
	}

	public void setUsing(Map<String, IElements> using) {
		for (And<T> a : ands) {
			a.setUsing(using);
		}
		super.setUsing(using);
	}

	public void reset(RuleSave<T> rs, int i) {
		this.reset();
		this.addAllRight(rs.getRight(i));
		this.addAllWrong(rs.getWrong(i));
		int k=i++;
		for (And<T> a : ands){
			a.reset(rs, k);
			k=1+a.getChildren();
		}
	}

	public boolean isChangeForContains() {
		return changeForContains;
	}
	
	@Override
	public int getChildren() {
		int i=0;
		for (And<T> p: this.ands){
			i+=p.getChildren();
		}
		return 1+i;
	}
	
	@Override
	public void save(RuleSave<T> rs, int i) {
		rs.save(i, getRight(), getWrong());
		int k=i++;
		for (And<T> a : ands){
			a.save(rs, k);
			k=1+a.getChildren();
		}
		
	}

}
