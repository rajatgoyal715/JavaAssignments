package com.rajatgoyal715.assignments.assignment1.service;

import com.rajatgoyal715.assignments.assignment1.factory.OperatorFactory;
import com.rajatgoyal715.assignments.assignment1.strategy.OperatorStrategy;

import javax.inject.Inject;
import java.util.Map;
import java.util.Stack;

/**
 * This class is responsible for feature gating module
 *
 * @author rajatgoyal715
 */
public class FeatureGatingService {

    @Inject
    UserAttributeResolverService userAttributeResolverService;

    /**
     * This method will calculate on the basis of the expression, if user should be provided that feature
     * @param conditionalExpression conditional expression which needs to be parsed
     * @param userAttributesMap mapping of user attributes to values
     * @return whether user is allowed to access the feature or not
     */
    public boolean isAllowed(String conditionalExpression, Map<String, Object> userAttributesMap) {

        userAttributeResolverService.setUserAttributesMap(userAttributesMap);

        // possible value of expression is ((age > 25) AND (gender == 'Male')) OR (address.city = 'FBD')
        // TODO: Current assumptions:
            // 1. there are spaces on both sides of operator
            // 2. every condition is surrounded by parentheses

        Stack<String> stack = new Stack<>();
        char[] c = conditionalExpression.toCharArray();
        int index = 0;
        int len = c.length;
        while(index < len) {
            if(c[index] == '(') {
                stack.push("(");
            } else if (c[index] == ')') {
                String targetValue = stack.pop();
                String operator = stack.pop();
                String userKey = stack.pop();
                stack.pop(); // pop opening parentheses

                Object sourceValue = userAttributeResolverService.resolve(userKey);

                OperatorStrategy strategy = OperatorFactory.getOperator(operator);
                boolean result = strategy.evaluate(sourceValue, targetValue);
                stack.push(String.valueOf(result));
            } else if (c[index] == ' ') {
                // ignore whitespace
            } else {
                StringBuilder sb = new StringBuilder();
                while(index < len && c[index] != ' ' && c[index] != ')') {
                    sb.append(c[index]);
                    index++;
                }
                index--;
                stack.push(sb.toString());
            }
            index++;
        }

        if (stack.size() == 1) {
            String result = stack.pop();
            return result.equals("true");
        }

        String targetValue = stack.pop();
        String operator = stack.pop();
        String userKey = stack.pop();

        Object sourceValue = userAttributeResolverService.resolve(userKey);

        OperatorStrategy strategy = OperatorFactory.getOperator(operator);
        boolean result = strategy.evaluate(sourceValue, targetValue);
        return result;
    }

    public void setUserAttributeResolverService(UserAttributeResolverService userAttributeResolverService) {
        this.userAttributeResolverService = userAttributeResolverService;
    }
}
