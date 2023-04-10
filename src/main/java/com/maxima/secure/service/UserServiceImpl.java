package com.maxima.secure.service;

import com.maxima.secure.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ShaPasswordEncoder shaPasswordEncoder;

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(shaPasswordEncoder.encodePassword("123456", null));
        return user;
    }

}
