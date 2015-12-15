package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.base.IDao;
import com.kuiyix.core.model.permission.Auth;

import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public interface AuthDao extends IDao<Auth> {

    Set<Integer> findRoleIds(Integer userId);
}
