class Animal{
	public final void shout(){
		System.out.println("���﷢������");
	
}
}
class Dog extends Animal{
	public void shout(){
		System.out.println("����");
	}
}
public class Example07{
	
	public static void main (String[] args){
		Dog dog=new Dog();
		dog.shout();
	}
}
