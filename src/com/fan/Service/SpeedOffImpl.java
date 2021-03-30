package com.fan.Service;

import com.fan.Model.CeilingFanSpeedChain;

public class SpeedOffImpl implements SpeedState{
    public void pull(CeilingFanSpeedChain speedState){
        speedState.setState(new SpeedOne());
        System.out.println("Speed One");
    }
}


