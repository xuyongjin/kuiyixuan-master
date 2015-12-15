package com.kuiyix.core.model.group;

import com.kuiyix.core.model.organization.Organization;
import com.kuiyix.core.model.user.User;

/**
 * 组--机构--用户之间的关系
 * Created by 许勇进 on 2015-11-15.
 */
public class GroupRelation {
    private int id;
    private Group group;
    private Organization organization;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
