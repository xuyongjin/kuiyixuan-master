package com.kuiyix.core.model.organization;

/**
 *组织机构类型
 * Created by 许勇进 on 2015-11-15.
 */
public enum OrganizationType {
    bloc("集团"),branch_office("分公司"),department("部门"),group("部门小组");
    private final String info;

    private OrganizationType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
