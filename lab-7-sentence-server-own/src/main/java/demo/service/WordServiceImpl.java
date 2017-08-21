package demo.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import demo.dao.AdjectiveClient;
import demo.dao.ArticleClient;
import demo.dao.NounClient;
import demo.dao.SubjectClient;
import demo.dao.VerbClient;
import demo.domain.Word;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    VerbClient verbClient;
    @Autowired
    SubjectClient subjectClient;
    @Autowired
    ArticleClient articleClient;
    @Autowired
    AdjectiveClient adjectiveClient;
    @Autowired
    NounClient nounClient;

    @Override
    @HystrixCommand(fallbackMethod = "defaultSubject")
    public Word getSubject() {
        return subjectClient.getWord();
    }

    @Override
    public Word defaultSubject() {
        return new Word("He/ She");
    }

    @Override
    public Word getVerb() {
        return verbClient.getWord();
    }

    @Override
    public Word getArticle() {
        return articleClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "defaultAdjective")
    public Word getAdjective() {
        return adjectiveClient.getWord();
    }

    @Override
    public Word defaultAdjective() {
        return new Word(StringUtils.EMPTY);
    }

    @Override
    @HystrixCommand(fallbackMethod = "defaultNoun")
    public Word getNoun() {
        return nounClient.getWord();
    }

    @Override
    public Word defaultNoun() {
        return new Word("Someone");
    }
}
