/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santosh
 */
public class ArrayPrac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // long form
        double[][] a; // declaration
        a = new double[4][4]; // creation
        // initialization
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = 0.0;
            }
        }
        System.out.println(a[1][2]);
        
        
        double[] b = new double[4]; // short form
        double[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // initializing declaration
    }
    
}
