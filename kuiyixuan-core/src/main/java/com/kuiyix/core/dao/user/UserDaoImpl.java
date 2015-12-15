package com.kuiyix.core.dao.user;

import com.github.pagehelper.PageInfo;
import com.kuiyix.core.dao.user.UserDao;
import com.kuiyix.core.model.user.User;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 许勇进 on 2015-11-15.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    SqlSessionTemplate sessionTemplate;

    @Override
    public User queryByName(Object name) {
        HashMap map = new HashMap();
        map.put("userName",name);
        return sessionTemplate.selectOne("UserMapper.queryUserByName",map);
    }

    @Override
    public User selectById(Object id) {
        return sessionTemplate.selectOne("UserMapper.selectById",id);
    }

    @Override
    public int insert(User bean) {
        return sessionTemplate.insert("UserMapper.saveUser",bean);
    }

    @Override
    public int update(User bean) {
        return sessionTemplate.update("UserMapper.update",bean);
    }

    @Override
    public int delete(Object id) {
        return sessionTemplate.delete("UserMapper.delete",id);
    }

    public PageInfo<User> findUserList(RowBounds rowBounds) {
        List<User> users = sessionTemplate.selectList("UserMapper.findUserList",null,rowBounds);
        return new PageInfo<User>(users);
    }
}
