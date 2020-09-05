package com.rajatgoyal715.assignments.assignment1.strategy;

/**
 * BETWEEN operator strategy
 *
 * @author rajatgoyal715
 */
public class BetweenOperatorStrategy extends OperatorStrategy {

    @Override
    public boolean evaluate(Object obj1, Object obj2) {
        String[] targets = obj2.toString().split(",");
        if (obj1 instanceof Integer) {
            Integer num1 = Integer.parseInt(targets[0]);
            Integer num2 = Integer.parseInt(targets[1]);
            Integer source = (Integer) obj1;
            return source >= num1 && source <= num2;
        } else if (obj1 instanceof Double) {
            Double num1 = Double.parseDouble(targets[0]);
            Double num2 = Double.parseDouble(targets[1]);
            Double source = (Double) obj1;
            return source >= num1 && source <= num2;
        }
        return obj1.toString().compareTo(targets[0]) >= 0 && obj1.toString().compareTo(targets[1]) <= 0;
    }

}
