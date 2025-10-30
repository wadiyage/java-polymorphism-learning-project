/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.Random;

/**
 *
 * @author Dell
 */


public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ControlRoom controlRoom = new ControlRoom();
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Alarm());
        
        controlRoom.addWaterLevelObserver(new Display());
        
        controlRoom.addWaterLevelObserver(new SMSSender());
        
        Random random = new Random();
        while(true) {
            int waterLevel=random.nextInt(101);
            controlRoom.setWaterLevel(waterLevel);
            Thread.sleep(1000);
        }

    }
    
}
