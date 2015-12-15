package com.kuiyix.admin.controller.user;

import com.github.pagehelper.PageInfo;
import com.kuiyix.admin.ajax.AjaxObject;
import com.kuiyix.core.model.user.User;
import com.kuiyix.core.model.user.UserStatus;
import com.kuiyix.core.service.user.UserService;
import org.apache.shiro.authc.credential.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 用户管理
 * Created by 许勇进 on 2015-12-6.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    PasswordService passwordService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String users(HttpServletRequest request, ModelMap model) {
        int pageNum = ServletRequestUtils.getIntParameter(request,"pageNum",0);
        int pageSize = ServletRequestUtils.getIntParameter(request,"paeSize",0);
        PageInfo<User> pageInfo = userService.findUserList(pageNum,pageSize);
        model.put("pageInfo",pageInfo);
        return "user/users";
    }

    @RequestMapping(value = "user/add",method = RequestMethod.GET)
    public String addUser() {
        return "user/adduser";
    }
    @RequestMapping(value = "user/add",method = RequestMethod.POST)
    public AjaxObject addUser(HttpServletRequest request) throws Exception {
        String userName = ServletRequestUtils.getStringParameter(request,"userName");
        String email = ServletRequestUtils.getStringParameter(request,"email");
        String phone = ServletRequestUtils.getStringParameter(request,"phone");
        boolean isAdmin = ServletRequestUtils.getBooleanParameter(request,"isAdmin");

        User user = new User();
        user.setUserName(userName);
        user.setCreateDate(new Date());
        user.setEmail(email);
        user.setPhone(phone);
        user.setAdmin(isAdmin);
        user.setStatus(UserStatus.normal);
        user.setPassword("123456");
        userService.saveUser(user);
        AjaxObject object = new AjaxObject();
        object.setResultMsg("用户:"+userName+",添加成功！");
        return object;
    }
}
