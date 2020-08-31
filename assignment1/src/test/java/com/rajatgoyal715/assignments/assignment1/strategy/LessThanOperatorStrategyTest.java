package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link LessThanOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class LessThanOperatorStrategyTest extends BaseTest {

    private LessThanOperatorStrategy lessThanOperatorStrategy = new LessThanOperatorStrategy();

    @Test
    public void testEvaluate() {
        Integer obj1 = 20;
        boolean ans1 = lessThanOperatorStrategy.evaluate(obj1, "21");
        Assert.assertTrue(ans1);

        boolean ans2 = lessThanOperatorStrategy.evaluate(obj1, "19");
        Assert.assertFalse(ans2);
    }
}
