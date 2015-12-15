package com.kuiyix.core.service.auth;

import com.kuiyix.core.model.permission.RoleResourcePermission;

import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-16.
 */
public interface RoleResourcePermissionService {
    RoleResourcePermission saveRoleResourcePerm(RoleResourcePermission roleResourcePermission);
    RoleResourcePermission replaceRoleResourcePerm(RoleResourcePermission roleResourcePermission);
    int removeRoleResourcePerm(Object id);
    RoleResourcePermission findRoleResourcePerm(Object id);
    Set<Integer> findPermissionIdsByRoleIds(Set<Integer> roleIds);
}
