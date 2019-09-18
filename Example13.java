interface Animal{
	void shout();
}
class Cat implements Animal{
	public void shout(){
		System.out.println("����");
	}
}
class Dog implements Animal{
	public void shout(){
		System.out.println("����");
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