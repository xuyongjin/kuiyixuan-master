package com.kuiyix.core.dao.user;

import com.github.pagehelper.PageInfo;
import com.kuiyix.core.dao.base.IDao;
import com.kuiyix.core.model.user.User;
import org.apache.ibatis.session.RowBounds;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public interface UserDao extends IDao<User> {

    User queryByName(Object name);

    PageInfo<User> findUserList(RowBounds rowBounds);
}
