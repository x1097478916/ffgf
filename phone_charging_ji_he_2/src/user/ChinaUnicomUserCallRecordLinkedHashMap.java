package user;
import java.text.DateFormat;
import java.util.*;
public class ChinaUnicomUserCallRecordLinkedHashMap extends PhoneUserCallRecordLinkedHashMap{
	
	
		
			
				 
				 public  ChinaUnicomUserCallRecordLinkedHashMap () {
						this.phoneNumber="13737269782";
						this.al2=new ArrayList();
						this.feePerMinute=0.6;
						}
				
				 
				 public void generateCommunicateRecord() {
					 DateFormat d=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
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
				 public void printDetails() {
					
					 Iterator ia=al2.iterator();
						while(ia.hasNext()) {
							Set entrySet=((LinkedHashMap)ia.next()).entrySet();
							Iterator ia2=entrySet.iterator();
							while(ia2.hasNext()) {
								
								Map.Entry entry=(Map.Entry)ia2.next();
								Object key=entry.getKey();
								Object value=entry.getValue();
								System.out.println(key+":"+value);
								
							}
							
						}
					 
						
						
					}
				
				

			}





