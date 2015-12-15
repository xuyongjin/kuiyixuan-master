package com.kuiyix.core.service.auth;

import com.kuiyix.core.dao.auth.RoleResourcePermissionDao;
import com.kuiyix.core.model.permission.RoleResourcePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-16.
 */
@Service
public class RoleResourcePermissionServiceImpl implements RoleResourcePermissionService{
    @Autowired
    RoleResourcePermissionDao resourcePermissionDao;


    /**
     * 保存对象,同时存入缓存
     * @param roleResourcePermission
     * @return
     */
    @CachePut(value = "roleResourcePerm",key = "#roleResourcePermission.id")
    @Override
    public RoleResourcePermission saveRoleResourcePerm(RoleResourcePermission roleResourcePermission) {
        resourcePermissionDao.insert(roleResourcePermission);
        return roleResourcePermission;
    }

    /**
     * 更新对象,同时存入缓存
     * @param roleResourcePermission
     * @return
     */
    @CachePut(value = "roleResourcePerm",key = "#roleResourcePermission.id")
    @Override
    public RoleResourcePermission replaceRoleResourcePerm(RoleResourcePermission roleResourcePermission) {
        resourcePermissionDao.update(roleResourcePermission);
        return roleResourcePermission;
    }

    /**
     * 删除缓存,同时删除缓存
     * @param id
     * @return
     */
    @CacheEvict(value = "roleResourcePerm",key = "#id")
    @Override
    public int removeRoleResourcePerm(Object id) {
        return resourcePermissionDao.delete(id);
    }

    /**
     * 根据单个id查找对象
     * @param id
     * @return
     */
    @Cacheable(value = "roleResourcePerm",key = "#id")
    @Override
    public RoleResourcePermission findRoleResourcePerm(Object id) {
        return resourcePermissionDao.selectById(id);
    }

    /**
     * 根据多个角色id,得到对象id集合
     * @param roleIds
     * @return
     */
    @Override
    public Set<Integer> findPermissionIdsByRoleIds(Set<Integer> roleIds) {
        List<RoleResourcePermission> roleResourcePermissionList = resourcePermissionDao.selectByRoleIds(roleIds);
        Set<Integer> permissionIdSet = new HashSet<Integer>();
        for (RoleResourcePermission rrr:roleResourcePermissionList) {
            String[] permissionIds = rrr.getPermissionIds().trim().split(",");
            for (String permissionId:permissionIds) {
                permissionIdSet.add(Integer.parseInt(permissionId));
            }
        }
        return permissionIdSet;
    }
}
