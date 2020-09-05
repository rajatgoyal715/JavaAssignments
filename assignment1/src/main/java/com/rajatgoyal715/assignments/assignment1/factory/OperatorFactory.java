package com.rajatgoyal715.assignments.assignment1.factory;

import com.rajatgoyal715.assignments.assignment1.model.Operator;
import com.rajatgoyal715.assignments.assignment1.strategy.*;

import java.util.Map;

/**
 * Factory class to get particular operator
 *
 * @author rajatgoyal715
 */
public class OperatorFactory {

    private static final Map<String, OperatorStrategy> operatorStrategyFactoryMap = Map.ofEntries(
            Map.entry(Operator.EQUALS_TO.getSymbol(), new EqualsToOperatorStrategy()),
            Map.entry(Operator.LESS_THAN.getSymbol(), new LessThanOperatorStrategy()),
            Map.entry(Operator.GREATER_THAN.getSymbol(), new GreaterThanOperatorStrategy()),
            Map.entry(Operator.LESS_THAN_EQUALS_TO.getSymbol(), new LessThanEqualsToOperatorStrategy()),
            Map.entry(Operator.GREATER_THAN_EQUALS_TO.getSymbol(), new GreaterThanEqualsToOperatorStrategy()),
            Map.entry(Operator.NOT_EQUALS_TO.getSymbol(), new NotEqualsToOperatorStrategy()),
            Map.entry(Operator.BETWEEN.getSymbol(), new BetweenOperatorStrategy()),
            Map.entry(Operator.NONEOF.getSymbol(), new NoneOfOperatorStrategy()),
            Map.entry(Operator.ALLOF.getSymbol(), new AllOfOperatorStrategy()),
            Map.entry(Operator.AND.getSymbol(), new AndOperatorStrategy()),
            Map.entry(Operator.OR.getSymbol(), new OrOperatorStrategy())
    );

    public static OperatorStrategy getOperator(String operator) {
        if (!operatorStrategyFactoryMap.containsKey(operator)) {
            throw new UnsupportedOperationException("There is no OperatorStrategy for this operator : " + operator);
        }
        return operatorStrategyFactoryMap.get(operator);
    }
}
