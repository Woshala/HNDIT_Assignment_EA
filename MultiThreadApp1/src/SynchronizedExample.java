 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Counter {
private int count =0;

public synchronized void increment(){
    count++;
}
public int getCount(){
    return count;
} 
}
public class SynchronizedExample extends Thread { 
    private Counter counter; 
    
    public SynchronizedExample(Counter counter) { 
        this.counter = counter; 
    } 
    
    @Override 
    public void run() { 
        for (int i = 0; i < 1000; i++) { 
            counter.increment(); 
        } 
    } 
    
    public static void main(String[] args) throws InterruptedException { 
        Counter counter = new Counter(); 

// Create and start multiple threads  
Thread thread1 = new SynchronizedExample(counter); 
Thread thread2 = new SynchronizedExample(counter); 

thread1.start(); 
thread2.start(); 

// Wait for threads to finish  
thread1.join(); 
thread2.join(); 

System.out.println("Final counter value: " + counter.getCount()); 
    } 
}