package demo.service;

import demo.domain.Word;

public interface WordService {

    Word getSubject();

    Word getVerb();

    Word getArticle();

    Word getAdjective();

    Word getNoun();

    Word defaultAdjective();

    Word defaultSubject();

    Word defaultNoun();

}
