package com.example.water.mymobanapplication.mediator.me2;

/**
 * Created by water on 2018/1/13.
 */

public class VideoCard  extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    public void playVedio(String data){

        System.out.println("视频："+data);
    }


}
