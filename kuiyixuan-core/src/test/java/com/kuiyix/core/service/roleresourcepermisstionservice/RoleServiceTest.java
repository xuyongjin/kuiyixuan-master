package com.kuiyix.core.service.roleresourcepermisstionservice;

import com.kuiyix.core.BaseTest;
import com.kuiyix.core.model.permission.Role;
import com.kuiyix.core.model.permission.RoleType;
import com.kuiyix.core.service.auth.RoleService;
import com.kuiyix.core.service.auth.RoleServiceImpl;
import org.junit.Test;

/**
 * Created by 许勇进 on 2015-11-29.
 */
public class RoleServiceTest extends BaseTest{
    RoleService roleService;

    public RoleServiceTest() {
        roleService = super.context.getBean(RoleServiceImpl.class);
    }

    @Test
    public void saveROle() {
        Role role = new Role();
        role.setRole(RoleType.admin.toString());
        role.setName(RoleType.admin.getInfo());
        role.setDescription("拥有所有权限");
        role.setShow(true);
        roleService.saveRole(role);

    }

    @Test
    public void replaceRole() {
        //roleService.findRoleById(1);
        //Role role = roleService.findRoleById(1);
        Role role = new Role();
        role.setId(3);
        role.setId(role.getId());
        role.setRole(RoleType.deputymoderator.toString());
        role.setName(RoleType.deputymoderator.getInfo());
        role.setDescription("作者dafa");
        role.setShow(false);
        roleService.replaceRole(role);
        roleService.findRoleById(3);
    }

    @Test
    public void removeRole() {
        Role role = roleService.findRoleById(3);
        roleService.removeRole(role.getId());
        roleService.findRoleById(3);
    }
}
