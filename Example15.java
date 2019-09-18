interface Animal{
	void shout();
}
class Cat implements Animal{
	public void shout(){
		System.out.println("ß÷ß÷");
	}
	public void sleep(){
		System.out.println("ºôºô");
	}
}
class Dog implements Animal{
	public void shout(){
		System.out.println("ÍôÍô");
	}
}
public class Example15{
	public static void main (String[] arg){
		Dog an2=new Dog();
	animalShout(an2);
	}
	public static void animalShout(Animal an){
		Cat cat=(Cat) an;
		cat.shout();
		cat.sleep();
	}
	
	
	
}