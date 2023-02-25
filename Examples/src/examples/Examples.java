/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examples;

/**
 *
 * @author Santosh
 */
public class Examples {

    /**
     * @param height
     * @param width
     * @return 
     */
    
    public int calcArea(int height, int width) {
        return height * width;
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        int height;
//        int width;
        Examples e = new Examples();        
        int a = e.calcArea(5, 7);
        System.out.println(a);
        
        short c = 7;
        System.out.println(e.calcArea(c, 15));
        
//        int d = e.calcArea(57);
        System.out.println(e.calcArea(2, 3));
        
//        long t = 42;
//        int f = e.calcArea(t, 17);
//        int g = e.calcArea();
//        e.calcArea();
//        byte h = e.calcArea(5, 20);
//        int j = e.calcArea(2, 3, 5);
    }
    
}
