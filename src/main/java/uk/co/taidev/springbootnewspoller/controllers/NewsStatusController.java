package uk.co.taidev.springbootnewspoller.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@EnableAutoConfiguration
public class NewsStatusController {

    //    @Autowired
    private RestTemplate restTemplate = new RestTemplate();


    @RequestMapping("/news")
    @ResponseBody
    String home() {

        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/news", String.class);

        String data = response.getBody();

        return "Found the following news: " + data;
    }
}