package main;
import user.*;
import utility.XMLUtility;
public class Main {

	public static void main(String[] args) {
		PhoneUserCallRecordLinkedHashMap a;
		a=(PhoneUserCallRecordLinkedHashMap)XMLUtility.getBean(0);
a.generateCommunicateRecord();
System.out.println("中国移动用户(LinkedHashMap)的通话记录：");
a.printDetails();
PhoneUserCallRecordHashMap b;
b=(PhoneUserCallRecordHashMap)XMLUtility.getBean(1);
b.generateCommunicateRecord();
System.out.println("中国移动用户(HashMap)的通话记录：");
b.printDetails();
PhoneUserCallRecordTreeMap c;
c=(PhoneUserCallRecordTreeMap)XMLUtility.getBean(2);
c.generateCommunicateRecord();
System.out.println("中国移动用户(TreeMap)的通话记录：");
c.printDetails();

PhoneUserCallRecordLinkedHashMap e;
e=(PhoneUserCallRecordLinkedHashMap)XMLUtility.getBean(3);
e.generateCommunicateRecord();
System.out.println("中国联通用户(LinkedHashMap)的通话记录：");
e.printDetails();
PhoneUserCallRecordHashMap f;
f=(PhoneUserCallRecordHashMap)XMLUtility.getBean(4);
f.generateCommunicateRecord();
System.out.println("中国联通用户(HashMap)的通话记录：");
f.printDetails();
PhoneUserCallRecordTreeMap g;
g=(PhoneUserCallRecordTreeMap)XMLUtility.getBean(5);
g.generateCommunicateRecord();
System.out.println("中国联通用户(TreeMap)的通话记录：");
g.printDetails();


	}

}
