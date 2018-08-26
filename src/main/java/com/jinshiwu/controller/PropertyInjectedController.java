package com.jinshiwu.controller;

import com.jinshiwu.di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jinshiwu on 8/13/18.
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService ;

    public String sayHello() {
        return greetingService.greeting();
    }

}
