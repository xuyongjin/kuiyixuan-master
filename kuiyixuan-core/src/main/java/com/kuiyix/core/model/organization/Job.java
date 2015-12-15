package com.kuiyix.core.model.organization;

/**
 * 工作职务
 * Created by 许勇进 on 2015-11-15.
 */
public class Job {
    private int id;
    private String name;//职务名
    private int parentId;//上级职务
    private String parentIdS;//父职务链
    private int sort;//排序
    private boolean show;//是否显示
}
