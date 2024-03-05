package com.felici.blogapinamsan.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * author: felici
 */
@Getter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
        this.updatedAt = article.getUpdatedAt();
    }
}
