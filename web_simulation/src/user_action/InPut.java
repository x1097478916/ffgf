package user_action;
import java.util.Random;

import web_serve.*;
public class InPut implements Runnable{
	private Random ra=new Random();
  private Web tb;
  public InPut(Web tb) {
	  this.tb=tb;
  }
  public void run(){
	  while(true) {
		  tb.put();
		  try{
		  Thread.sleep(ra.nextInt(500));
		  }catch(Exception e) {
	    		e.printStackTrace();
	    	}
		  
	  }
  }

}