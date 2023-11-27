package com.example.demo.controller;

import com.example.demo.domain.Commentreflow;
import com.example.demo.service.CommentreflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment")
public class CommentreflowController {

    private final CommentreflowService commentreflowService;

    @Autowired
    public CommentreflowController(CommentreflowService commentreflowService) {
        this.commentreflowService = commentreflowService;
    }

    @PostMapping("/commentreflow")
    public ResponseEntity<Commentreflow> saveCommentreflow(@RequestBody Commentreflow commentreflow) {
        System.out.println("接收到来自前端的评论数据:");
        System.out.println("Spot ID: " + commentreflow.getSpotid());
        System.out.println("用户名: " + commentreflow.getUsername());
        System.out.println("评论详情: " + commentreflow.getContent());
        Commentreflow savedCommentreflow = commentreflowService.saveCommentreflow(commentreflow);
        return new ResponseEntity<>(savedCommentreflow, HttpStatus.CREATED);
    }
}
