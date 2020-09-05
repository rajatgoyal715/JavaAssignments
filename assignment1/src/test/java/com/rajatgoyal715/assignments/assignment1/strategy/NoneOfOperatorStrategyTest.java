package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link NoneOfOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class NoneOfOperatorStrategyTest extends BaseTest {

    private NoneOfOperatorStrategy noneOfOperatorStrategy;

    @Before
    public void setUp() {
        noneOfOperatorStrategy = new NoneOfOperatorStrategy();
    }

    @Test
    public void testEvaluate() {
        boolean ans = noneOfOperatorStrategy.evaluate(20, "19,21");
        Assert.assertTrue(ans);
    }
}
