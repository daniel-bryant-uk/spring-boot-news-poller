package uk.co.taidev.springbootnewspoller.services;

import org.springframework.stereotype.Service;

/**
 * NewsServiceImpl
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Override
    public String getLatestNews() {
        return new CommandGetLatestNews().execute();
    }
}
