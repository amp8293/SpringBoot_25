package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String homeFormPage() {
        return "formtemplate";
    }

    /**
     * Adding dummy code just to make a change for the SongFeature branch
     * Does the same thing as going to the "/loadform" URL
     * @return
     */
    @RequestMapping("/song")
    public String songFormPage() {
        return "formtemplate";
    }

    @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("login") String login, Model model) {
        model.addAttribute("loginval",login);
        return "confirm";
    }

}
