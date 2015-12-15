package com.kuiyix.core.service.auth;

import com.kuiyix.core.dao.auth.AuthDao;
import com.kuiyix.core.model.permission.Permission;
import com.kuiyix.core.model.permission.Role;
import com.kuiyix.core.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-15.
 */
@Service
public class AuthServiceImpl implements AuthService{
    @Autowired
    AuthDao authDao;
    @Autowired
    RoleService roleService;
    @Autowired
    PermissionService permissionService;
    @Autowired
    RoleResourcePermissionService roleResourcePermissionService;

    @Override
    public Set<Integer> findRoleIds(Integer userId) {
        return authDao.findRoleIds(userId);
    }

    @Override
    public Set<String> findStringRoles(User user) {
        Set<String> stringRoles = new HashSet<String>();
        Set<Integer> roleIdS = this.findRoleIds(user.getId());
        for (Integer roleId:roleIdS) {
            Role role = roleService.findRoleById(roleId);
            stringRoles.add(role.getRole());
        }
        return stringRoles;
    }

    @Override
    public Set<String> findStringPermissions(User user) {
        Set<Integer> roleIds = this.findRoleIds(user.getId());
        Set<Integer> permissionIdSet = roleResourcePermissionService.findPermissionIdsByRoleIds(roleIds);
        List<Permission> permissionList = permissionService.findStringPermissions(permissionIdSet);
        Set<String> stringPermissions = new HashSet<String>();
        for (Permission p:permissionList) {
            stringPermissions.add(p.getPermission());
        }
        return stringPermissions;
    }
}
