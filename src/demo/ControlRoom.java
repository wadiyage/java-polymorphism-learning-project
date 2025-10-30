/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Dell
 */
public class ControlRoom {
    private Alarm alarm;
    private Display display;
    private SMSSender sMSSender;
    private Splitter splitter;
    
    private int waterLevel;
    
    public void addAlarm(Alarm alarm) {
        this.alarm=alarm;
    }
    
    public void addDisplay(Display display) {
        this.display=display;
    }
    
    public void addSMSSender(SMSSender sMSSender) {
        this.sMSSender=sMSSender;
    }
    
    public void addSplitter(Splitter splitter) {
        this.splitter=splitter;
    }
    
    public void setWaterLevel(int waterLevel) {
        if(this.waterLevel!=waterLevel) {
            this.waterLevel=waterLevel;
        }
        notifyDevices();
    }
    
    public void notifyDevices() {
        alarm.operateAlarm(waterLevel);
        display.display(waterLevel);
        sMSSender.sendSMS(waterLevel);
        splitter.split(waterLevel);
    }
}
