package com.example.demo.domain;


import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Commentreflow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long spotid;
    private String username;
    private String content;


    public Commentreflow() {
    }

    public Commentreflow(Long spotid, String username, String content) {
        this.spotid = spotid;
        this.username = username;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


