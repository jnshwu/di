package com.jinshiwu.controller;

import com.jinshiwu.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jinshiwu on 8/13/18.
 */
public class ConstructorInjectedControllerTests {
    private ConstractorInjectedController constractorInjectedController;

    @Before
    public void setup() {
        constractorInjectedController = new ConstractorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testSayHello() {
        org.junit.Assert.assertEquals(constractorInjectedController.sayHello(), GreetingServiceImpl.HELLO);
    }
}
