package com.fan;

import com.fan.Model.CeilingFanSpeedChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        CeilingFanSpeedChain ceilingFanSpeedChain = new CeilingFanSpeedChain();
                while(true){
                    System.out.println("Enter word 'Pull Cord 1' to change the fan speed");
                    System.out.println("Enter word 'Pull Cord 2' to change the fan direction");
                    String input = getInput();
                    if(input.equals("Pull Cord 1")) {
                        ceilingFanSpeedChain.pull();
                    }
                    if (input.equals("Pull Cord 2")){
                        ceilingFanSpeedChain.pullDirection();
                    }
                }
    }

    static String getInput(){
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        String input = null;
        try{
            input = reader.readLine();
        }catch (IOException io){
            io.printStackTrace();
        }
        return input;
    }
}
