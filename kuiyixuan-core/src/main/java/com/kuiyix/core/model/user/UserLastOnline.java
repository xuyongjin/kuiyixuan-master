package com.kuiyix.core.model.user;

import java.util.Date;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public class UserLastOnline {
    private int id;//主键，编号
    private int userId;//在线用户ID
    private String userName;//用户名
    private String uid;//最后退出时的uid,在线会话(UserOnline)中的ID
    private String host;//用户主机地址
    private String userAgent;//用户浏览器类型
    private String systemHost;//用户登录时的系统IP
    private Date lastLoginTimestamp;//最后登录时间
    private Date lastStopTimestamp;//最后登出时间
    private int loginCount;//登录次数
    private int totalOnlineTime;//总在线时长

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getSystemHost() {
        return systemHost;
    }

    public void setSystemHost(String systemHost) {
        this.systemHost = systemHost;
    }

    public Date getLastLoginTimestamp() {
        return lastLoginTimestamp;
    }

    public void setLastLoginTimestamp(Date lastLoginTimestamp) {
        this.lastLoginTimestamp = lastLoginTimestamp;
    }

    public Date getLastStopTimestamp() {
        return lastStopTimestamp;
    }

    public void setLastStopTimestamp(Date lastStopTimestamp) {
        this.lastStopTimestamp = lastStopTimestamp;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public int getTotalOnlineTime() {
        return totalOnlineTime;
    }

    public void setTotalOnlineTime(int totalOnlineTime) {
        this.totalOnlineTime = totalOnlineTime;
    }
}
