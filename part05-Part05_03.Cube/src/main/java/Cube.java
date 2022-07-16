/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Cube {
    private int length;
    private int vol;
    
    public Cube(int length) {
        this.length = length;
        this.vol = this.length*this.length*this.length;
    }
    
    public int  volume(){
        return this.vol;
    }

    @Override
    public String toString() {
        return "The length of the edge is "+ this.length +" and the volume " +this.vol;
    }
    
    
}
