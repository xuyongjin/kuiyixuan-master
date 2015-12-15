package com.kuiyix.core.service.roleresourcepermisstionservice;


import com.kuiyix.core.model.permission.RoleType;
import org.junit.Test;

/**
 * Created by 许勇进 on 2015-11-29.
 */
public class RoleTypeTest {

    @Test
    public void roleType () {
        System.out.println(RoleType.admin.toString());
        System.out.println(RoleType.admin.getInfo());
    }
}
