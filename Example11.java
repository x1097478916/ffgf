interface Animal{
	int ID=1;
	void shout();
	void sleep();
}
class Dog implements Animal{
	public void shout(){
		System.out.println("����");
	}
	public void sleep(){
		System.out.println("����");
	}
}
public class Example11{
	public static void main (String[] arg){
		Dog dog=new Dog();
		dog.shout();
		dog.sleep();
	}
}