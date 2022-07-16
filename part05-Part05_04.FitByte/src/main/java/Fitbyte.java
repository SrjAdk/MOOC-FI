/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Fitbyte {
    private int age;
    private int restingHeartBeat;

    public Fitbyte(int age, int restingHeartBeat) {
        this.age = age;
        this.restingHeartBeat = restingHeartBeat;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = 206.3 - (0.711*this.age);
        double target = (maxHeartRate - this.restingHeartBeat)*percentageOfMaximum+this.restingHeartBeat;
        return target;
    }
}
