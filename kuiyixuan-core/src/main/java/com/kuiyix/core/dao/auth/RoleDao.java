package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.base.IDao;
import com.kuiyix.core.model.permission.Role;
import com.kuiyix.core.model.user.User;

import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public interface RoleDao extends IDao<Role> {
    public Set<String> findStringRoles(User user);
}
