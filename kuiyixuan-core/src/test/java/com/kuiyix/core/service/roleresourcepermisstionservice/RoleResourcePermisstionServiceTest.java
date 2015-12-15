package com.kuiyix.core.service.roleresourcepermisstionservice;

import com.kuiyix.core.BaseTest;
import com.kuiyix.core.service.auth.RoleResourcePermissionServiceImpl;
import org.junit.Test;

import java.util.HashSet;

/**
 * Created by 许勇进 on 2015-11-28.
 */
public class RoleResourcePermisstionServiceTest extends BaseTest {

    @Test
    public void roleRsourcePermisstionServiceTest() {
        RoleResourcePermissionServiceImpl permissionService = this.context.getBean(RoleResourcePermissionServiceImpl.class);
        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        permissionService.findPermissionIdsByRoleIds(set);

    }
}
