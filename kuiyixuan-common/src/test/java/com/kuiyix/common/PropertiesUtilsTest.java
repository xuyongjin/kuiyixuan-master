package com.kuiyix.common;

import com.kuiyix.common.utils.PropertiesUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by 许勇进 on 2015-11-26.
 */
public class PropertiesUtilsTest {

    @Test
    public void Init() throws IOException {
        Properties en = PropertiesUtils.propertiesLoad("D:\\11.properties");
        System.out.println(en.get("password.algorithmName"));
    }
}
