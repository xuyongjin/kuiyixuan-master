package com.kuiyix.core.model.permission;

/**
 * Created by 许勇进 on 2015-11-30.
 */
public enum PermissionType {
    all("所有"),
    create("新增"),
    update("修改"),
    delete("删除"),
    view("查看"),
    audit("审核");

    private final String info;

    private PermissionType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
