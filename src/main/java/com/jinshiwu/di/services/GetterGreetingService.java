package com.jinshiwu.di.services;

import org.springframework.stereotype.Service;

/**
 * Created by jinshiwu on 8/13/18.
 */
@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello, I am GetterGreetingService";
    }
}
