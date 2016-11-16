package es.uam.sara.tfg.rule;

import java.util.List;

public interface RuleFactory<T> {

	public abstract Rule<T> getRule(List<T> elements);
}
