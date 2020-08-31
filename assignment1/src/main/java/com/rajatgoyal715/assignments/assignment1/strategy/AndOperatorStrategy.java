package com.rajatgoyal715.assignments.assignment1.strategy;

/**
 * AND logical operator strategy class
 *
 * @author rajatgoyal715
 */
public class AndOperatorStrategy extends OperatorStrategy {

    @Override
    public boolean evaluate(Object obj1, Object obj2) {
        return obj1.toString().equals("true") && obj2.toString().equals("true");
    }

}
