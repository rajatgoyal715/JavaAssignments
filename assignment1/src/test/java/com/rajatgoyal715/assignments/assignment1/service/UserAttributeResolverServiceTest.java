package com.rajatgoyal715.assignments.assignment1.service;

import com.rajatgoyal715.assignments.assignment1.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Map;

/**
 * Test class for {@link UserAttributeResolverService}
 *
 * @author rajatgoyal715
 */
public class UserAttributeResolverServiceTest extends BaseTest {

    @InjectMocks
    private UserAttributeResolverService userAttributeResolverService;

    @Before
    public void setup() {
        userAttributeResolverService = new UserAttributeResolverService();
    }

    @Test
    public void testResolve() {

        Map<String, Object> userAttrsMap = Map.of(
                "age", 21,
                "gender", "Male",
                "past_order_amount", 5000,
                "address", Map.of("city", "Faridabad", "state", "Haryana")
        );
        userAttributeResolverService.setUserAttributesMap(userAttrsMap);

        Object age = userAttributeResolverService.resolve("age");
        Assert.assertEquals(userAttrsMap.get("age"), age);

        Object gender = userAttributeResolverService.resolve("gender");
        Assert.assertEquals(userAttrsMap.get("gender"), gender);

        Object pastOrderAmount = userAttributeResolverService.resolve("past_order_amount");
        Assert.assertEquals(userAttrsMap.get("past_order_amount"), pastOrderAmount);

        Object addressCity = userAttributeResolverService.resolve("address.city");
        Object expectedAddressCity = ((Map<String, Object>)userAttrsMap.get("address")).get("city");
        Assert.assertEquals(expectedAddressCity, addressCity);

    }
}
