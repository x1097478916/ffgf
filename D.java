class Texi implements Runnable{
	private int chengke=100;
	public void run(){
		while(true){
			if(chengke>0){
			System.out.println(Thread.currentThread().getName()+"正在接送第"+chengke--+"名乘客");
			}
		}
	}
}
public class D{
	public static void main(String[] args){
		Texi tx=new Texi();
		new Thread(tx,"出租车1").start();
		new Thread(tx,"出租车2").start();
		new Thread(tx,"出租车3").start();
		new Thread(tx,"出租车4").start();
		new Thread(tx,"出租车5").start();
		
	}
	}