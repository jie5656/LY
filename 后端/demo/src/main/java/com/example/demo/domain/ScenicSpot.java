package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "spot")
public class ScenicSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "want")
    private int want;

    public ScenicSpot() {
    }

    public ScenicSpot(String name, int want) {
        this.name = name;
        this.want = want;
    }

    // Getter and Setter methods


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWant() {
        return want;
    }

    public void setWant(int want) {
        this.want = want;
    }
}