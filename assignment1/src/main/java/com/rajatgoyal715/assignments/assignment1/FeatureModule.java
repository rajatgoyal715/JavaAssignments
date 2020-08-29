package com.rajatgoyal715.assignments.assignment1;

import com.rajatgoyal715.assignments.assignment1.model.Datatype;
import com.rajatgoyal715.assignments.assignment1.model.Expression;
import com.rajatgoyal715.assignments.assignment1.model.Operator;

import java.util.Map;
import java.util.Stack;

/**
 * This class is responsible for feature gating module
 *
 * @author rajatgoyal715
 */
public class FeatureModule {

    ExpressionEvaluator evaluator;

    public FeatureModule() {
        evaluator = new ExpressionEvaluator();
    }

    /**
     * This method will calculate on the basis of the expression, if user should be provided that feature
     * @param conditionalExpression conditional expression which needs to be parsed
     * @param user mapping of user attributes to values
     * @return whether user is allowed to access the feature or not
     */
    public boolean isAllowed(String conditionalExpression, Map<String, Object> user) {
        conditionalExpression = "((age > 25) AND (gender == \"Male\"))";

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
                stack.pop(); // pop opening paranthesis

                boolean result = evaluate(targetValue, operator, userKey, user);
            } else if (c[index] == ' ') {
                // ignore
            } else {
                StringBuilder sb = new StringBuilder();
                while(index < len && c[index]!=' ') {
                    sb.append(c[index]);
                    index++;
                }
                stack.push(sb.toString());
            }
            index++;
        }

        // make expression object out of expression string
        Expression expression = new Expression("age", Operator.GREATER_THAN, 25, Datatype.INT);

        // use evaluator to evaluate the expression
        boolean result = evaluator.evaluate(expression, user);

        return result;
    }

    boolean evaluate(String targetValue, String operator, String userKey, Map<String, Object> user) {
        // TODO: Complete this
        return false;
    }
}
