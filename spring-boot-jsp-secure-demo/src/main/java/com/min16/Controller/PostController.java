package com.min16.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by DevNewbie on 2017-02-09.
 */
@Controller
public class PostController {

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String getPosts(Model model){
        return "posts";
    }

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ADMIN')")
    public String createPost(Model model){
        model.addAttribute("result", "post is successfully saved");
        return "posts";
    }

    @RequestMapping(value="/posts/write")
    @PreAuthorize("hasRole('ADMIN')")
    public String write(Model model){
        return "write";
    }


}
