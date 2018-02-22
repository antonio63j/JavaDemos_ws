package com.demo.optional;

import java.util.Optional;

	class Computer {
		  private Optional<Soundcard> soundcard;  
		  public Optional<Soundcard> getSoundcard() {
			  return soundcard;
		  };

		}
		 
	class Soundcard {
		  public String name;
		  
		  private Optional<USB> usb;
		  
		  public Optional<USB> getUSB() {
			  return usb;
		  }
		 
		 Soundcard (){
		 }
		  
		 Soundcard(String str){
			this.name = str; 
		 }
		 
		}
		 
	class USB{
		  private String version;
		  
		  USB (String version){
			  this.version = version;  
		  }
		  
		  public String getVersion(){
			  return version;
		  }

	}
		
	
public class Demo1 {		
	
	public void test () {
		
		// sc está vacio
		Optional<Soundcard> scVacio = Optional.empty();
		scVacio.ifPresent(System.out::println);
		
		//soundcard contiene objeto no vacio
		Soundcard soundcard = new Soundcard();
		Optional<Soundcard> sc = Optional.of(soundcard);
		sc.ifPresent(System.out::println);
		
		//soundcar con objeto null
		Soundcard soundcard2 = null;
		Optional<Soundcard> scNull = Optional.ofNullable(soundcard2);
		scNull.ifPresent(System.out::println);
		
		Soundcard soundcard3 = scNull.orElse(new Soundcard("defaut"));
		System.out.println(soundcard3.name);
		
		USB usb = new USB("v1.0");
		if(usb != null && "v1.0".equals(usb.getVersion())){
		  System.out.println("version ok");
		}
		
		Optional<USB> maybeUSB = Optional.of(new USB("v1.0"));
//		maybeUSB.filter(usb -> "3.0".equals(usb.getVersion())
//                .ifPresent(() -> System.out.println("ok"));
		
		
	}
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 demo1a = new Demo1();
		
		demo1a.test();
		
		

	}

}
