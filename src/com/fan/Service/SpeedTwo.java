package com.fan.Service;

import com.fan.Model.CeilingFanSpeedChain;

public class SpeedTwo  implements SpeedState{

    public void pull(CeilingFanSpeedChain speedState){
        speedState.setState(new SpeedThree());
        System.out.println("Speed Three");
    }
}
