package com.jinshiwu.controller;

import com.jinshiwu.services.GreetingService;

/**
 * Created by jinshiwu on 8/13/18.
 */
public class ConstractorInjectedController {
    private GreetingService greetingService;

    public ConstractorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greeting();
    }
}
