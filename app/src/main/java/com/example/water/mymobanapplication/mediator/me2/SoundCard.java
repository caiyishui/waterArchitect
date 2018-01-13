package com.example.water.mymobanapplication.mediator.me2;

/**
 * Created by water on 2018/1/13.
 */

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    public void playSound(String data){

        System.out.println("声音："+data);
    }

}
