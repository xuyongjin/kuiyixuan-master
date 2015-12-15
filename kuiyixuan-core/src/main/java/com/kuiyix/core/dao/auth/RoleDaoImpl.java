package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.auth.RoleDao;
import com.kuiyix.core.model.permission.Role;
import com.kuiyix.core.model.user.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by 许勇进 on 2015-11-15.
 */
@Repository
public class RoleDaoImpl implements RoleDao {
    @Autowired
    SqlSessionTemplate sessionTemplate;


    @Override
    public Role selectById(Object id) {
        return sessionTemplate.selectOne("RoleMapper.queryRoleById",id);
    }

    @Override
    public int insert(Role bean) {
        return sessionTemplate.insert("RoleMapper.save",bean);
    }

    @Override
    public int update(Role bean) {
        return sessionTemplate.update("RoleMapper.update",bean);
    }

    @Override
    public int delete(Object id) {
        return sessionTemplate.delete("RoleMapper.delete",id);
    }

    @Override
    public Set<String> findStringRoles(User user) {
        return null;
    }
}
