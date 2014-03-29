package uk.co.taidev.springbootnewspoller.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * NewsServiceImpl
 */
@Service
public class NewsServiceImpl implements NewsService {


    //    @Autowired
    private RestTemplate restTemplate = new RestTemplate();


    @Override
    public String getLatestNews() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/news", String.class);

        String data = response.getBody();

        return data;
    }
}
