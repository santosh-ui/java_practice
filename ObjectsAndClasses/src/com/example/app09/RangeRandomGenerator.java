/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app09;

import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Santosh
 */
public class RangeRandomGenerator {
    private int from;
    private int to;
    
    public RangeRandomGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }
    
    /* Returns a Random Number between from and to (inclusive) **/
    public int generator(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to+1);
    }
    
    public static void main(String[] args) {
        RangeRandomGenerator rrg = new RangeRandomGenerator(1, 50);
        int randomNumber = rrg.generator(rrg.from, rrg.to);
        System.out.println(randomNumber);
    }
    
}
