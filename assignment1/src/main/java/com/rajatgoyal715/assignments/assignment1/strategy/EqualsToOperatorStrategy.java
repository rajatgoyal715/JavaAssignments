package com.rajatgoyal715.assignments.assignment1.strategy;

/**
 * Equals to operator strategy
 *
 * @author rajatgoyal715
 */
public class EqualsToOperatorStrategy extends OperatorStrategy {

    @Override
    public boolean evaluate(Object obj1, Object obj2) {
        return obj1.toString().equals(obj2.toString());
    }

}
