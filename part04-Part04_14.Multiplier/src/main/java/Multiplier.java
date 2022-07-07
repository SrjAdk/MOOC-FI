/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Multiplier {
    private int value;

    public Multiplier(int number) {
        this.value = number;
    }
    
    public int multiply(int input){
        int output = this.value*input;
        return output;
    }
}
