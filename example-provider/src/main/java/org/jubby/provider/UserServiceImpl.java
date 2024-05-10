package org.jubby.provider;

import org.jubby.common.model.User;
import org.jubby.common.service.UserSeivice;

public class UserServiceImpl implements UserSeivice {
    @Override
    public User getUser(User user) {
        System.out.println("用户名：" +user.getName());
        return user;
    }
}
