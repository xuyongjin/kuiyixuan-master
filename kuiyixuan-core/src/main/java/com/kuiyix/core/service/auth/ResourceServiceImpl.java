package com.kuiyix.core.service.auth;

import com.kuiyix.common.utils.TypeConvertUtils;
import com.kuiyix.core.dao.auth.ResourceDao;
import com.kuiyix.core.model.resource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-12-1.
 */
@Service
public class ResourceServiceImpl implements ResourceService{
    @Autowired
    ResourceDao resourceDao;

    /**
     * 添加资源,同时存入缓存中
     * @param resource
     * @return
     */
    @CachePut(value = "resources",key = "#resource.id")
    @Override
    public Resource saveResource(Resource resource) {
        resourceDao.insert(resource);
        return resource;
    }

    /**
     * 更新资源,同时更新缓存
     * @param resource
     * @return
     */
    @CachePut(value = "resources",key = "#resource.id")
    @Override
    public Resource replaceResource(Resource resource) {
        resourceDao.update(resource);
        return resource;
    }

    /**
     * 根据单个id删除资源,同时删除缓存中相对应的
     * @param id
     * @return
     */
    @CacheEvict(value = "resources",key = "#id",beforeInvocation = true)
    @Override
    public int removeResource(Object id) {
        return resourceDao.delete(id);
    }

    /**
     * 根据单个id查找,同时存入缓存
     * @param id
     * @return
     */
    @Cacheable(value = "resources",key = "#id")
    @Override
    public Resource findResourceById(Object id) {
        return resourceDao.selectById(id);
    }

    /**
     * 根据多个id查找资源
     * @param ids
     * @return
     */
    @Override
    public List<Resource> findResourcesByIds(Set<Object> ids) {
        return resourceDao.selectByIds(TypeConvertUtils.objsetToIntset(ids));
    }
}
