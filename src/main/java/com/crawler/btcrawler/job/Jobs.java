package com.crawler.btcrawler.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Eggsy on 2019/3/2.
 */
@Component
public class Jobs {

    @Scheduled(cron = "0 0/1 * * * ? *")
    public void BtCrawler() {

    }
}
