package com.crawler.btcrawler.Service;



import com.github.kevinsawicki.http.HttpRequest;
import org.springframework.stereotype.Service;

/**
 * Created by Eggsy on 2019/3/2.
 */

@Service
public class BtCrawlerService {

    public void BtCrawler() {
        String url = "";
        String response = HttpRequest.get(url).header("Accept-Language", "zh,zh-CN;q=0.9").body();
        System.out.println(response);
    }
}
