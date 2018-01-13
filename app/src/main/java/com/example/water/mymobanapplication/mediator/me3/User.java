package com.example.water.mymobanapplication.mediator.me3;

/**
 * Created by water on 2018/1/13.
 */

public class User {
    private String userId;
    private String userName;


    public void dismiss(){

        DepUserMediator.getmInstance().deleteUser(userId);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
