package com.kuiyix.core.model.permission;

import com.kuiyix.core.model.resource.Resource;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public class RoleResourcePermission {
    private int id;
    private int roleId;
    private int resourceId;
    private String permissionIds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(String permissionIds) {
        this.permissionIds = permissionIds;
    }
}
