package com.rajatgoyal715.assignments.assignment1.strategy;

/**
 * Less than equals to operator strategy
 *
 * @author rajatgoyal715
 */
public class LessThanEqualsToOperatorStrategy extends OperatorStrategy {

    @Override
    public boolean evaluate(Object obj1, Object obj2) {
        if (obj1 instanceof Integer) {
            Integer sourceValue = (Integer) obj1;
            Integer targetValue = Integer.parseInt((String)obj2);
            return sourceValue <= targetValue;
        } else if (obj1 instanceof Double) {
            Double sourceValue = (Double) obj1;
            Double targetValue = Double.parseDouble((String)obj2);
            return sourceValue <= targetValue;
        }
        return ((String)obj1).compareTo((String)obj2) <= 0;
    }

}
