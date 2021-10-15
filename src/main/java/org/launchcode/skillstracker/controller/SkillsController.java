package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String showSkills(){
        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Skills to be Tracked</h2>" +
                "<ol>" +
                    "<li>JavaScript</li>" +
                    "<li>Java</li>" +
                    "<li>Python</li>" +
                "</o1>" +
                "</body></html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String displayForm(){
        return "<html><body>" +
                    "<form method = 'post'>" +
                    "<label>Name: <input type='text' name = 'name' /></input><br />" +
                    "<label>My first language of choice: <br />" +
                    "<select name = 'firstLang' id = 'firstLang'>" +
                        "<option value = 'js'>JavaScript</option>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'python'>Python</option>" +
                    "</select></label><br />" +
                    "<label>My second language of choice: <br />" +
                    "<select name = 'secondLang' id = 'secondLang'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'js'>JavaScript</option>" +
                        "<option value = 'python'>Python</option>" +
                    "</select></label><br />" +
                    "<label>My third language of choice: <br />" +
                    "<select name = 'thirdLang' id = 'thirdLang'>" +
                        "<option value = 'js'>JavaScript</option>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'python'>Python</option>" +
                    "</select></label><br />" +
                    "<input type = 'submit' value = 'Submit!' />" +
                "</body></html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String respondToFormSubmission(@RequestParam String name,
                                          @RequestParam String firstLang,
                                          @RequestParam String secondLang,
                                          @RequestParam String thirdLang){
        return "<html><body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLang + "</li>" +
                "<li>" + secondLang + "</li>" +
                "<li>" + thirdLang + "</li>" +
                "</o1>" +
                "</body></html>";
    }

}
