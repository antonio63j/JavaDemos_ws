package pac.sendhora;

import java.lang.Runnable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.simp.SimpMessagingTemplate;

public class Task implements Runnable
{
    private String name;
    private String message = " este mensaje es para los subscritores a /chat";
    
    private SimpMessagingTemplate template;
    
    public Task(String name, SimpMessagingTemplate template) {
        this.name = name;
        this.template = template;
    }
     
    public String getName() {
        return name;
    }
 
    public void run() {
    	while (true) {

	        try {
	        	Thread.sleep(2000, 0);
	            System.out.println("Doing a task during : " + name + " - Time - " + new Date());
	            template.convertAndSend("/chat",  new SimpleDateFormat("HH:mm:ss").format(new Date())+"- "+ message);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
    	}
    }
}