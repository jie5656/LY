package com.example.demo.domain;

import javax.persistence.*;

@Table(name = "user")
@Entity
public class User {

    // 注意属性名要与数据表中的字段名一致
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // 用户名属性varchar对应String
    private String username;

    // 密码属性varchar对应String
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
