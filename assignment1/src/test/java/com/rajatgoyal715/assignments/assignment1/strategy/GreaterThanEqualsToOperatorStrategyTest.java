package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link GreaterThanEqualsToOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class GreaterThanEqualsToOperatorStrategyTest extends BaseTest {

    private GreaterThanEqualsToOperatorStrategy greaterThanEqualsToOperatorStrategy = new GreaterThanEqualsToOperatorStrategy();

    @Test
    public void testEvaluate() {
        Integer obj1 = 20;
        boolean ans1 = greaterThanEqualsToOperatorStrategy.evaluate(obj1, "21");
        Assert.assertFalse(ans1);

        boolean ans2 = greaterThanEqualsToOperatorStrategy.evaluate(obj1, "20");
        Assert.assertTrue(ans2);
    }
}
