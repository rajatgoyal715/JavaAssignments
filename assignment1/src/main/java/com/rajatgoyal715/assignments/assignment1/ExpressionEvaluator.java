package com.rajatgoyal715.assignments.assignment1;

import com.rajatgoyal715.assignments.assignment1.model.Datatype;
import com.rajatgoyal715.assignments.assignment1.model.Expression;
import com.rajatgoyal715.assignments.assignment1.model.Operator;

import java.util.Map;

/**
 * This class is responsible to evaluate an expression based on the user attributes
 *
 * @author rajatgoyal715
 */
public class ExpressionEvaluator {

    /**
     * Evaluates the expression and return if expression is true or false
     * @param expression an object of {@link Expression}
     * @param user user mapping from attributes to values
     * @return whether expression is true or false
     */
    public boolean evaluate(Expression expression, Map<String, Object> user) {
        String key = expression.getKey();
        if (!user.containsKey(key)) {
            throw new IllegalArgumentException("User mapping does not contain this key: " + key);
        }
        Operator operator = expression.getOperator();
        Datatype datatype = expression.getDatatype();
        switch(operator) {
            case LESS_THAN:
                switch (datatype) {
                    case INT:
                        return (int)user.get(key) < (int)expression.getTargetValue();
                    case DOUBLE:
                        return (double)user.get(key) < (double)expression.getTargetValue();
                    case STRING:
                        return user.get(key).toString().compareTo(expression.getTargetValue().toString()) < 0;
                    case BOOLEAN:
                        throw new UnsupportedOperationException("Cannot compare less than between boolean values");
                }
            case GREATER_THAN:
                switch (datatype) {
                    case INT:
                        return (int)user.get(key) > (int)expression.getTargetValue();
                    case DOUBLE:
                        return (double)user.get(key) > (double)expression.getTargetValue();
                    case STRING:
                        return user.get(key).toString().compareTo(expression.getTargetValue().toString()) > 0;
                    case BOOLEAN:
                        throw new UnsupportedOperationException("Cannot compare greater than between boolean values");
                }
            case EQUALS_TO:
                switch (datatype) {
                    case INT:
                        return (int)user.get(key) == (int)expression.getTargetValue();
                    case DOUBLE:
                        return (double)user.get(key) == (double)expression.getTargetValue();
                    case STRING:
                        return user.get(key).toString().compareTo(expression.getTargetValue().toString()) == 0;
                    case BOOLEAN:
                        return (boolean)user.get(key) == (boolean)expression.getTargetValue();
                }
        }
        return false;
    }
}
