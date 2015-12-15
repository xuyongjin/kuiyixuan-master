package com.kuiyix.core.model.permission;

/**
 * 权限类型
 * Created by 许勇进 on 2015-11-15.
 */
public enum AuthType {
    user("用户"),user_group("用户组"),organization_job("组织机构和工作职务"),getOrganization_group("组织机构组");

    private final String info;

    private AuthType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
