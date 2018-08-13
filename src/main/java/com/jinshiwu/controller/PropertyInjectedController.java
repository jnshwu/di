package com.jinshiwu.controller;

import com.jinshiwu.services.GreetingServiceImpl;

/**
 * Created by jinshiwu on 8/13/18.
 */
public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.greeting();
    }

}
