package com.kuiyix.core.service.user;

import com.github.pagehelper.PageInfo;
import com.kuiyix.core.BaseTest;
import com.kuiyix.core.model.user.User;
import com.kuiyix.core.model.user.UserStatus;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public class UserTest extends BaseTest {
    private UserService userService;
    public UserTest() {
        userService = this.context.getBean(UserServiceImpl.class);
    }

    @Test
    public void removeUser() {
        User user = userService.findUserByName("test");
        userService.removeUser(user);
        userService.findUserById(user.getId());
        userService.findUserByName(user.getUserName());
    }
    @Test
    public void updateUser() {
        User user = userService.findUserByName("test");
        logger.info("----------------:" + user.getPhone());
        user.setUserName("test");
        user.setCreateDate(new Date());
        user.setEmail("saf229112@qq.com");
        user.setPhone("111111111111");
        user.setAdmin(true);
        user.setStatus(UserStatus.normal);
        user.setPassword("123456");
        user.setDeleted(true);
        user.setId(12);
        userService.updateUser(user);
        logger.info("-----------------------------------------------");
        User user2 = userService.findUserByName("test");
        logger.info(user2.getPhone());
    }

    @Test
    public void saveUser() {

        User user = new User();
        user.setUserName("test2");
        user.setCreateDate(new Date());
        user.setEmail("13213@qq.com");
        user.setPhone("181231313213");
        user.setAdmin(true);
        user.setStatus(UserStatus.normal);
        user.setPassword("123456");
        userService.saveUser(user);
        logger.info("-----------------------------------------------");
        logger.info(userService.findUserByName("test2").getUserName());
    }

    @Test
    public void findUserByName() {
        userService.findUserByName("xyj");
        logger.info("-------------------------------------------------");
        userService.findUserByName("xyj");
    }

    @Test
    public void findUserById() {
        User user1 = userService.findUserById(11);
        logger.info(user1.getEmail());
        logger.info("--------------------------------------------");
        User user2 = userService.findUserById(12);
        logger.info(user2.getEmail());
    }

    @Test
    public void findUserList() {
        PageInfo<User> pageInfo = userService.findUserList(2,2);
        List<User> user = pageInfo.getList();
        userService.findUserList(2,2);
    }
}
