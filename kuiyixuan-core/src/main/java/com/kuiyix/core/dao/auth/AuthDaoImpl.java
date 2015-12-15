package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.auth.AuthDao;
import com.kuiyix.core.model.permission.Auth;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by 许勇进 on 2015-11-15.
 */
@Repository
public class AuthDaoImpl implements AuthDao {
    @Autowired
    SqlSessionTemplate sessionTemplate;

    @Override
    public Auth selectById(Object id) {
        return null;
    }

    @Override
    public int delete(Object id) {
        return 0;
    }

    @Override
    public int update(Auth bean) {
        return 0;
    }

    @Override
    public int insert(Auth bean) {
        return 0;
    }

    @Override
    public Set<Integer> findRoleIds(Integer userId) {
        Set<Integer> roleIdSet = new HashSet<Integer>();

        HashMap map = new HashMap();
        map.put("userId",userId);
        List<String> list = sessionTemplate.selectList("AuthMapper.queryRoleIds",map);
        for (String roleIds:list) {
            String[] roleIdArrays = roleIds.trim().split(",");
            for(String roleId:roleIdArrays) {
                roleIdSet.add(Integer.parseInt(roleId));
            }
        }
        return roleIdSet;
    }
}
