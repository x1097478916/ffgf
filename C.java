class Teacher implements Runnable{
	private int biji=80;
	public void run(){
		while(true){
			if(biji>0){
			System.out.println(Thread.currentThread().getName()+"正在分发第"+biji--+"本笔记");
			}
		}
	}
}
public class C{
	public static void main(String[] args){
		Teacher te=new Teacher();
		new Thread(te,"老师1").start();
		new Thread(te,"老师2").start();
		new Thread(te,"老师3").start();
		
	}
	}