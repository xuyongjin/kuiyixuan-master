package com.kuiyix.core.model.resource;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public class Resource {
    private int id;
    private String name;//资源名称
    private String identity;//资源标识符 用于权限匹配 如 userStatusHistory
    private String url;//访问路径 /admin/sys/user/statusHistory
    private int parentId;//上级资源Id  26
    private String parentIds;//上级资源链  0/1/16/26/
    private String icon;//图标地址
    private int sort;//排序
    private boolean show;//是否显示

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
