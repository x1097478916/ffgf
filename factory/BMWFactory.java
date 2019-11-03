package factory;
import car.*;
public class BMWFactory implements Factory{
	public  Car produceCar() {
		System.out.println(1);
		Car audi=new BMW();
		return audi;
	}
	}
