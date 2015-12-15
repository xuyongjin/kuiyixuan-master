package com.kuiyix.core.dao.auth;

import com.kuiyix.core.dao.base.IDao;
import com.kuiyix.core.model.resource.Resource;

import java.util.List;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-12-1.
 */
public interface ResourceDao extends IDao<Resource> {

    List<Resource> selectByIds(Set<Integer> ids);
}
