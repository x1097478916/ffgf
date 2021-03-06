package user;
import java.util.*;

import onecallrecord.OneCallRecord;

import java.text.*;
class Mycomparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		return (int)((((OneCallRecord)obj1).starttime)-(((OneCallRecord)obj2).starttime));
	}
}
public class ChinaMobileUserCallRecordTreeSet extends PhoneUserCallRecordTreeSet {
	
				 
			public  ChinaMobileUserCallRecordTreeSet() {
						this.phonenumber="15037269782";
						this.al=new  TreeSet(new Mycomparator());
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
							System.out.println("主叫"+obj.host);
							System.out.println("被叫"+obj.callto);
							String str1=String.valueOf(obj.starttime);
							String str2=String.valueOf(obj.endtime);
							System.out.println("通话开始时间"+d.format(new Date(Long.parseLong(str1))));
							System.out.println("通话结束时间"+d.format(new Date(Long.parseLong(str2))));
							System.out.println("计费："+accountFee(Long.parseLong(str1),Long.parseLong(str2))+"元");
						}
						
					
				
				

			}



	}


