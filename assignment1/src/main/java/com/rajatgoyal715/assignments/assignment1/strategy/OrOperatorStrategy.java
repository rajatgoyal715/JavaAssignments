package com.rajatgoyal715.assignments.assignment1.strategy;

/**
 * Or logical operator strategy class
 *
 * @author rajatgoyal715
 */
public class OrOperatorStrategy extends OperatorStrategy {

    @Override
    public boolean evaluate(Object obj1, Object obj2) {
        return obj1.toString().equals("true") || obj2.toString().equals("true");
    }

}
