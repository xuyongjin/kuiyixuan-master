package com.kuiyix.core.dao.base;

/**
 * Created by 许勇进 on 2015-11-29.
 */
public interface IDao<T> {
    T selectById(Object id);
    int insert(T bean);
    int update(T bean);
    int delete(Object id);
}
