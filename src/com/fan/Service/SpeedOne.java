package com.fan.Service;

import com.fan.Model.CeilingFanSpeedChain;

public class SpeedOne implements SpeedState{
    public void pull(CeilingFanSpeedChain speedState){
        speedState.setState(new SpeedTwo());
        System.out.println("Speed Two");
    }
}