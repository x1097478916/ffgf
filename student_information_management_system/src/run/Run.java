package run;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		StringBuffer stb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		 System.out.println("��¼����Ϣ");
	   		String str=sc.nextLine();
		int sel2;
		while(true) {
			System.out.println("1-����¼�룻2-����ѧ�Ų�ѯ��3-��ʾȫ����Ϣ");
		sel2=sc.nextInt();
		switch(sel2) {
		case 1: 
			str=str.replace("��", "��");
			stb.append(str);
			System.out.println("������¼����Ϣ��");
			stb.append(sc.next());
			str=stb.toString();
			
			stb.delete(0, stb.length());
			break;
		case 3: 
			System.out.println(str);
			break;
		case 2:
/*/ѧ��+/*/
		String[] ss=str.split("��");
		String xue_hao_io=sc.next();
		 
		/*/����/*/int i;
		for(i=0;i<=ss.length;i++) {
			if(ss[i].contains(xue_hao_io)) 
				break;
		}
		System.out.println("1-��ʾ��2-�޸ģ�3-ɾ��.");
		 int sel=sc.nextInt();
		 
		switch(sel) {
		case 1:
		/*/��ʾ/*/System.out.println(ss[i]);
		break;
		case 2:
		/*/�޸�/*/String xiu_gai__io=sc.next(); 
		
		ss[i]=xiu_gai__io;
		
		
		      
            /*/ת��/*/ for(i=0;i<ss.length-1;i++) {
       stb.append(ss[i]+"��");
       }
         stb.append(ss[i]);
         str=stb.toString();
         stb.delete(0, stb.length());
         
      
		 break;   
		case 3:
        /*/ɾ��/*/for(;i<ss.length-1;i++) {
			ss[i]=ss[i+1];
		}
		ss[i]=new String();
		   /*/ת��/*/
            for(i=0;i<ss.length-2;i++) {
            	
           stb.append(ss[i]+"��");
           }
            if(ss[i].contains("��"))
            	stb.append(ss[i]);
            else stb.append(ss[i]+"��");
            str=stb.toString();
            stb.delete(0, stb.length());
            
           
		 break;
		 
		}
		break;
	}
		}
	}

	}
