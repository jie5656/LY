package com.example.demo.domain;

import javax.persistence.*;

@Table(name = "spot")
@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String imgalt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgalt() {
        return imgalt;
    }

    public void setImgalt(String imgalt) {
        this.imgalt = imgalt;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgalt='" + imgalt + '\'' +
                '}';
    }
}
