package concurrencia;

import java.lang.Runnable;
import java.util.Date;

class Task implements Runnable
{
    private String name;
 
    public Task(String name) {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 
    public void run()
    {
        try {
            System.out.println("Doing a task during : " + name + " - Time - " + new Date());
            Thread.sleep(5000, 0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finalizando task : " + name + " - Time - " + new Date());
    }
}