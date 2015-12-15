package com.kuiyix.core.model.user;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public enum OnlineStatus {
    on_line("在线"),hidden("隐身"),force_logout("强制退出");

    private final String info;

    private OnlineStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
