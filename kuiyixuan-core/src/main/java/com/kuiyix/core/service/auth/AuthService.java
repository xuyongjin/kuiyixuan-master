package com.kuiyix.core.service.auth;

import com.kuiyix.core.model.user.User;
import org.apache.shiro.web.tags.SecureTag;

import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public interface AuthService {
    Set<Integer> findRoleIds(Integer userId);
    Set<String> findStringRoles(User user);
    Set<String> findStringPermissions(User user);
}
