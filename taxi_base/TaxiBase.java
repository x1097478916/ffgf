package taxi_base;
import car.*;
import factory.*;
import utility.XMLUtility;
public class TaxiBase {
    private Car[]car=new Car[10];
    private int inPos,outPos,count;
    public TaxiBase(){
	  int i,j;
	   for(i=0;i<10;i++) {
		j=i%3;
		Factory factory=(Factory)XMLUtility.getBean(j);
		car[i]=factory.produceCar();
	}
}
    public synchronized void put() {
    	try {
    		while(count==car.length){
    			this.wait();
    		}
    		System.out.println("����"+inPos+","+car[inPos].toString()+"��⡣�Ʒѷ���"+car[inPos].getRatio());
    		inPos++;
    		if(inPos==car.length)
    			inPos=0;
    		count++;
    		this.notify();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    public synchronized void out() {
    	try {
    		while(count==0){
    			this.wait();
    		}
    		System.out.println("����"+outPos+","+car[outPos].toString()+"���⡣�Ʒѷ���"+car[outPos].getRatio());
    		outPos++;
    		if(outPos==car.length)
    			outPos=0;
    		count--;
    		this.notify();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
}
