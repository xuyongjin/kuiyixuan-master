package com.kuiyix.core.service.user;

import com.github.pagehelper.PageInfo;
import com.kuiyix.core.model.user.User;

import java.util.List;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    User removeUser(User user);
    User findUserById(int id);
    User findUserByName(String userName);

    PageInfo<User> findUserList(int pageNum,int pageSize);
}
