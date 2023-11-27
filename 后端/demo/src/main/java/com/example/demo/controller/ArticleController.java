package com.example.demo.controller;


import com.example.demo.domain.Article;
import com.example.demo.service.ArticleService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/spot")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/home")
    public Result<List<Article>> searchArticles(@RequestParam("keyword") String keyword) {
        System.out.println("搜索关键字为：" + keyword);
        try {
            List<Article> articles = articleService.searchArticlesByKeyword(keyword);
            System.out.println("传递给前端的内容：" + articles);
            if (!articles.isEmpty()) {
                return Result.success(articles, "文章搜索成功！");
            } else {
                return Result.error("789", "文章搜索结果为空！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("500", "内部错误！");
        }
    }

}

