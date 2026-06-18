package org.example.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    private List<User> userList;

    public UserController() {
        this.userList = new ArrayList<>();
    }

    public void createNewUser(String userId,String name) {
        User user = new User(userId,name);
        userList.add(user);
    }

    public void addUser (User user) {
        userList.add(user);
    }

    public void removeUser (User user) {
        userList.remove(user);
    }

    public User getUser(String userId) {
        for (User user : userList) {
            if(userId.equalsIgnoreCase(user.getUserId())) return user;
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
