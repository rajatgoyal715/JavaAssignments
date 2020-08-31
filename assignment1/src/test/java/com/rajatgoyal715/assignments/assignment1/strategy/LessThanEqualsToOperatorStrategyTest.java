package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link LessThanEqualsToOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class LessThanEqualsToOperatorStrategyTest extends BaseTest {

    private LessThanEqualsToOperatorStrategy lessThanEqualsToOperatorStrategy = new LessThanEqualsToOperatorStrategy();

    @Test
    public void testEvaluate() {
        Integer obj1 = 20;
        boolean ans1 = lessThanEqualsToOperatorStrategy.evaluate(obj1, "20");
        Assert.assertTrue(ans1);

        boolean ans2 = lessThanEqualsToOperatorStrategy.evaluate(obj1, "19");
        Assert.assertFalse(ans2);
    }
}
