package user;
import java.util.*;
	
public class ChinaMobileUserCallRecordLinkedHashMap extends PhoneUserCallRecordLinkedHashMap {
	
		
			 
			 public   ChinaMobileUserCallRecordLinkedHashMap () {
					this.phoneNumber="15037269782";
					this.al2=new ArrayList();
					this.feePerMinute=0.3;
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



