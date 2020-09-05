package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link EqualsToOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class EqualsToOperatorStrategyTest extends BaseTest {

    private EqualsToOperatorStrategy equalsToOperatorStrategy = new EqualsToOperatorStrategy();

    @Test
    public void testEvaluate() {
        Integer obj1 = 20;
        boolean ans1 = equalsToOperatorStrategy.evaluate(obj1, "20");
        Assert.assertTrue(ans1);

        boolean ans2 = equalsToOperatorStrategy.evaluate(obj1, "19");
        Assert.assertFalse(ans2);
    }
}
