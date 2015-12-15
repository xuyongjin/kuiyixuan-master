package com.kuiyix.core.service.auth;

import com.kuiyix.core.constants.Constants;
import com.kuiyix.core.model.user.User;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

/**
 * Created by 许勇进 on 2015-11-26.
 */
@Service
public class PasswordServiceImpl implements PasswordService {
    private User user;
    @Override
    public String encryptPassword(Object o) throws IllegalArgumentException {
        User user = (User) o;
        Hash hash = new SimpleHash(
                Constants.PASSWORD_ALGORITHMNAME,
                user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),
                Constants.PASSWORD_HASHITERATIONS);
        return hash.toHex();
    }

    @Override
    public boolean passwordsMatch(Object o, String s) {
        return false;
    }
}
