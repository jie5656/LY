package com.example.demo.service;

import com.example.demo.domain.Article;

import java.util.List;

public interface ArticleService {
    List<Article> searchArticlesByKeyword(String keyword);
}
