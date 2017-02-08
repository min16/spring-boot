package com.min16.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        model.addAttribute("name",name);
        return "home";
    }

    @RequestMapping("/admin")
    public String helloAdmin(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        model.addAttribute("name",name);
        return "admin";
    }

    @RequestMapping("/login")
    public String signIn(Model model){
        return "login";
    }

    @RequestMapping("/hello")
    public String hello(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        model.addAttribute("name",name);
        return "hello";
    }

    @RequestMapping("/denied")
    public String denied() {
        return "denied";
    }
}
