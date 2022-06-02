/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counter;

/**
 *
 * @author Santosh
 */
public class Counter {
    private int count;
    
    public Counter(int count) {
        this.count = count;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int num) {
        count = num;
    }
    
    public void increment() {
        count += 1;
    }
    
    public void decrement() {
        count -= 1;
    }
    
    public void reset() {
        count = 0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Counter c = new Counter(5);
        System.out.println("initial value: " + c.count);
        c.increment();
        System.out.println("increment value: " + c.count);
        c.setCount(50);
        System.out.println("set value: " + c.count);
        c.reset();
        System.out.println("reset value: " + c.count);
        c.decrement();
        System.out.println("decrement value: " + c.count);
    }
    
}
