package com.kuiyix.core.service.roleresourcepermisstionservice;

import com.kuiyix.common.constants.Constants;
import com.kuiyix.core.BaseTest;
import com.kuiyix.core.model.resource.Resource;
import com.kuiyix.core.service.auth.ResourceService;
import com.kuiyix.core.service.auth.ResourceServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 许勇进 on 2015-12-1.
 */
public class ResourceServiceTest extends BaseTest{

    ResourceService resourceService;
    public ResourceServiceTest() {
        resourceService = super.context.getBean(ResourceServiceImpl.class);
    }
    @Test
    public void saveResource() {
        Resource resource = new Resource();
        resource.setName("资源");
        resource.setIdentity("");
        resource.setParentId(0);
        resource.setParentIds("0" + Constants.SEPARATOR_FRONTSLASH);
        resource.setSort(1);
        resource.setUrl("");
        resource.setIcon("");
        resource.setShow(true);
        resourceService.saveResource(resource);
        //resourceService.findResourceById(1);
    }

    @Test
    public void replaceResource() {
        Resource resource = resourceService.findResourceById(1);
        resource.setName("242");
        resource.setIdentity("dsaf");
        resource.setParentId(1);
        resource.setParentIds("0" + Constants.SEPARATOR_FRONTSLASH + "1" + Constants.SEPARATOR_FRONTSLASH);
        resource.setSort(2);
        resource.setIcon("sdafaf");
        resource.setUrl("asfdaf");
        resource.setShow(false);
        resourceService.replaceResource(resource);
        Resource resource1 = resourceService.findResourceById(1);
        logger.info(resource1.isShow());
    }

    @Test
    public void removeResource() {
        resourceService.findResourceById(1);
        resourceService.removeResource(1);
        resourceService.findResourceById(1);
    }

    @Test
    public void findResourcesByIds() {
        Set<Object> set = new HashSet<Object>();
        set.add(2);
        resourceService.findResourcesByIds(set);
    }
}
