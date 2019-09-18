class Animal{
	public String toString(){
		return"我是一个没有感情的动物";
	}
}
public class Example17{
	public static void main(String[] atg){
		Animal an=new Animal();
		System.out.println(an.toString());
	}
}