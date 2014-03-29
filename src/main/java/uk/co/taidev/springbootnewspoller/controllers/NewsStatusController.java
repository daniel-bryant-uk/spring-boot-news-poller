package uk.co.taidev.springbootnewspoller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.co.taidev.springbootnewspoller.services.NewsService;

@Controller
@EnableAutoConfiguration
public class NewsStatusController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/news")
    @ResponseBody
    String home() {
        return "Found the following news: " + newsService.getLatestNews();
    }
}