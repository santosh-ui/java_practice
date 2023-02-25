/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter8.random;

/**
 *
 * @author Santosh
 */
import java.util.concurrent.ThreadLocalRandom;
public class RangeRandomGenerator {
    public int from;
    public int to;
    
    public RangeRandomGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }
    
    /* 
     * Returns a random number between from and to 
     * to (inclusive)
     */
    public int generate() {
        return ThreadLocalRandom.current().nextInt(from, to+1);
    }
    
    public static void main(String[] args) {
        RangeRandomGenerator generator = new RangeRandomGenerator(1, 100);
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d ", generator.generate());
        }
        System.out.println();
    }
}
