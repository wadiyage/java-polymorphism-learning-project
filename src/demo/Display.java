/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Dell
 */
public class Display extends WaterLevelObserver {

    @Override
    public void update(int waterLevel) {
        System.out.println("Water Level: "+waterLevel);
    }
    
    
}
