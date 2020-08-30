package com.rajatgoyal715.assignments.assignment1.configuration.spring;

import com.rajatgoyal715.assignments.assignment1.FeatureModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringConfiguration.class);

    @Bean
    public FeatureModule featureModule() {
        LOGGER.info("Creating an instance of FeatureModule");
        return new FeatureModule();
    }

}
