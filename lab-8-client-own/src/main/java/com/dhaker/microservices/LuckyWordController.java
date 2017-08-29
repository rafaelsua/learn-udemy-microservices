package com.dhaker.microservices;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@ConfigurationProperties(prefix = "wordConfig")
public class LuckyWordController {

    String luckyWord;
    String preamble;
    String fullStatement;

    @PostConstruct
    public void init() {
        fullStatement = preamble + ": "
            + luckyWord;
    }

    @RequestMapping("/lucky-word")
    public String showLuckyWord() {
        return fullStatement;
    }

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }
}
