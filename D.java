class Texi implements Runnable{
	private int chengke=100;
	public void run(){
		while(true){
			if(chengke>0){
			System.out.println(Thread.currentThread().getName()+"���ڽ��͵�"+chengke--+"���˿�");
			}
		}
	}
}
public class D{
	public static void main(String[] args){
		Texi tx=new Texi();
		new Thread(tx,"���⳵1").start();
		new Thread(tx,"���⳵2").start();
		new Thread(tx,"���⳵3").start();
		new Thread(tx,"���⳵4").start();
		new Thread(tx,"���⳵5").start();
		
	}
	}