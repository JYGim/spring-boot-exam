package com.felici.blogapinamsan.dto;

import lombok.Getter;

/**
 * author: felici
 */
@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
