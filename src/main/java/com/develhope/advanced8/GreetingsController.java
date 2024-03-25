package com.develhope.advanced8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @Autowired
    Environment environment;

    @GetMapping("/greeting")
    public String getGreeting(){
        return environment.getProperty("myCustomVarTree.customVar");
    }
}
