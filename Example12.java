interface Animal{
	int ID=1;
	void shout();
	void sleep();
}
interface LandAnimal extends Animal{
	void eat();
}
class Dog implements LandAnimal{
	public void shout(){
		System.out.println("ÕÙÕÙ");
	} 
	public void sleep(){
		System.out.println("∫Ù∫Ù");
	}
	public void eat(){
		System.out.println("Œ“‘⁄ø–π«Õ∑");
	}
}
public class Example12{
	public static void main(String[] arg){
		Dog dog=new Dog();
		dog.shout();
		dog.sleep();
		dog.eat();
	}
	
}