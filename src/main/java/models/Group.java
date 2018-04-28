package models;

import java.util.List;

public class Group {
    private int mGroupId;
    private List<User> mUsers;
    private List<Message> mMessages;

    public Group(int groupId, List<User> users, List<Message> messages) {
        mGroupId = groupId;
        mUsers = users;
        mMessages = messages;
    }

    public int getGroupId() {
        return mGroupId;
    }

    public void setGroupId(int groupId) {
        mGroupId = groupId;
    }

    public List<User> getUsers() {
        return mUsers;
    }

    public void setUsers(List<User> users) {
        mUsers = users;
    }

    public void setNewUser(User newUser) {
        if(newUser != null) {
            mUsers.add(newUser);
        }
    }

    public List<Message> getMessages() {
        return mMessages;
    }

    public void setMessages(List<Message> messages) {
        mMessages = messages;
    }

    public void setNewMessage(Message newMessage) {
        if(newMessage != null) {
            mMessages.add(newMessage);
        }
    }
}
