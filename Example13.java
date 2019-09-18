interface Animal{
	void shout();
}
class Cat implements Animal{
	public void shout(){
		System.out.println("ß÷ß÷");
	}
}
class Dog implements Animal{
	public void shout(){
		System.out.println("ÍôÍô");
	}
}
public class Example13{
	public static void main(String[] arg){
		Animal cat=new Cat();
	Animal dog=new Dog();
	animalShout(cat);
	animalShout(dog);
	}
	public static void animalShout(Animal an){
		an.shout();
	}
	
}