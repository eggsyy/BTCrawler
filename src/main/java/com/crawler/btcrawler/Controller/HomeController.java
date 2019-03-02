package com.crawler.btcrawler.Controller;

import com.crawler.btcrawler.Service.BtCrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Eggsy on 2019/3/2.
 */
@Controller
public class HomeController {

    @Autowired
    BtCrawlerService btCrawlerService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
