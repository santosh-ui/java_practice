/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santosh
 */
public class ArrayPrac {
    
    // Method for printing the array
        public static String printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            return " Memory address" + arr;
        }
        
    // static method for calculating the square root for a value
//        public static double sqrt(double c) {
//            if (c < 0) return Double.NaN;
//            double err = 1e-15;
//            double t = c;
//            while (Math.abs(t-(t/c)) > err * t) {
//                t = (c/t + t) / 2.0;
//            }
//            return t;
//        }
        
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
        /* this for loop is unnecessary because by default in java
         * variables of type double are initialized with 0.0
         * but it would be required if a nonzero value is desired.
         * defaule initial value for numeric types is 0 and false for boolean type.
         */
        System.out.println(a[1][2]);
        
        
        double[] b = new double[4]; // short form
        double[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // initializing declaration
        
        
        // Aliasing
        int d[] = new int[4];
        d[0] = 1234;
        System.out.println(d[0]);
        
        int e[] = d; // e -> d here e is pointing to the same memory address as d
        e[0] = 5678; // now the value of d[0] is changed as 
        // d and e are having the same momery address
        System.out.println(d[0]);
        // This situation is known as aliasing and this can lead to subtle bugs
        // is your intent is to make a copy of an array
        // declare, create and initialize a new array
        // then copy all of the entries in the original array to the new array.
        
        
        // Find the maximum of array values
        
        int[] arr = new int[10]; // declare and create
        // Initialize the array with for loop
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            arr[index] = index*2;
        }
        
        int max = 0;
        for (int index =0; index < n; index++) {
            if (arr[index] > max) max = arr[index];
        }
        System.out.println("The maximum array value is " + max);
        
        //  Compute the average of the array values
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum/n;
        System.out.println("The average value of the array is " + average);
        
        // copy to another  array
        int[] arrCopy = new int[10];
        for (int i = 0; i < n; i++) {
            arrCopy[i] = arr[i];
        }
        
        System.out.println("Array" + printArray(arr));
        System.out.println("Array copy" + printArray(arrCopy));
        // first for loop in the printArray is executed and then
        // the String is printed along with the return message.
        
        // Reverse the elements within the array
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        
        System.out.println("The Reversed array is " + printArray(arr));
        
        // matrix - matrix multiplication
//        int N = a.length; 
//        double[][] c = new double[N][N]; 
//        for (int i = 0; i < N; i++)
//         for (int j = 0; j < N; j++)
//         { // Compute dot product of row i and column j.
//         for (int k = 0; k < N; k++)
//         c[i][j] += a[i][k]*b[k][j];
// }
//        System.out.println("SQRT of 4 is " + sqrt(4));
    }
    
}
