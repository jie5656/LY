package com.example.demo.service;


import com.example.demo.domain.User;

public interface UserService {
    /**
     * 登录业务逻辑
     *
     * @param username 账户名
     * @param password 密码
     * @return
     */
    User loginService(String username, String password);

    /**
     * 注册业务逻辑
     *
     * @param user 要注册的User对象，属性中主键id要为空，若id不为空可能会覆盖已存在的user
     * @return
     */
    User registService(User user);
}