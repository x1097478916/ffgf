class Animal{
	String name;
	void shout(){
		System.out.println("���﷢������");
	}
}
class Dog extends Animal{
	public void shout(){
			System.out.println("����");
	}
}
public class Example02{
	public static void main (String[] args){
		Dog dog=new Dog();
		dog.shout();
	}
}