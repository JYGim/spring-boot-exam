package com.felici.blogapinamsan.service;

import com.felici.blogapinamsan.domain.AddArticleRequest;
import com.felici.blogapinamsan.domain.UpdateArticleRequest;
import com.felici.blogapinamsan.dto.Article;
import com.felici.blogapinamsan.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * author: felici
 */
@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {

        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(Long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Could not find: " + id));
    }

    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Not found: " + id));

        article.update(request.getTitle(), request.getContent());
        return article;
    }


}
