/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app11;

/**
 *
 * @author Santosh
 */
public class Elephant implements Comparable{
    public float weight;
    public int age;
    public float tuskLength;
    
    public Elephant(float weight, int age) {
        this.weight = weight;
        this.age = age;
    }
    
    public int CompareTo(Object obj) {
        Elephant anotherElephant = (Elephant)obj;
        if(this.weight > anotherElephant.weight ){
            return 1;
        } else if (this.weight < anotherElephant.weight) {
            return -1;
        } else {
            // both elephants weights are same.
            // now compare their age.
            return (this.age - anotherElephant.age);
        }
    }
}
