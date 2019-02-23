package com.heartide.meteordemo.model;

/**
 * Created by 白马秋风 on 2019/2/15
 */
public class Meteor {
    private int meteorTran = 0;//流星水平移动的距离
    private float mRandomPosition = 0;//流星开始的随机位置
    private float speedRate = 1;//流星速率

    public int getMeteorTran() {
        return meteorTran;
    }

    public void setMeteorTran(int meteorTran) {
        this.meteorTran = meteorTran;
    }

    public float getmRandomPosition() {
        return mRandomPosition;
    }

    public void setmRandomPosition(float mRandomPosition) {
        this.mRandomPosition = mRandomPosition;
    }

    public float getSpeedRate() {
        return speedRate;
    }

    public void setSpeedRate(float speedRate) {
        this.speedRate = speedRate;
    }
}
