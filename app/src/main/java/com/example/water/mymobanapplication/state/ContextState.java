package com.example.water.mymobanapplication.state;

/**
 * @author caiys
 * @date 2018/3/29.
 * @description
 */

public class ContextState implements Istate {
    Istate mIstate;
    public void setIstate(Istate istate){
        this.mIstate=istate;
    }


    @Override
    public void run() {
        mIstate.run();
    }
}
