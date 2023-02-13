/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author Santosh
 */
public class InitTest3 {
    int x = 7;
    int y;
    
    // instance initialization code
    public InitTest3() {
        init();
    }
    
    public InitTest3(int x) {
        this.x = x;
        init();
    }
    
    public void init() {
        y = x * 3;
        System.out.println(y);
    }
    
    // static initialization code
    static {
        System.out.println("Static initialization");
    }
    
    public static void main(String[] args) {
        InitTest3 test = new InitTest3();
        InitTest3 moreTest = new InitTest3(5);
    }
}
