/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Dell
 */
public class Splitter extends WaterLevelObserver {

    @Override
    public void update(int waterLevel) {
        if(waterLevel>=75)
            System.out.println("Splitter ON!");
        else 
            System.out.println("Splitter OFF!");
    }
    
    
    
}
