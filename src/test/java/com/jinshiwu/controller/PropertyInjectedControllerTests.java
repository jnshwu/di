package com.jinshiwu.controller;

import com.jinshiwu.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jinshiwu on 8/13/18.
 */
public class PropertyInjectedControllerTests {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testSayHello() {
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
