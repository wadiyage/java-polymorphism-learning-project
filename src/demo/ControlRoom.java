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
    private ArrayList<Alarm> alarmList;
    private ArrayList<Display> displayList;
    private SMSSender sMSSender;
    private ArrayList<Splitter> splitterList;
    
    private int waterLevel;
    
    public void addAlarm(Alarm alarm) {
        alarmList.add(alarm);
    }
    
    public void addDisplay(Display display) {
        displayList.add(display);
    }
    
    public void addSMSSender(SMSSender sMSSender) {
        this.sMSSender=sMSSender;
    }
    
    public void addSplitter(Splitter splitter) {
        splitterList.add(splitter);
    }
    
    public void setWaterLevel(int waterLevel) {
        if(this.waterLevel!=waterLevel) {
            this.waterLevel=waterLevel;
        }
        notifyDevices();
    }
    
    public void notifyDevices() {
        for(Alarm alarm:alarmList) {
            alarm.operateAlarm(waterLevel);
        }
        for(Display display:displayList) {
            display.display(waterLevel);
        }
        sMSSender.sendSMS(waterLevel);
        for(Splitter splitter:splitterList) {
            splitter.split(waterLevel);
        }
    }
}
