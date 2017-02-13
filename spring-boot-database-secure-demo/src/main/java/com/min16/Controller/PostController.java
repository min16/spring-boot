package com.min16.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by DevNewbie on 2017-02-09.
 */
@Controller
public class PostController {

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String getPosts(Model model){
        return "posts";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public String createPost(Model model){
        model.addAttribute("result", "post is successfully saved");
        return "posts";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value="/posts/write")
    public String write(Model model){
        return "write";
    }


}
