package com.jinshiwu.controller;

import com.jinshiwu.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jinshiwu on 8/13/18.
 */
@Controller
public class ConstractorInjectedController {
    private GreetingService greetingService;

    public ConstractorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greeting();
    }
}
