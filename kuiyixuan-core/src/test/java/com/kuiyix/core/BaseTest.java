package com.kuiyix.core;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public abstract class BaseTest {
    protected Logger logger;
    protected ApplicationContext context;

    public BaseTest() {
        initLog4j();
        initSpringJunit();
    }

    private final void initLog4j() {
        LoggerContext context = Configurator.initialize("testlog4j", "classpath:conf/log4j2.xml");
        logger = context.getLogger("testlog4j");
    }

    private final void initSpringJunit() {
        context = new ClassPathXmlApplicationContext("classpath:conf/spring-root.xml");
    }
}
