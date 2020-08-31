package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link BetweenOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class BetweenOperatorStrategyTest extends BaseTest {

    private BetweenOperatorStrategy betweenOperatorStrategy;

    @Before
    public void setUp() {
        betweenOperatorStrategy = new BetweenOperatorStrategy();
    }

    @Test
    public void testEvaluate() {
        boolean ans = betweenOperatorStrategy.evaluate(20, "19,21");
        Assert.assertTrue(ans);
    }
}
