/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Dell
 */
public class Alarm extends WaterLevelObserver {

    @Override
    public void update(int waterLevel) {
        if(waterLevel>50)
            System.out.println("Alarm ON!");
        else
            System.out.println("Alarm OFF!");
    }
    
    
}
