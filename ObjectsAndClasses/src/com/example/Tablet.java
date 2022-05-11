/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author Santosh
 */
public class Tablet {
    private int weight;
    private float screenSize;
    private boolean wifiOnly;
    
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public float getScreenSize() {
        return screenSize;
    }
    
    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }
    
    public boolean isWifiOnly() {
        return wifiOnly;
    }
    
    public void setWifiOnly(boolean wifiOnly) {
        this.wifiOnly = wifiOnly;
    }
    
}
