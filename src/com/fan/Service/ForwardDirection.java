package com.fan.Service;

import com.fan.Model.CeilingFanSpeedChain;

public class ForwardDirection implements FanDirection{

    public void changeDirection(CeilingFanSpeedChain directionState){
        directionState.setDirection(new ReverseDirection());
        System.out.println("Reverse Direction");
    }
}
