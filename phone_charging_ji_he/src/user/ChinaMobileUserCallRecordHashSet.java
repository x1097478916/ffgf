package user;
import java.util.*;

import onecallrecord.OneCallRecord;

import java.text.*;
public class ChinaMobileUserCallRecordHashSet extends PhoneUserCallRecordHashSet{
	
			 
			 public  ChinaMobileUserCallRecordHashSet() {
					this.phonenumber="15037269782";
					this.al=new  HashSet();
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
						OneCallRecord obj=(OneCallRecord)ia.next();
						System.out.println("����"+obj.host);
						System.out.println("����"+obj.callto);
						String str1=String.valueOf(obj.starttime);
						String str2=String.valueOf(obj.endtime);
						System.out.println("ͨ����ʼʱ��"+d.format(new Date(Long.parseLong(str1))));
						System.out.println("ͨ������ʱ��"+d.format(new Date(Long.parseLong(str2))));
						System.out.println("�Ʒѣ�"+accountFee(Long.parseLong(str1),Long.parseLong(str2))+"Ԫ");
					}
					
				
			
			

		}



}
