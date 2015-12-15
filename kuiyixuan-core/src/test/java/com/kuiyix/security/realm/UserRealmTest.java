package com.kuiyix.security.realm;

import com.kuiyix.core.BaseTest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * Created by 许勇进 on 2015-11-16.
 */
public class UserRealmTest extends BaseTest {

    //@Test
    public void userRealm() {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername("xuyongjin");
        token.setPassword("123456".toCharArray());
        subject.login(token);
        Session session = subject.getSession();
        logger.info(session.getStartTimestamp());
        logger.info(session.getId());
    }
}
