package web_serve;

import java.util.Random;

public class Web {
	private Random ra=new Random();
	private String st=new String();
    private String[]user=new String[10];
    private int inPos,outPos,count;
    public Web(){
	  int i;
	   for(i=0;i<10;i++) {
		user[i]=st.valueOf(ra.nextInt(10));
	}
	  
	   
}
    public synchronized void put() {
    	try {
    		while(count==user.length){
    			this.wait();
    		}
    		System.out.println(user[inPos]+"�û���¼"+"��ǰ�û�����"+(count+1));
    		inPos++;
    		if(inPos==user.length)
    			inPos=0;
    		count++;
    		this.notify();
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    public synchronized void out() {
    	try {
    		while(count==0){
    			this.wait();
    		}
    		System.out.println(user[inPos]+"�û�ע��"+"��ǰ�û�����"+(count-1));
    		outPos++;
    		if(outPos==user.length)
    			outPos=0;
    		count--;
    		this.notify();
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
}