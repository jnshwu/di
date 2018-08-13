package com.jinshiwu.controller;

import com.jinshiwu.services.GreetingService;

/**
 * Created by jinshiwu on 8/13/18.
 */
public class SetterInjectedController {
    private GreetingService  greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greeting();
    }
}
