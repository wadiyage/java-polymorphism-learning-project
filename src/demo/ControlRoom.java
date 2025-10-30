/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ControlRoom {
    private WaterLevelObserver[] observerArray = new WaterLevelObserver[0];
    private int waterLevel;
    
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver) {
        extendsWaterLevelObserver();
        observerArray[observerArray.length-1]=waterLevelObserver;
    }
    
    public void extendsWaterLevelObserver() {
        WaterLevelObserver[] tempObserverArray = new WaterLevelObserver[observerArray.length+1];
        for(int i=0;i<observerArray.length;i++) {
            tempObserverArray[i]=observerArray[i];
        }
        observerArray=tempObserverArray;
    }
    
    public void setWaterLevel(int waterLevel) {
        if(this.waterLevel!=waterLevel) {
            this.waterLevel=waterLevel;
        }
        notifyObserver();
    }
    
    public void notifyObserver() {
        for(WaterLevelObserver waterLevelObserver:observerArray) {
            waterLevelObserver.update(waterLevel);
        }
    }
}
