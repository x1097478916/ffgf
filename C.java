class Teacher implements Runnable{
	private int biji=80;
	public void run(){
		while(true){
			if(biji>0){
			System.out.println(Thread.currentThread().getName()+"���ڷַ���"+biji--+"���ʼ�");
			}
		}
	}
}
public class C{
	public static void main(String[] args){
		Teacher te=new Teacher();
		new Thread(te,"��ʦ1").start();
		new Thread(te,"��ʦ2").start();
		new Thread(te,"��ʦ3").start();
		
	}
	}