package com.jinshiwu.controller;

import com.jinshiwu.di.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jinshiwu on 8/13/18.
 */
public class SetterInjectedControllerTests {
    SetterInjectedController setterInjectedController;

    @Before
    public void setup() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testSayHello() {
        org.junit.Assert.assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
