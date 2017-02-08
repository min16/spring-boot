package com.min16.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DevNewbie on 2017-02-08.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld(Model model) {
        return "home";
    }

    @RequestMapping("/admin")
    public String helloAdmin(Model model) {
        return "admin";
    }

    @RequestMapping("/login")
    public String signIn(Model model){
        return "login";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
