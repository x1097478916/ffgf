package user;
import java.text.*;
import java.util.*;

public  abstract class PhoneUserCallRecordLinkedHashMap {
	
	
	
		
			
			 String phoneNumber;
			 String callTo;
			ArrayList al2;
			double feePerMinute;
			 public void generateCommunicateRecord() {
				 DateFormat d=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
				int recordNum=new Random().nextInt(10);
				for(int i=0;i<=recordNum;i++) {
					 LinkedHashMap al=new LinkedHashMap();
					long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
					long timeEnd=timeStart+60000+new Random().nextInt(600000);
					this.callTo=getCallToPhoneNumber();
					al.put("����",this.phoneNumber);
					al.put("����",this.callTo);
					al.put("��ʼʱ��",d.format(new Date(timeStart)));
					al.put("����ʱ��",d.format(new Date(timeEnd)));
					al.put("�Ʒ�",accountFee(timeStart,timeEnd).toString()+"Ԫ");
					this.al2.add(al);
				}
			}
			 String getCallToPhoneNumber() {
				return "1380372"+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10))+String.valueOf(new Random().nextInt(10));
			}
			String accountFee(long timeStart,long timeEnd) {
		
				int minutes=Math.round((timeEnd-timeStart)/60000);
				double feeTotal=feePerMinute*minutes;
				return (String.format("%.4f", feeTotal));
			}
			 public abstract void printDetails();

		}




