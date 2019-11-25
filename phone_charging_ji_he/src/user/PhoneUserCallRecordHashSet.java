package user;
import java.util.*;

import onecallrecord.*;
public  abstract class PhoneUserCallRecordHashSet {
	
			
		String phonenumber;	
	HashSet al; 
			
			 public void generateCommunicateRecord() {
				int recordNum=new Random().nextInt(10);
				for(int i=0;i<=recordNum;i++) {
					long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
					long timeEnd=timeStart+60000+new Random().nextInt(600000);
					OneCallRecord cr=new OneCallRecord(phonenumber,getCallToPhoneNumber(),timeStart,timeEnd);
					al.add(cr);
				}
			}
			 String getCallToPhoneNumber() {
				return "1380372"+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10));
			}
			 abstract String accountFee(long timeStart,long timeEnd);
			 public abstract void printDetails();

		



}
