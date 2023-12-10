package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping ("/posts")
    @ResponseBody
    public String getAllPosts () {
        return "posts index page";
    }

    @GetMapping ("/posts/{id}")
    @ResponseBody
    public String getPost (@PathVariable int id) {
        return "view an individual post";
    }

    @GetMapping ("/posts/create")
    @ResponseBody
    public String getForm() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }
}