package user;
import java.util.*;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import onecallrecord.OneCallRecord;



public abstract class PhoneUserCallRecordTreeSet {
	
	
		
	String phonenumber;	
	TreeSet al; 
		
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




