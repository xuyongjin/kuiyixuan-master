package com.kuiyix.core.model.group;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public enum GroupType {
    user("用户组"),organization("组织机构组");

    private final String info;

    private GroupType(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
}
