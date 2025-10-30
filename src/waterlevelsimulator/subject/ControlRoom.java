/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waterlevelsimulator.subject;

import java.util.ArrayList;
import waterlevelsimulator.observer.WaterLevelObserver;

/**
 *
 * @author Dell
 */
public class ControlRoom {
    private ArrayList<WaterLevelObserver> observerList = new ArrayList<>();
    private int waterLevel;
    
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver) {
        observerList.add(waterLevelObserver);
    }
    
    public void setWaterLevel(int waterLevel) {
        if(this.waterLevel!=waterLevel) {
            this.waterLevel=waterLevel;
        }
        notifyObserver();
    }
    
    public void notifyObserver() {
        for(WaterLevelObserver waterLevelObserver:observerList) {
            waterLevelObserver.update(waterLevel);
        }
    }
}
