class Father{
	private String name="zhangjun";
	class Child{
		public void introFather(){
			System.out.println("������"+name+"");
		}
	}
}
public class Test{
	public static void main(String[] args){
		Father.Child chi=new Father().new Child();
		chi.introFather();
	}
}