package com.fan.Service;

import com.fan.Model.CeilingFanSpeedChain;

public class ReverseDirection implements FanDirection {

    public void changeDirection(CeilingFanSpeedChain directionState){
        directionState.setDirection(new ForwardDirection());
        System.out.println("Forward Direction");
    }
}
