package com.jinshiwu.services;

/**
 * Created by jinshiwu on 8/13/18.
 */
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO = "Hello Guru";

    @Override
    public String greeting() {
        return HELLO;
    }
}
