package com.kuiyix.core.service.auth;

import com.kuiyix.core.model.permission.Permission;

import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-16.
 */
public interface PermissionService {
    Permission findPermissionById(int id);
    Permission savePermission(Permission bean);
    Permission replacePermission(Permission bean);
    int removePermission(int id);
    List<Permission> findStringPermissions(Set<Integer> ids);
}
