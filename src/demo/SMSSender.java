/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Dell
 */
public class SMSSender {
    private int waterLevel;

    public SMSSender() {
        waterLevel=0;
    }
    
    public void sendSMS(int waterLevel) {
        this.waterLevel=waterLevel;
        System.out.println("Sending SMS...");
    }
    
}
