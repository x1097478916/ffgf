class Way implements Runnable{
	private int jindu;
	public Way(int a){
		jindu=a;
	}
	public void run(){
		int b=jindu+49;
		while(true){
			if(b>=jindu){
			System.out.println(Thread.currentThread().getName()+"�������ص�"+jindu+++"���ļ�");
			}
		}
	}
}
public class E{
	public static void main(String[] args){
		Way w1=new Way(1);
		Way w2=new Way(51);
		new Thread(w1,"����·��1").start();
		new Thread(w2,"����·��2").start();
		
		
	}
	}