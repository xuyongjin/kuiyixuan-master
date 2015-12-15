package com.kuiyix.core.model.permission;

/**
 * 角色类型
 * Created by 许勇进 on 2015-11-29.
 */
public enum RoleType {
    admin("超级管理员"),
    sys_admin("系统管理员"),
    portal_admin("门户管理员"),
    moderator("版主"),
    deputymoderator("副版主"),

    author("作者"),
    guest("贵宾"),
    member("普通会员"),
    vip1_member("vip一级会员"),
    vip2_member("vip二级会员"),
    vip3_member("vip三级会员"),
    vip4_member("vip四级会员"),
    vip5_member("vip五级会员"),
    vip6_member("vip六级会员");

    private final String info;

    private RoleType(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
}
