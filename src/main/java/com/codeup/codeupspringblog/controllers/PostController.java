package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    Post post1 = new Post(1, "I have an opinion", "I am for some things and against some things and some stuff pisses me off and that's your problem! Murica!");
    Post post2 = new Post(2, "Everyone is special but you", "If everyone were special, well, that would kind of wear it down. So some of you are special and some of you ain't special like you and you and you are and you're not.");
    Post post3 = new Post(3, "Dangers of dihydrogen monoxide", "Dihydrogen monoxide is involved in every case of death and destruction around the world. All convicted murderers and rapists admit to having used this terrible substance and it doens't look like it's going away anytime soon. Anyone that goes without it for just a few hours reports an intense craving that could result in death if not satisfied.");

    List<Post> posts = new ArrayList<>(List.of(post1, post2, post3));

    @GetMapping ({"", "/"})
    public String getAllPosts(Model model) {
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping ("/{id}")
    public String getPost (@PathVariable int id, Model model) {
        model.addAttribute("post", posts.get(id-1));
        return "posts/show";
    }

    @GetMapping ("/create")
    @ResponseBody
    public String getForm() {
        return "view the form for creating a post";
    }

    @PostMapping("/create")
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }
}
