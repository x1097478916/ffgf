class Student {
	final String name;
	public void introduce(){
		System.out.println("我是一名学生，我的名字叫"+name);
	}
}
public class Example09{
	public static void main (String[] arg){
		Student stu=new Student();
		stu.introduce();
	}
}