package user;
import java.util.*;
 public  class ChinaUnicomUser extends PhoneUser  {
	 
	 public  ChinaUnicomUser () {
			this.phoneNumber="13737269782";
			this.communicationRecords=new StringBuffer();
			}
	
	 String accountFee(long timeStart,long timeEnd) {
		
		double feePerMinute=0.15;
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute*minutes;
		return (String.format("%.4f", feeTotal));
	}
	
	

}
