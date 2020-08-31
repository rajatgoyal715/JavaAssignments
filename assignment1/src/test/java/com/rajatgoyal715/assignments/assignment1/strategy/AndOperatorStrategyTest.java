package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link AndOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class AndOperatorStrategyTest extends BaseTest {

    private AndOperatorStrategy andOperatorStrategy;

    @Before
    public void setup() {
        andOperatorStrategy = new AndOperatorStrategy();
    }

    @Test
    public void testEvaluate() {
        boolean ans1 = andOperatorStrategy.evaluate("false", "true");
        Assert.assertFalse(ans1);

        boolean ans2 = andOperatorStrategy.evaluate("false", "false");
        Assert.assertFalse(ans2);

        boolean ans3 = andOperatorStrategy.evaluate("true", "true");
        Assert.assertTrue(ans3);

        boolean ans4 = andOperatorStrategy.evaluate("true", "false");
        Assert.assertFalse(ans4);
    }
}
