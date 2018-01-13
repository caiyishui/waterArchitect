package com.example.water.mymobanapplication.mediator.me2;

/**
 * Created by water on 2018/1/13.
 */

public class Client  {
    public static void main(String[] args ){
        MainBoard mainBoard=new MainBoard();
        CDriver cDriver=new CDriver(mainBoard);
        CPU cpu=new CPU(mainBoard);
        SoundCard soundCard=new SoundCard(mainBoard);
        VideoCard videoCard=new VideoCard(mainBoard);
        mainBoard.setCDriver(cDriver);
        mainBoard.setCPU(cpu);
        mainBoard.setSoundCard(soundCard);
        mainBoard.setVideoCard(videoCard);
        //光驱读数据
        cDriver.readCD();




    }
}
