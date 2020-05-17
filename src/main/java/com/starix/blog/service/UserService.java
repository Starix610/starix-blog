package com.starix.blog.service;

import com.starix.blog.entity.User;

/**
 * @author Starix
 * @date 2020-05-17 17:12
 */
public interface UserService {

    User checkUser(String username, String password);

}
