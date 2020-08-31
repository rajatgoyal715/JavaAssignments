package com.rajatgoyal715.assignments.assignment1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * This class is responsible to resolve user attributes
 *
 * @author rajatgoyal715
 */
public class UserAttributeResolverService {

    private Map<String, Object> userAttributesMap;

    private static Logger LOGGER = LoggerFactory.getLogger(UserAttributeResolverService.class);

    public Object resolve(String userKey) {

        if (userKey.equals("false") || userKey.equals("true")) return userKey;

        String[] keys = userKey.split("\\.");
        LOGGER.info("User key contains following keys : " + keys);

        Object result = userAttributesMap;
        for(String key : keys) {
            Map<String, Object> temp = (Map<String, Object>) result;
            if (!temp.containsKey(key)) {
                throw new UnsupportedOperationException("User attributes does not contain key : " + key);
            }
            result = temp.get(key);
        }

        return result;
    }

    public void setUserAttributesMap(Map<String, Object> userAttributesMap) {
        this.userAttributesMap = userAttributesMap;
    }
}
