package com.kuiyix.core.model.group;

/**
 * Created by 许勇进 on 2015-11-15.
 */
public class Group {
    private int id;
    private String name;//分组名称
    private GroupType type;//组类型
    private boolean show;//是否显示

    public boolean isDefaultGroup() {
        return defaultGroup;
    }

    public void setDefaultGroup(boolean defaultGroup) {
        this.defaultGroup = defaultGroup;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private boolean defaultGroup  = false;//是否是默认分组
}
