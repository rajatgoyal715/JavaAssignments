package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link AllOfOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class AllOfOperatorStrategyTest extends BaseTest {

    private AllOfOperatorStrategy allOfOperatorStrategy;

    @Before
    public void setUp() {
        allOfOperatorStrategy = new AllOfOperatorStrategy();
    }

    @Test
    public void testEvaluate() {
        boolean ans = allOfOperatorStrategy.evaluate(20, "20");
        Assert.assertTrue(ans);
    }
}
