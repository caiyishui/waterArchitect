package com.example.water.mymobanapplication.mediator.me2;

/**
 * Created by water on 2018/1/13.
 */

public class CPU extends Colleague {
    private String vedioData;
    private String soundData;
    public CPU(Mediator mediator) {
        super(mediator);
    }
    //吧数据分音频和视频
    public void resolveData(String data){
      String[] ss=  data.split(",");
      this.soundData=ss[0];
      this.vedioData=ss[1];
        this.getMediator().change(this);
    }
    public String getVedioData(){
    return vedioData;
    }
    public String getSoundData(){
        return soundData;
    }
}

