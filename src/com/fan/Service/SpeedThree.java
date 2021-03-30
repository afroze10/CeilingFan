package com.fan.Service;

import com.fan.Model.CeilingFanSpeedChain;

public class SpeedThree implements SpeedState{

    public void pull(CeilingFanSpeedChain speedState){
        speedState.setState(new SpeedOffImpl());
        System.out.println("Speed Off");
    }
}
