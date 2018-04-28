package models;

public class User {

    private int mId;
    private String mNickname;

    public User(int id, String nickname) {
        this.mId = id;
        this.mNickname = nickname;
    }

    public int getId() {
        return mId;
    }

    public String getNickname() {
        return mNickname;
    }

    public void setNickname(String nickname) {
        this.mNickname = nickname;
    }
}
