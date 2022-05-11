/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test;

import com.example.Tablet;

/**
 *
 * @author Santosh
 */
public class TabletTest {
    public static void main (String[] args) {
        Tablet tablet = new Tablet();
        System.out.println("Samsung Tablet");
        System.out.println("Weight: " + tablet.getWeight());
        System.out.println("Screen Size: " + tablet.getScreenSize());
        System.out.println("Wifi Only: " + tablet.isWifiOnly());
        
        System.out.println("=== Setting Tablet field values...");
        
        tablet.setWeight(180);
        tablet.setScreenSize(6.4f);
        tablet.setWifiOnly(true);
        
        System.out.println("Samsung Tablet");
        System.out.println("Weight: " + tablet.getWeight());
        System.out.println("Screen Size: " + tablet.getScreenSize());
        System.out.println("Wifi Only: " + tablet.isWifiOnly());
    }
}
