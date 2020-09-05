package com.rajatgoyal715.assignments.assignment1.strategy;

import java.util.Arrays;

/**
 * NONEOF operator strategy
 *
 * @author rajatgoyal715
 */
public class NoneOfOperatorStrategy extends OperatorStrategy {

    @Override
    public boolean evaluate(Object obj1, Object obj2) {
        String[] targets = obj2.toString().split(",");
        if (obj1 instanceof Integer) {
            boolean result = true;
            for(String target: targets) {
                Integer sourceValue = (Integer) obj1;
                Integer targetValue = Integer.parseInt(target);
                result = result && (!sourceValue.equals(targetValue));
            }
            return result;
        }
        return Arrays.stream(targets).noneMatch(x -> x.equals(obj1.toString()));
    }

}
