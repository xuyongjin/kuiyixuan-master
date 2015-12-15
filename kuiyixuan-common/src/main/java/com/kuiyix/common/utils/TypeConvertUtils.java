package com.kuiyix.common.utils;

import javax.swing.text.StyledEditorKit;
import java.util.HashSet;
import java.util.Set;

/**
 * 类型转换工具类
 * Created by 许勇进 on 2015-12-1.
 */
public class TypeConvertUtils {

    /**
     * 转换Set<Object>为Set<Integer>
     * @param objectSet
     * @return
     */
    public static Set<Integer> objsetToIntset(Set<Object> objectSet) {
        Set<Integer> integerSet = new HashSet<Integer>();
        boolean hasObj = objectSet.size() > 0;
        if (hasObj) {
            for (Object obj : objectSet) {
                if (obj instanceof Integer) {
                    integerSet.add((Integer) obj);
                }else {
                    throw new ClassCastException();
                }
            }
        }
        return integerSet;
    }
}
