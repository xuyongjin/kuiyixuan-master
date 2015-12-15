package com.kuiyix.core.service.auth;

import com.kuiyix.core.model.resource.Resource;

import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-12-1.
 */
public interface ResourceService {
    Resource saveResource(Resource resource);
    Resource replaceResource(Resource resource);
    int removeResource(Object id);
    Resource findResourceById(Object id);
    List<Resource> findResourcesByIds(Set<Object> ids);
}
