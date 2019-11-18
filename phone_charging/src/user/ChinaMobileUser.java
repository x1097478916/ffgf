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
				System.out.println("����"+recordFileld[0]);
				System.out.println("����"+recordFileld[3]);
				System.out.println("ͨ����ʼʱ��"+d.format(new Date(Long.parseLong(recordFileld[1]))));
				System.out.println("ͨ������ʱ��"+d.format(new Date(Long.parseLong(recordFileld[2]))));
				System.out.println("�Ʒѣ�"+accountFee(Long.parseLong(recordFileld[1]),Long.parseLong(recordFileld[2]))+"Ԫ");
			}
		}
	
	

}
