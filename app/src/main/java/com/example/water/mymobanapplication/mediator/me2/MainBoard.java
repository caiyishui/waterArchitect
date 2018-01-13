package com.example.water.mymobanapplication.mediator.me2;

/**
 * Created by water on 2018/1/13.
 */

public class MainBoard implements Mediator {
    private CDriver mCDriver;
    private  CPU mCPU;
    private SoundCard mSoundCard;
    private VideoCard mVideoCard;




    @Override
    public void change(Colleague colleague) {
        //光驱读到数据
        if(colleague==mCDriver){
            //
            cdDriveReadData((CDriver) colleague);
        }else if (colleague==mCPU){
            //cpu 处理数据
            cpuResovleData((CPU)colleague);


        }

    }
    private void  cdDriveReadData(CDriver cDriver){
      this.mCPU.resolveData(cDriver.getData());
    }

    private void cpuResovleData(CPU cpu){
        this.mSoundCard.playSound(cpu.getSoundData());
        this.mVideoCard.playVedio(cpu.getVedioData());
    }

    public MainBoard() {
    }

    public MainBoard(CDriver CDriver, CPU CPU, SoundCard soundCard, VideoCard videoCard) {
        mCDriver = CDriver;
        mCPU = CPU;
        mSoundCard = soundCard;
        mVideoCard = videoCard;
    }

    public CDriver getCDriver() {
        return mCDriver;
    }

    public void setCDriver(CDriver CDriver) {
        mCDriver = CDriver;
    }

    public CPU getCPU() {
        return mCPU;
    }

    public void setCPU(CPU CPU) {
        mCPU = CPU;
    }

    public SoundCard getSoundCard() {
        return mSoundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        mSoundCard = soundCard;
    }

    public VideoCard getVideoCard() {
        return mVideoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        mVideoCard = videoCard;
    }
}
