package concurrencia;
import java.util.concurrent.Executors; 
import java.util.concurrent.ScheduledExecutorService; 
import java.util.concurrent.TimeUnit; 

import org.junit.Test; 

public class ExecutorTest { 
  
 @Test 
 
 public void testExecutor() throws Exception { 
  final ScheduledExecutorService executor = Executors.newScheduledThreadPool(2); 
  executor.scheduleWithFixedDelay(new Runnable() { 
   int count = 0; 
 
   public void run() { 
    ++count; 
    System.out.printf("Execution count %d\n", count); 
    if(count>2) { 
     //executor.shutdown(); 
    } 
   } 
    
  }, 0, 1000, TimeUnit.MILLISECONDS); 
  
  System.out.println("Esperando fin"); 
  executor.awaitTermination(10000, TimeUnit.MILLISECONDS); 
  
  System.out.println("Completed"); 
 } 
}
