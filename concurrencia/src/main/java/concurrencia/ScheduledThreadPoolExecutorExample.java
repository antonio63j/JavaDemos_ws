package concurrencia;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
public class ScheduledThreadPoolExecutorExample
{
    public static void main(String[] args)
    {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Task task1 = new Task ("Demo Task 1");
        Task task2 = new Task ("Demo Task 2");
         
        System.out.println("The time is : " + new Date());
         
        executor.schedule(task1, 1 , TimeUnit.SECONDS);
        executor.schedule(task2, 1 , TimeUnit.SECONDS);
        
             
        try {
        	  System.out.println(" justo antes del awaitTermination, The time is : " + new Date());
        	  executor.shutdown(); // si no incluimos esta llamada, awaitTermination no terminará 
        	  // hasta que finalice el temporizador, aunque las tareas hayan finalizado.

        	  // fallará pues el pool es de 1
        	  executor.schedule(new Task("task3"), 1, TimeUnit.SECONDS);
        	  
        	  executor.awaitTermination(10, TimeUnit.SECONDS);
              System.out.println(" justo despues del awaitTermination, The time is : " + new Date());
              
        } catch (InterruptedException e) {
              e.printStackTrace();
        }
         
        executor.shutdown();
    }
}
