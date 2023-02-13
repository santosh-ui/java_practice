/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author Santosh
 */
public class InitTest2 {
    int x = 2;
    int y;
    
    // instance initialization code
    // initialization code can easily found by using constructors for initialization
    public InitTest2() {
        y = x * 3;
        System.out.println(y);
    }
    
    // static initialization code
    static {
        System.out.println("static initialization");
    }
    
    public static void main(String[] args) {
        InitTest2 test = new InitTest2();
        InitTest2 moretest = new InitTest2();
    }
}
