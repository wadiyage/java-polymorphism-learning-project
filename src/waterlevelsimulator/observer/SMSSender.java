/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waterlevelsimulator.observer;

/**
 *
 * @author Dell
 */
public class SMSSender extends WaterLevelObserver {

    @Override
    public void update(int waterLevel) {
        System.out.println("Sending SMS...");
    }
    
    
}
