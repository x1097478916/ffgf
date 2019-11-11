package user_action;
import java.util.Random;

import web_serve.*;
public class OutPut implements Runnable{
	private Random ra=new Random();
  private Web tb;
  public OutPut(Web tb) {
	  this.tb=tb;
  }
  public void run(){
	  while(true) {
		  tb.out();
	  
	  try{
		  Thread.sleep(ra.nextInt(500));
		  }catch(Exception e) {
	    		e.printStackTrace();
	    	}
		  
  }

}
}