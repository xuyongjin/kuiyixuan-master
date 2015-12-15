package com.kuiyix.core.service.auth;

import com.kuiyix.core.dao.auth.RoleDao;
import com.kuiyix.core.model.permission.Role;
import com.kuiyix.core.service.auth.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by 许勇进 on 2015-11-15.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDao roleDao;

    @CachePut(value = "roles",key = "#role.id")
    @Override
    public Role replaceRole(Role role) {
        roleDao.update(role);
        return role;
    }

    @CacheEvict(value = "roles",key = "#id",beforeInvocation = true)
    @Override
    public int removeRole(int id) {
        return roleDao.delete(id);

    }

    @CachePut(value = "roles",key = "#role.id")
    @Override
    public Role saveRole(Role role) {
        roleDao.insert(role);
        return role;
    }

    @Cacheable(value = "roles",key = "#id")
    @Override
    public Role findRoleById(int id) {
        return roleDao.selectById(id);
    }
}
