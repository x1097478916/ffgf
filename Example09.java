class Student {
	final String name;
	public void introduce(){
		System.out.println("����һ��ѧ�����ҵ����ֽ�"+name);
	}
}
public class Example09{
	public static void main (String[] arg){
		Student stu=new Student();
		stu.introduce();
	}
}