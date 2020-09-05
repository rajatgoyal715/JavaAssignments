package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link NotEqualsToOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class NotEqualsToOperatorStrategyTest extends BaseTest {

    private NotEqualsToOperatorStrategy notEqualsToOperatorStrategy = new NotEqualsToOperatorStrategy();

    @Test
    public void testEvaluate() {
        Integer obj1 = 20;
        boolean ans1 = notEqualsToOperatorStrategy.evaluate(obj1, "21");
        Assert.assertTrue(ans1);

        boolean ans2 = notEqualsToOperatorStrategy.evaluate(obj1, "20");
        Assert.assertFalse(ans2);
    }
}
