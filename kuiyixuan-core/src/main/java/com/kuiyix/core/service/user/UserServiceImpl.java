package com.kuiyix.core.service.user;

import com.github.pagehelper.PageInfo;
import com.kuiyix.core.cache.annotation.user.UserRemoveCache;
import com.kuiyix.core.cache.annotation.user.UserSaveCache;
import com.kuiyix.core.cache.annotation.user.UserUpdateCache;
import com.kuiyix.core.dao.user.UserDao;
import com.kuiyix.core.model.user.User;
import org.apache.ibatis.session.RowBounds;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by 许勇进 on 2015-11-15.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Autowired
    PasswordService passwordService;

    @UserUpdateCache
    @Override
    public User updateUser(User user) {
         userDao.update(user);
        return user;
    }

    /**
     * 删除对象 且返回该对象
     * @param user
     * @return
     */
    @UserRemoveCache
    @Override
    public User removeUser(User user) {
        userDao.delete(user.getId());
        return user;
    }

    @Cacheable(value = "users", key="#id")
    @Override
    public User findUserById(int id) {
        return userDao.selectById(id);
    }

    @Cacheable(value = "users",key = "#userName")
    @Override
    public User findUserByName(String userName) {
        return userDao.queryByName(userName);
    }

    @UserSaveCache
    @Override
    public User saveUser(User user) {
        String randomsalt = new SecureRandomNumberGenerator().nextBytes().toHex();//生成随机数作为盐
        ByteSource byteSource = ByteSource.Util.bytes(randomsalt);
        user.setSalt(byteSource.toHex());

        user.setPassword(passwordService.encryptPassword(user));
        userDao.insert(user);
        return user;
    }

    @Override
    public PageInfo<User> findUserList(int pageNum,int pageSize) {
        RowBounds rowBounds = new RowBounds(pageNum,pageSize);
        return userDao.findUserList(rowBounds);
    }
}
