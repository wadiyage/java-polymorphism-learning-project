/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Dell
 */
public class Display {
    private int waterLevel;

    public Display() {
        waterLevel=0;
    }
    
    
    public void display(int waterLevel) {
        this.waterLevel=waterLevel;
        System.out.println("Water Level: "+this.waterLevel);
    }
}
