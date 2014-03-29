package uk.co.taidev.springbootnewspoller.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class NewsStatusController {

    @RequestMapping("/news")
    @ResponseBody
    String home() {
        return "No news is good news!";
    }
}