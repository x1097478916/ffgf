package factory;
import car.*;
public class BenzFactory implements Factory{
	public  Car produceCar() {
		Car audi=new Benz();
		return audi;
	}
	}