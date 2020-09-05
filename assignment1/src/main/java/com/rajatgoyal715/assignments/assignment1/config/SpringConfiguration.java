package com.rajatgoyal715.assignments.assignment1.config;

import com.rajatgoyal715.assignments.assignment1.service.FeatureGatingService;
import com.rajatgoyal715.assignments.assignment1.service.UserAttributeResolverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    private final static Logger LOGGER = LoggerFactory.getLogger(SpringConfiguration.class);

    @Bean
    public FeatureGatingService featureGatingService() {
        LOGGER.info("Creating an instance of FeatureGatingService");
        return new FeatureGatingService();
    }

    @Bean
    public UserAttributeResolverService userAttributeResolver() {
        LOGGER.info("Creating an instance of UserAttributeResolver");
        return new UserAttributeResolverService();
    }

}
