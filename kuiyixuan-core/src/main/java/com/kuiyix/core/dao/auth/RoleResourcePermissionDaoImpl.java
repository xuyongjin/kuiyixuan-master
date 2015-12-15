package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.auth.RoleResourcePermissionDao;
import com.kuiyix.core.model.permission.RoleResourcePermission;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by 许勇进 on 2015-11-16.
 */
@Repository
public class RoleResourcePermissionDaoImpl implements RoleResourcePermissionDao {
    @Autowired
    SqlSessionTemplate sessionTemplate;

    @Override
    public RoleResourcePermission selectById(Object id) {
        return sessionTemplate.selectOne("RoleResourcePermissionMapper.selectById",id);
    }

    @Override
    public int insert(RoleResourcePermission bean) {
        return sessionTemplate.insert("RoleResourcePermissionMapper.insert",bean);
    }

    @Override
    public int update(RoleResourcePermission bean) {
        return sessionTemplate.update("RoleResourcePermissionMapper.update",bean);
    }

    @Override
    public int delete(Object id) {
        return sessionTemplate.delete("RoleResourcePermissionMapper.delete",id);
    }

    @Override
    public List<RoleResourcePermission> selectByRoleIds(Set<Integer> roleIds) {
        List<RoleResourcePermission> list = new ArrayList<RoleResourcePermission>();
        boolean hasRoleId = roleIds.size() > 0;
        if (hasRoleId) {
            list = sessionTemplate.selectList("RoleResourcePermissionMapper.queryByRoleIds",new ArrayList(roleIds));
        }
        return list;
    }
}
