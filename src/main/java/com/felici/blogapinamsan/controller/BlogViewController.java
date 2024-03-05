package com.felici.blogapinamsan.controller;

import com.felici.blogapinamsan.dto.Article;
import com.felici.blogapinamsan.dto.ArticleListViewResponse;
import com.felici.blogapinamsan.dto.ArticleViewResponse;
import com.felici.blogapinamsan.service.BlogService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * author: felici
 */
@Controller
@RequiredArgsConstructor
public class BlogViewController {

    private final BlogService blogService;

    @GetMapping("/articles")
    public String getArticles(Model model) {
        List<ArticleListViewResponse> articles = blogService.findAll()
                .stream()
                .map(ArticleListViewResponse::new)
                .toList();

        model.addAttribute("articles", articles);
        return "articleList";
    }

    @GetMapping("/articles/{id}")
    public String getArticle(@PathVariable Long id, Model model) {
        Article article = blogService.findById(id);
        model.addAttribute("article", article);
        return "article";

    }

    @GetMapping("/new-article")
    public String newArticle(@RequestParam(required = false) Long id,
                             Model model) {
        if(id == null) {
            model.addAttribute("article", new ArticleViewResponse());

        } else {
            Article article = blogService.findById(id);
            model.addAttribute("article", article);
        }
        return "newArticle";
    }


}
