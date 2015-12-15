package com.kuiyix.core.model.user;

/**
 * 用户状态
 * Created by 许勇进 on 2015-11-15.
 */
public enum UserStatus {
    normal("正常状态"),blocked("封禁状态");

    private final String info;

    private UserStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
