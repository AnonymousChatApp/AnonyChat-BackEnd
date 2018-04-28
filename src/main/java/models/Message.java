package models;

import java.util.Date;

public class Message {
    private int mId;
    private int mUserId;
    private int mGroupId;
    private String mMessage;
    private Date mDate;

    public Message(int id, int userId, String message, Date date) {
        this.mId = id;
        this.mUserId = userId;
        this.mMessage = message;
        this.mDate = date;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public int getUserId() {
        return mUserId;
    }

    public void setUserId(int userId) {
        this.mUserId = userId;
    }

    public int getGroupId() {
        return mGroupId;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        this.mMessage = message;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }
}

