package com.kuiyix.core.dao.auth;

import com.kuiyix.core.model.resource.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-12-1.
 */
@Repository
public class ResourceDaoImpl implements ResourceDao{
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    /**
     * 根据id集合查找列表
     * @param ids
     * @return
     */
    @Override
    public List<Resource> selectByIds(Set<Integer> ids) {
        boolean hasIds = ids.size() > 0;
        List<Resource> list = null;
        if (hasIds) {
            list = sqlSessionTemplate.selectList("ResourceMapper.selectByIds",new ArrayList<>(ids));
        }
        return list;
    }

    /**
     * 根据id查找
     * @param id
     * @return
     */
    @Override
    public Resource selectById(Object id) {
        return sqlSessionTemplate.selectOne("ResourceMapper.selectById",id);
    }

    /**
     * 添加对象
     * @param bean
     * @return
     */
    @Override
    public int insert(Resource bean) {
        return sqlSessionTemplate.insert("ResourceMapper.insert",bean);
    }

    /**
     * 更新对象
     * @param bean
     * @return
     */
    @Override
    public int update(Resource bean) {
        return sqlSessionTemplate.update("ResourceMapper.update",bean);
    }

    /**
     * 根据单个id删除对象
     * @param id
     * @return
     */
    @Override
    public int delete(Object id) {
        return sqlSessionTemplate.delete("ResourceMapper.delete",id);
    }
}
