package com.kuiyix.core.cache.annotation.user;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Caching;

import java.lang.annotation.*;

/**
 * 删除user缓存
 * Created by 许勇进 on 2015-11-28.
 */
@Caching(
        evict = {
                @CacheEvict(value = "users",key = "#user.id" ,beforeInvocation = true),
                @CacheEvict(value = "users",key = "#user.userName",beforeInvocation = true),
                @CacheEvict(value = "users",key = "#user.email",beforeInvocation = true),
                @CacheEvict(value = "users",key = "#user.phone",beforeInvocation = true)
        }
)
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface UserRemoveCache {
}
