package com.felici.blogapinamsan.domain;

import com.felici.blogapinamsan.dto.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * author: felici
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateArticleRequest {

    private String title;
    private String content;

}
