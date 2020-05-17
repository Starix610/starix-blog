package com.starix.blog.service.impl;

import com.starix.blog.entity.User;
import com.starix.blog.mapper.UserMapper;
import com.starix.blog.service.UserService;
import com.starix.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @author Starix
 * @date 2020-05-17 17:13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        Example example =new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", username);
        criteria.andEqualTo("password", MD5Utils.encode(password));
        User user = userMapper.selectOneByExample(example);
        return user;
    }
}
