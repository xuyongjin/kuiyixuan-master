package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.base.IDao;
import com.kuiyix.core.model.permission.RoleResourcePermission;

import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-16.
 */
public interface RoleResourcePermissionDao extends IDao<RoleResourcePermission> {

    List<RoleResourcePermission> selectByRoleIds(Set<Integer> roleIds);
}
