package com.kuiyix.core.model.permission;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public class Permission {
    private int id;
    private String name;//权限名称
    private String permission;//权限标识
    private String description;//描述
    private boolean show;//是否显示

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
