package com.kuiyix.core.model.user;

import java.util.Date;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public class UserStatusHistory {
    private int id;//主键
    private User user;//锁定的用户,权限userId
    private UserStatus status;
    private String reason;//备注原因
    private User opUser;//操作用户
    private Date opDate;//操作时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public User getOpUser() {
        return opUser;
    }

    public void setOpUser(User opUser) {
        this.opUser = opUser;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }
}
