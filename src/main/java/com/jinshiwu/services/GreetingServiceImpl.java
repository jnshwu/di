package com.jinshiwu.services;

import org.springframework.stereotype.Component;

/**
 * Created by jinshiwu on 8/13/18.
 */
@Component
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO = "Hello Guru";

    @Override
    public String greeting() {
        return HELLO;
    }
}
