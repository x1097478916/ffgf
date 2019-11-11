package run;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		StringBuffer stb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		 System.out.println("请录入信息");
	   		String str=sc.nextLine();
		int sel2;
		while(true) {
			System.out.println("1-继续录入；2-输入学号查询；3-显示全部信息");
		sel2=sc.nextInt();
		switch(sel2) {
		case 1: 
			str=str.replace("。", "；");
			stb.append(str);
			System.out.println("请输入录入信息：");
			stb.append(sc.next());
			str=stb.toString();
			
			stb.delete(0, stb.length());
			break;
		case 3: 
			System.out.println(str);
			break;
		case 2:
/*/学号+/*/
		String[] ss=str.split("；");
		String xue_hao_io=sc.next();
		 
		/*/查找/*/int i;
		for(i=0;i<=ss.length;i++) {
			if(ss[i].contains(xue_hao_io)) 
				break;
		}
		System.out.println("1-显示；2-修改；3-删除.");
		 int sel=sc.nextInt();
		 
		switch(sel) {
		case 1:
		/*/显示/*/System.out.println(ss[i]);
		break;
		case 2:
		/*/修改/*/String xiu_gai__io=sc.next(); 
		
		ss[i]=xiu_gai__io;
		
		
		      
            /*/转换/*/ for(i=0;i<ss.length-1;i++) {
       stb.append(ss[i]+"；");
       }
         stb.append(ss[i]);
         str=stb.toString();
         stb.delete(0, stb.length());
         
      
		 break;   
		case 3:
        /*/删除/*/for(;i<ss.length-1;i++) {
			ss[i]=ss[i+1];
		}
		ss[i]=new String();
		   /*/转换/*/
            for(i=0;i<ss.length-2;i++) {
            	
           stb.append(ss[i]+"；");
           }
            if(ss[i].contains("。"))
            	stb.append(ss[i]);
            else stb.append(ss[i]+"。");
            str=stb.toString();
            stb.delete(0, stb.length());
            
           
		 break;
		 
		}
		break;
	}
		}
	}

	}
