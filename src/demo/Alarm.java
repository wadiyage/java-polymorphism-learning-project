/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Dell
 */
public class Alarm {
    private int waterLevel;
    
    public Alarm() {
        waterLevel=0;
    }
    
    public void operateAlarm(int waterLevel) {
        this.waterLevel=waterLevel;
        if(this.waterLevel>50)
            System.out.println("Alarm ON!");
        else
            System.out.println("Alarm OFF!");
    }
}
