package com.example.demo.service.serviceImpl;

import com.example.demo.domain.Commentreflow;
import com.example.demo.repository.CommentreflowDao;
import com.example.demo.service.CommentreflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentreflowServiceImpl implements CommentreflowService {

    private final CommentreflowDao commentreflowDao;

    @Autowired
    public CommentreflowServiceImpl(CommentreflowDao commentreflowDao) {
        this.commentreflowDao = commentreflowDao;
    }

    @Override
    public Commentreflow saveCommentreflow(Commentreflow commentreflow) {
        return commentreflowDao.save(commentreflow);
    }
}

