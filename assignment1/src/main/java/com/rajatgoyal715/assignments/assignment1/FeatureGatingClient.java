package com.rajatgoyal715.assignments.assignment1;

import com.rajatgoyal715.assignments.assignment1.config.SpringConfiguration;
import com.rajatgoyal715.assignments.assignment1.service.FeatureGatingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Map;

/**
 * Client class for {@link FeatureGatingService}
 *
 * @author rajatgoyal715
 */
@ComponentScan
public class FeatureGatingClient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        FeatureGatingService featureGatingService = (FeatureGatingService) context.getBean("featureGatingService");

        Map<String, Object> userMap = Map.of(
                "age", 21,
                "gender", "Male",
                "past_order_amount", 5000,
                "address", Map.of("city", "Faridabad", "state", "Haryana")
        );

        String[] testConditionalExpressions = {
                "((age > 25) AND (gender == Male)) OR (past_order_amount < 1000)",
                "(address.city == Faridabad)",
                "((age >= 21) AND (gender != Male))",
                "(age <= 23)",
                "(age BETWEEN 19,21)",
                "(address.city NONEOF Hyderabad,Delhi,Mumbai)",
                "(address.city ALLOF Faridabad)"
        };
        for(String expression : testConditionalExpressions) {
            boolean isAllowed = featureGatingService.isAllowed(expression, userMap);
            System.out.println("Expression : " + expression);
            System.out.println("isAllowed : " + isAllowed);
        }
    }
}
