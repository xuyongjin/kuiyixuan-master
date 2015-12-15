package com.kuiyix.web.security.realm;

import com.kuiyix.core.model.user.User;
import com.kuiyix.core.model.user.UserStatus;
import com.kuiyix.core.service.auth.AuthService;
import com.kuiyix.core.service.user.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 扩展shiro的授权realm
 * 实现用户的认证和授权数据源
 * Created by 许勇进 on 2015-11-15.
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    @Autowired
    AuthService authService;
    @Autowired
    PasswordService passwordService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String userName = (String) principalCollection.getPrimaryPrincipal();
        User user = userService.findUserByName(userName);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(authService.findStringRoles(user));
        authorizationInfo.setStringPermissions(authService.findStringPermissions(user));
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        User user = userService.findUserByName(userName);
        if (user == null) {
            throw new UnknownAccountException();
        }
        if (Boolean.TRUE.equals(user.getStatus().compareTo(UserStatus.blocked))) {
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUserName(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),
                getName()
        );
        return authenticationInfo;
    }
}
