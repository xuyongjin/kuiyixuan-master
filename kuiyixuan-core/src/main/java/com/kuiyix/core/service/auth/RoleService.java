package com.kuiyix.core.service.auth;

import com.kuiyix.core.model.permission.Role;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public interface RoleService {
    Role saveRole(Role role);
    Role replaceRole(Role role);
    int removeRole(int id);
    Role findRoleById(int id);
}
