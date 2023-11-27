package com.example.demo.controller;

import com.example.demo.domain.Comment;
import com.example.demo.repository.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    private final CommentDao commentDao;

    @Autowired
    public CommentController(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    @GetMapping("/{id}")
    public List<Comment> getCommentsBySpotId(@PathVariable Long id) {
        List<Comment> comments = commentDao.findBySpotid(id);
        comments.forEach(comment -> comment.setSpotid(comment.getSpotid())); // 将传递的ID赋值给spotid属性
        return comments;
    }
}

