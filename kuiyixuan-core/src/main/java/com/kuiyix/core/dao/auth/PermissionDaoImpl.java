package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.auth.PermissionDao;
import com.kuiyix.core.model.permission.Permission;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by 许勇进 on 2015-11-15.
 */
@Repository
public class PermissionDaoImpl implements PermissionDao{
    @Autowired
    SqlSessionTemplate sessionTemplate;

    @Override
    public Permission selectById(Object id) {
        return sessionTemplate.selectOne("PermissionMapper.selectById",id);
    }

    @Override
    public List<Permission> selectByIds(Set<Integer> ids) {
        boolean hasIds = ids.size() > 0;
        List<Permission> list = null;
        if (hasIds) {
            list = sessionTemplate.selectList("PermissionMapper.queryByIds",new ArrayList(ids));
        }
        return list;
    }

    @Override
    public int insert(Permission bean) {
        return sessionTemplate.insert("PermissionMapper.insert",bean);
    }

    @Override
    public int update(Permission bean) {
        return sessionTemplate.update("PermissionMapper.update",bean);
    }

    @Override
    public int delete(Object id) {
        return sessionTemplate.delete("PermissionMapper.delete",id);
    }
}
