package uk.co.taidev.springbootnewspoller.services;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * CommandGetLatestNews
 */
public class CommandGetLatestNews extends HystrixCommand<String> {

    private static final String NEWS_REST_EP = "http://localhost:8080/news";

    private RestTemplate restTemplate = new RestTemplate();


    public CommandGetLatestNews() {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
    }


    @Override
    protected String run() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity(NEWS_REST_EP, String.class);
        return response.getBody();
    }


    @Override
    protected String getFallback() {
        return "Fallback News!";
    }
}
