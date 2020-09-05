package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link GreaterThanOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class GreaterThanOperatorStrategyTest extends BaseTest {

    private GreaterThanOperatorStrategy greaterThanOperatorStrategy = new GreaterThanOperatorStrategy();

    @Test
    public void testEvaluate() {
        Integer obj1 = 20;
        boolean ans1 = greaterThanOperatorStrategy.evaluate(obj1, "21");
        Assert.assertFalse(ans1);

        boolean ans2 = greaterThanOperatorStrategy.evaluate(obj1, "19");
        Assert.assertTrue(ans2);
    }
}
