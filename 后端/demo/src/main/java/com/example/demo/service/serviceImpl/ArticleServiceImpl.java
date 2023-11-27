package com.example.demo.service.serviceImpl;

import com.example.demo.domain.Article;
import com.example.demo.repository.ArticleDao;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> searchArticlesByKeyword(String keyword) {
        return articleDao.findByNameContainingIgnoreCase(keyword);
    }
}
