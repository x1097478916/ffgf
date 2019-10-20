class MyThread implements Runnable{
	public void run(){
		int i;
		for(i=1;i<=50;i++){
			System.out.println("new");
		}
	}
}
public class B{
	public static void main(String[] args){
		MyThread mt=new MyThread();
		Thread tr=new Thread(mt);
		tr.start();
		int i;
		for(i=1;i<=100;i++){
			System.out.println("main");
		}
	}
	}