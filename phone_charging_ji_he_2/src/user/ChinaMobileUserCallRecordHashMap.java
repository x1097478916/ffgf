package user;
import java.util.*;
import onecallrecord.OneCallRecord;
import java.text.*;
public class ChinaMobileUserCallRecordHashMap extends PhoneUserCallRecordHashMap {
	
		
				 
				 public  ChinaMobileUserCallRecordHashMap() {
						this.phonenumber="15037269782";
						this.al=new  HashMap();
						}
				
				 String accountFee(long timeStart,long timeEnd) {
					
					double feePerMinute=0.3;
					int minutes=Math.round((timeEnd-timeStart)/60000);
					double feeTotal=feePerMinute*minutes;
					return (String.format("%.4f", feeTotal));
				}
				 public void printDetails() {
					 DateFormat d=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
					 Set entrySet=al.entrySet();
					 Iterator ia=entrySet.iterator();
						while(ia.hasNext()) {
							
							Map.Entry entry=(Map.Entry)ia.next();
							Object key=entry.getKey();
							OneCallRecord value=(OneCallRecord)entry.getValue();
							
					
							System.out.println("����"+value.host);
							System.out.println("����"+value.callto);
							String str1=String.valueOf(value.starttime);
							String str2=String.valueOf(value.endtime);
							System.out.println("ͨ����ʼʱ��"+d.format(new Date(Long.parseLong(str1))));
							System.out.println("ͨ������ʱ��"+d.format(new Date(Long.parseLong(str2))));
							System.out.println("�Ʒѣ�"+accountFee(Long.parseLong(str1),Long.parseLong(str2))+"Ԫ");
						}
						
					
				
				

			}



	

}
