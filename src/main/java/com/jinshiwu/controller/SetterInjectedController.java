package com.jinshiwu.controller;

import com.jinshiwu.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jinshiwu on 8/13/18.
 */
@Controller
public class SetterInjectedController {
    private GreetingService  greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greeting();
    }
}
