package com.kuiyix.admin.security.credentials;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by 许勇进 on 2015-11-22.
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher {
    private Cache<String,AtomicInteger> passwordRetryCache;

    public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String userName = (String) token.getPrincipal();
        AtomicInteger retryCount = passwordRetryCache.get(userName);
        if (retryCount == null) {
            retryCount = new AtomicInteger(0);
            passwordRetryCache.put(userName,retryCount);
        }

        if (retryCount.incrementAndGet() > 5) {
            throw new ExcessiveAttemptsException();
        }
        boolean matches = super.doCredentialsMatch(token,info);
        if (matches) {
            passwordRetryCache.remove(userName);
        }
        return matches;
    }
}
