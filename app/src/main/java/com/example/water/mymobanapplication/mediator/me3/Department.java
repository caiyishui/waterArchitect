package com.example.water.mymobanapplication.mediator.me3;

/**
 * Created by water on 2018/1/13.
 */

public class Department {
    private String depid;
    private String name;

    /**
     * ce xiao bu men
     */
    public void deleteDep(){
        DepUserMediator.getmInstance().deleteDep(depid);
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
}
