package com.kuiyix.admin.security.filter;

import com.kuiyix.core.constants.Constants;
import com.kuiyix.core.service.user.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by 许勇进 on 2015-11-22.
 */
public class SysUserFilter extends PathMatchingFilter {
    @Autowired
    UserService userService;
    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute(Constants.CURRENT_USER, userService.findUserByName(username));
        return true;
    }
}
