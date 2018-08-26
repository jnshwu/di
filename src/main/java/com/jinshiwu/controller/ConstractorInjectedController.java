package com.jinshiwu.controller;

import com.jinshiwu.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jinshiwu on 8/13/18.
 */
@Controller
public class ConstractorInjectedController {
    private GreetingService greetingService;

    public ConstractorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greeting();
    }
}
