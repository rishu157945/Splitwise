package org.example.Group;

import org.example.User.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {

    private List<Group> groups;

    public GroupController() {
        groups = new ArrayList<>();
    }

    public void createNewGroup(String groupId, String name, User createdBy) {
        Group group = new Group(groupId,name);
        group.addMember(createdBy);
        groups.add(group);
    }

    public Group getGroup(String id) {
        for (Group group : groups) {
            if (group.getGroupId().equalsIgnoreCase(id)) return group;
        }
        return null;
    }
}
