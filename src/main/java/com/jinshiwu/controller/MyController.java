package com.jinshiwu.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by jinshiwu on 8/11/18.
 */
@Controller
public class MyController {
    public String hello() {
        System.out.println("hello hello hello");
        return "foo";
    }
}
