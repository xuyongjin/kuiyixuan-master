package com.kuiyix.core.service.roleresourcepermisstionservice;

import com.kuiyix.core.BaseTest;
import com.kuiyix.core.model.permission.Permission;
import com.kuiyix.core.model.permission.PermissionType;
import com.kuiyix.core.service.auth.PermissionService;
import com.kuiyix.core.service.auth.PermissionServiceImpl;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-30.
 */
public class PermissionServiceTest extends BaseTest{
    private PermissionService permissionService;
    public PermissionServiceTest() {
        permissionService = super.context.getBean(PermissionServiceImpl.class);
    }

    @Test
    public void savePermission() {
        Permission permission = new Permission();
        permission.setName(PermissionType.audit.getInfo());
        permission.setPermission(PermissionType.audit.toString());
        permission.setDescription("拥有审核操作权限");
        permission.setShow(true);
        permissionService.savePermission(permission);
    }

    @Test
    public void findPermissiones() {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        permissionService.findStringPermissions(set);
        permissionService.findStringPermissions(set);
        permissionService.findPermissionById(2);
    }
    @Test
    public void updatePermissiones() {
        permissionService.findPermissionById(3);
        Permission permission = permissionService.findPermissionById(3);
        permission.setShow(false);
        permissionService.replacePermission(permission);
        permission = permissionService.findPermissionById(3);
        logger.info(permission.isShow());
    }
    @Test
    public void removePermissiones() {
        Permission permission = permissionService.findPermissionById(2);
        permissionService.removePermission(2);
        permissionService.findPermissionById(2);
    }
}
