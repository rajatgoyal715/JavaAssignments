package com.rajatgoyal715.assignments.assignment1.strategy;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link OrOperatorStrategy}
 *
 * @author rajatgoyal715
 */
public class OrOperatorStrategyTest extends BaseTest {

    private OrOperatorStrategy orOperatorStrategy;

    @Before
    public void setup() {
        orOperatorStrategy = new OrOperatorStrategy();
    }

    @Test
    public void testEvaluate() {
        boolean ans1 = orOperatorStrategy.evaluate("false", "false");
        Assert.assertFalse(ans1);
    }
}
