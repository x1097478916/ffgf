class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
public class A{
	public static void main(String[] args){
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		mt1.start();
		mt2.start();
	}
}