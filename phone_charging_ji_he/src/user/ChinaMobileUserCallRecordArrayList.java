package user;
import java.util.*;
import java.text.*;
public class ChinaMobileUserCallRecordArrayList extends PhoneUserCallRecordArrayList{
	
		 
		 public  ChinaMobileUserCallRecordArrayList () {
				this.phoneNumber="15037269782";
				this.al=new  ArrayList();
				}
		
		 String accountFee(long timeStart,long timeEnd) {
			
			double feePerMinute=0.2;
			int minutes=Math.round((timeEnd-timeStart)/60000);
			double feeTotal=feePerMinute*minutes;
			return (String.format("%.4f", feeTotal));
		}
		 public void printDetails() {
			 DateFormat d=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
			 Iterator ia=al.iterator();
				while(ia.hasNext()) {
					System.out.println("主叫"+ia.next());
					System.out.println("被叫"+ia.next());
					String str1=String.valueOf(ia.next());
					String str2=String.valueOf(ia.next());
					System.out.println("通话开始时间"+d.format(new Date(Long.parseLong(str1))));
					System.out.println("通话结束时间"+d.format(new Date(Long.parseLong(str2))));
					System.out.println("计费："+accountFee(Long.parseLong(str1),Long.parseLong(str2))+"元");
				}
			 
				
				
			}
		
		

	}


