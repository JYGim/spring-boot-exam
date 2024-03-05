package com.felici.blogapinamsan.repository;

import com.felici.blogapinamsan.dto.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author: felici
 */
public interface BlogRepository extends JpaRepository<Article, Long> {
}
