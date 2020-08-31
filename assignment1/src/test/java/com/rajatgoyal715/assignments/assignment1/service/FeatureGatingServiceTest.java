package com.rajatgoyal715.assignments.assignment1.service;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Map;

/**
 * Test class for {@link FeatureGatingService}
 *
 * @author rajatgoyal715
 */
public class FeatureGatingServiceTest extends BaseTest {

    @Mock
    private UserAttributeResolverService userAttributeResolverService;

    @InjectMocks
    private FeatureGatingService featureGatingService;

    @Before
    public void setup() {
         featureGatingService = new FeatureGatingService();
         featureGatingService.setUserAttributeResolverService(userAttributeResolverService);
    }

    @Test
    public void testIsAllowed() {
        String expression = "(age <= 23)";
        Map<String, Object> userAttrsMap = Map.of(
                "age", 21,
                "gender", "Male",
                "past_order_amount", 5000,
                "address", Map.of("city", "Faridabad", "state", "Haryana")
        );
        Mockito.when(userAttributeResolverService.resolve("age")).thenReturn(21);
        boolean ans = featureGatingService.isAllowed(expression, userAttrsMap);
        Assert.assertTrue(ans);
    }
}
