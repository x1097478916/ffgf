package user;
import java.util.*;
import java.text.*;
 public  class ChinaMobileUser extends PhoneUser  {
	 
	 public  ChinaMobileUser () {
			this.phoneNumber="15037269782";
			this.communicationRecords=new StringBuffer();
			}
	
	 String accountFee(long timeStart,long timeEnd) {
		
		double feePerMinute=0.2;
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute*minutes;
		return (String.format("%.4f", feeTotal));
	}
	 public void printDetails() {
		 DateFormat d=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
			String allRecords=this.communicationRecords.toString();
			String[] recordArray=allRecords.split(";");
			for(int i=0;i<recordArray.length;i++) {
				String[] recordFileld=recordArray[i].split(",");
				System.out.println("主叫"+recordFileld[0]);
				System.out.println("被叫"+recordFileld[3]);
				System.out.println("通话开始时间"+d.format(new Date(Long.parseLong(recordFileld[1]))));
				System.out.println("通话结束时间"+d.format(new Date(Long.parseLong(recordFileld[2]))));
				System.out.println("计费："+accountFee(Long.parseLong(recordFileld[1]),Long.parseLong(recordFileld[2]))+"元");
			}
		}
	
	

}
