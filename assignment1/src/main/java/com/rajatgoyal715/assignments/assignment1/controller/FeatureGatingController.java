package com.rajatgoyal715.assignments.assignment1.controller;

import com.rajatgoyal715.assignments.assignment1.FeatureModule;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class FeatureGatingController {

    @Inject
    private FeatureModule featureModule;

    @RequestMapping("/")
    public String index() {
        return "Greetings!!";
    }

    @RequestMapping("/test")
    public boolean test(@RequestParam String expression) {
        // curl localhost:8080/test?expression=%27%28abc%3E25%20AND%20gender%3D%3D%22Male%22%29%27
        System.out.println(expression);
        boolean isAllowed = featureModule.isAllowed(expression, null);
        System.out.println(isAllowed);
        return true;
    }
}
