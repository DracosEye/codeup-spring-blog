package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/roll-dice")
public class DiceController {

    @GetMapping("")
    public String homePage() {
        return "dice";
    }

    @GetMapping("/{guess}")
    public String results(@PathVariable int guess, Model model) {
        int roll = (int)Math.floor(Math.random() * 6) + 1;
        model.addAttribute("roll", roll);
        model.addAttribute("guess", guess);
        if (roll == guess) {
            model.addAttribute("result", "correct");
        }
        else {
            model.addAttribute("result", "incorrect");
        }
        return "dice";
    }
}
