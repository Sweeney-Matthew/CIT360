/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360.practice;

import java.util.Random;

public class RunCommand implements Runnable {
    private String process; 
    private int valuation;

    // default constructor for runnable
    public RunCommand(String s) {
        this.process = s;
        this.valuation = 0;
    }
    
    // Method for when runnable is executed
    public void run() {  
        System.out.println(Thread.currentThread().getName()+ " (Start) Process number = " + process); // display start
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        // increase valuation for each cycle and hold for a second
        for (int i = 0; i <= rand_int; i++) {
            valuation++;
            holdThread(); 
        }
        // display messages
        System.out.println("The valuation of process number " + process + " is " + valuation);
        System.out.println(Thread.currentThread().getName()+ " (End)");
    }  
     
    // hold for a second
    private void holdThread() {  
        try {  Thread.sleep(1000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }     
}