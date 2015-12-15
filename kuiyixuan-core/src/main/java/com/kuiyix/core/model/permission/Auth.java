package com.kuiyix.core.model.permission;

import com.kuiyix.core.model.group.Group;
import com.kuiyix.core.model.organization.Job;
import com.kuiyix.core.model.organization.Organization;
import com.kuiyix.core.model.user.User;

/**
 * 授权
 * 组织机构--工作职务--用户--组---角色之间的关系
 * Created by 许勇进 on 2015-11-15.
 */
public class Auth {
    private int id;
    private int organizationId;
    private int jobId;
    private int userId;
    private int groupId;
    private String roleIds;
    private AuthType type;//授权类型

    public AuthType getType() {
        return type;
    }

    public void setType(AuthType type) {
        this.type = type;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
