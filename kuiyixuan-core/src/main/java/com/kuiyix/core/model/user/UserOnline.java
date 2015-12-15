package com.kuiyix.core.model.user;

import java.util.Date;

/**
 * 用户在线会话
 * Created by 许勇进 on 2015-11-15.
 */
public class UserOnline {
    private String id;//会话ID--->uid
    private int userId;//在线用户
    private String host;//用户主机地址
    private String systemHost;//用户登录时系统IP
    private String userAgent;//用户 浏览器类型
    private OnlineStatus status;//用户会话状态
    private Date stratTimestamp;//开始时间
    private Date lastAccessTime;//最后访问时间
    //当前会话

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSystemHost() {
        return systemHost;
    }

    public void setSystemHost(String systemHost) {
        this.systemHost = systemHost;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public OnlineStatus getStatus() {
        return status;
    }

    public void setStatus(OnlineStatus status) {
        this.status = status;
    }

    public Date getStratTimestamp() {
        return stratTimestamp;
    }

    public void setStratTimestamp(Date stratTimestamp) {
        this.stratTimestamp = stratTimestamp;
    }

    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }
}
