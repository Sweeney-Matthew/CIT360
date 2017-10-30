package pkg360.practice;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors; 
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;


class PracticeThreads{ 
    
    private static AtomicInteger atom = new AtomicInteger(); //New atomic integer for all threads to operate on
    
    public static class RunCommand implements Runnable {
        
    public int valuation = 0;

    // default constructor for runnable
    public RunCommand() {
    }
    
    // Method for when runnable is executed
    public void run() {  
        System.out.println(Thread.currentThread().getName()+ " (Start)"); // display start
        
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        // increase valuation for each cycle and hold for a second
        for (int i = 0; i <= rand_int; i++) {
            valuation = atom.incrementAndGet(); // each thread incremends the same atomic integer
            holdThread(); 
        }
        // display messages
        System.out.println("The valuation of " + Thread.currentThread().getName() + " is " + valuation);
        System.out.println(Thread.currentThread().getName()+ " (End)");
    }  
     
    // hold for a second
    private void holdThread() {  
        try {  Thread.sleep(1000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }     
}
    
    public static void main(String[] args) {  
        ExecutorService executor = Executors.newFixedThreadPool(5); //creates a pool of 5 threads  
        
        int threads = 0; //tally for number of threads created
        
        for (int i = 0; i < 5; i++) {  
            Runnable command = new RunCommand(); //create new runnable
            executor.execute(command); //run execute method
            threads++; //increment thread tally
          }  
        executor.shutdown();  //end executor
        while (!executor.isTerminated()) {   }  
  
        // display message and total thread count
        System.out.println("Finished all threads");  
        System.out.println("There were " + threads + " threads created");
    }
}