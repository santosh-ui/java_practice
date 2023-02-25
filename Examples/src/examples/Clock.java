/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

/**
 *
 * @author Santosh
 */
public class Clock {
    String time;
    
    void setTime(String t) {
        time = t;
    }
    // @return void but returned String
//    void getTime() {
//        return time;
//    }
    
    String getTime() {
        return time;
    }
}


class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        String time = "1234";
        c.setTime(time);
        String tod = c.getTime();
        System.out.println("time : " + tod);
    }
}