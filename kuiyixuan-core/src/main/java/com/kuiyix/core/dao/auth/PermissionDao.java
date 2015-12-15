package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.base.IDao;
import com.kuiyix.core.model.permission.Permission;

import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public interface PermissionDao extends IDao<Permission> {
    List<Permission> selectByIds(Set<Integer> ids);
}
