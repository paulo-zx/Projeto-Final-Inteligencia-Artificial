package modelo_teste1;

import java.util.List;
/*
import modelo_teste1.Assignment;
import modelo_teste1.Variable;*/

/**
 * A constraint specifies the allowable combinations of values for a set of
 * variables. Each constraint consists of a pair <scope, rel>, where scope is a
 * tuple of variables that participate in the constraint and rel is a relation
 * that defines the values that those variables can take on.<br>
 * <br>
 * <b>Note:</b> Implementations of this interface define the different kinds of
 * relations that constraints can represent.
 * 
 * @author Ruediger Lunde
 */
public interface Constraint<VAR extends Variable, VAL> {
	/** Returns a tuple of variables that participate in the constraint. */
	List<VAR> getScope();

	/** Constrains the values that the variables can take on. */
	boolean isSatisfiedWith(Assignment<VAR, VAL> assignment);
}