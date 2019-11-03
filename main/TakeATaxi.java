package main;
import taxi_action.*;
import taxi_base.*;
public class TakeATaxi {
	public static void main(String[] args) {
	TaxiBase tb=new TaxiBase();
	TaxiProvider tp=new TaxiProvider(tb);
	TaxiRenter tr=new TaxiRenter(tb);
	new Thread(tp).start();
	new Thread(tr).start();

	}

}
