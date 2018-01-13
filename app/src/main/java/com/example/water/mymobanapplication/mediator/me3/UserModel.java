package com.example.water.mymobanapplication.mediator.me3;

/**
 * Created by water on 2018/1/13.
 */

public class UserModel {
    private String id;
    private String depid;

    private String name;

    public UserModel() {
    }

    public UserModel(String id, String depid, String name) {
        this.id = id;
        this.depid = depid;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                ", depid='" + depid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
