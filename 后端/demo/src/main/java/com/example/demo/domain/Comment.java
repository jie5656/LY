package com.example.demo.domain;

import javax.persistence.*;

@Table(name = "comment")
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long spotid;
    private String username;
    private String imgurl;
    private String content;

    public Comment(Long id, Long spotid, String username, String imgurl, String content) {
        this.id = id;
        this.spotid = spotid;
        this.username = username;
        this.imgurl = imgurl;
        this.content = content;
    }

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpotid() {
        return spotid;
    }

    public void setSpotid(Long spotid) {
        this.spotid = spotid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
