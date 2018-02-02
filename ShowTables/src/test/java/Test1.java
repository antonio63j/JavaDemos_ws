

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.Configuracion;

import core.TableControl;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		TableControl tb  = context.getBean(TableControl.class);  
				
		try {
			
		
		tb.conectar();
		tb.muestraCabeceras("employee");
		tb.desconectar();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
