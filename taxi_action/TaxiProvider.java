package taxi_action;
import taxi_base.*;
public class TaxiProvider implements Runnable{
  private TaxiBase tb;
  public TaxiProvider(TaxiBase tb) {
	  this.tb=tb;
  }
  public void run(){
	  while(true) {
		  tb.put();
	  }
  }

}
