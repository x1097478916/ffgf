package user;
import java.util.*;
public abstract class PhoneUserCallRecordArrayList {
	
		
		 String phoneNumber;
		 String callTo;
		 ArrayList al; 
		
		 public void generateCommunicateRecord() {
			int recordNum=new Random().nextInt(10);
			for(int i=0;i<=recordNum;i++) {
				long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
				long timeEnd=timeStart+60000+new Random().nextInt(600000);
				this.callTo=getCallToPhoneNumber();
				this.al.add(this.phoneNumber);
				this.al.add(this.callTo);
				this.al.add(timeStart);
				this.al.add(timeEnd);
			}
		}
		 String getCallToPhoneNumber() {
			return "1380372"+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10));
		}
		 abstract String accountFee(long timeStart,long timeEnd);
		 public abstract void printDetails();

	}


