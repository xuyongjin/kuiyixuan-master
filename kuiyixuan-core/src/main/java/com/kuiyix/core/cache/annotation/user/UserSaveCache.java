package com.kuiyix.core.cache.annotation.user;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;

import java.lang.annotation.*;

/**
 * Created by 许勇进 on 2015-11-28.
 */


/**
 * 保存用户缓存注解
 */
 @Caching(
            put = {
                    @CachePut(value = "users",key = "#user.id"),
                    @CachePut(value = "users",key = "#user.userName"),
                    @CachePut(value = "users",key = "#user.email"),
                    @CachePut(value = "users",key = "#user.phone")
            }
 )
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface UserSaveCache {
}
