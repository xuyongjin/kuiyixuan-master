package com.kuiyix.core.service.auth;

import com.kuiyix.core.dao.auth.PermissionDao;
import com.kuiyix.core.model.permission.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-16.
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    PermissionDao permissionDao;

    @Cacheable(value = "permissiones",key = "#id")
    @Override
    public Permission findPermissionById(int id) {
        return permissionDao.selectById(id);
    }

    @CachePut(value = "permissiones",key = "#bean.id")
    @Override
    public Permission savePermission(Permission bean) {
        permissionDao.insert(bean);
        return bean;
    }

    @CachePut(value = "permissiones",key = "#bean.id")
    @Override
    public Permission replacePermission(Permission bean) {
       permissionDao.update(bean);
        return bean;
    }

    @CacheEvict(value = "permissiones",key = "#id",beforeInvocation = true)
    @Override
    public int removePermission(int id) {
        return permissionDao.delete(id);
    }

    @Override
    public List<Permission> findStringPermissions(Set<Integer> ids) {
        List<Permission> list = new ArrayList<Permission>();
        boolean hasId = ids.size() > 0;
        if (hasId) {
            list = permissionDao.selectByIds(ids);
        }

        return list;

    }
}
