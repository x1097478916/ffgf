package user;
import java.util.*;
 public abstract class PhoneUser {
	
	 String phoneNumber;
	 String callTo;
	 StringBuffer communicationRecords;
	
	 public void generateCommunicateRecord() {
		int recordNum=new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
			long timeEnd=timeStart+60000+new Random().nextInt(600000);
			this.callTo=getCallToPhoneNumber();
			this.communicationRecords.append(this.phoneNumber+","+timeStart+","+timeEnd+","+this.callTo+";");
		}
	}
	 String getCallToPhoneNumber() {
		return "1380372"+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10));
	}
	 abstract String accountFee(long timeStart,long timeEnd);
	public void printDetails() {
		String allRecords=this.communicationRecords.toString();
		String[] recordArray=allRecords.split(";");
		for(int i=0;i<recordArray.length;i++) {
			String[] recordFileld=recordArray[i].split(",");
			System.out.println("����"+recordFileld[0]);
			System.out.println("����"+recordFileld[3]);
			System.out.println("ͨ����ʼʱ��"+new Date(Long.parseLong(recordFileld[1])));
			System.out.println("ͨ������ʱ��"+new Date(Long.parseLong(recordFileld[2])));
			System.out.println("�Ʒѣ�"+accountFee(Long.parseLong(recordFileld[1]),Long.parseLong(recordFileld[2]))+"Ԫ");
		}
	}
	

}
