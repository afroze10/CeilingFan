package com.fan.Model;

import com.fan.Service.FanDirection;
import com.fan.Service.ForwardDirection;
import com.fan.Service.SpeedOffImpl;
import com.fan.Service.SpeedState;

public class CeilingFanSpeedChain {
    private SpeedState currentState;
    private FanDirection currentDirection;

    public CeilingFanSpeedChain(){
        currentState = new SpeedOffImpl();
        currentDirection = new ForwardDirection();
    }

    public void setState(SpeedState st){
        currentState = st;
    }

    public String  getState(){
        return "Current Speed  : "+ currentState + "    Current Direction  :" + currentDirection ;
    }

    public void pull(){
        currentState.pull(this);
    }

    public void setDirection(FanDirection fd ){
        currentDirection = fd;
    }

    public void pullDirection(){
        currentDirection.changeDirection(this);
    }
}
