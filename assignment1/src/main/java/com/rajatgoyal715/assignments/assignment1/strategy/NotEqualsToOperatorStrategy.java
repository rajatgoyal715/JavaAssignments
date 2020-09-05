package com.rajatgoyal715.assignments.assignment1.strategy;

/**
 * Not equals to operator strategy class
 *
 * @author rajatgoyal715
 */
public class NotEqualsToOperatorStrategy extends OperatorStrategy {

    @Override
    public boolean evaluate(Object obj1, Object obj2) {
        return !obj1.toString().equals(obj2.toString());
    }

}
