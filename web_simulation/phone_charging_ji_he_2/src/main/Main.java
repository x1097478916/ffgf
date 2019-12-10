package main;
import user.*;
import utility.XMLUtility;
public class Main {

	public static void main(String[] args) {
		PhoneUserCallRecordLinkedHashMap a;
		a=(PhoneUserCallRecordLinkedHashMap)XMLUtility.getBean(0);
a.generateCommunicateRecord();
System.out.println("�й��ƶ��û�(LinkedHashMap)��ͨ����¼��");
a.printDetails();
PhoneUserCallRecordHashMap b;
b=(PhoneUserCallRecordHashMap)XMLUtility.getBean(1);
b.generateCommunicateRecord();
System.out.println("�й��ƶ��û�(HashMap)��ͨ����¼��");
b.printDetails();
PhoneUserCallRecordTreeMap c;
c=(PhoneUserCallRecordTreeMap)XMLUtility.getBean(2);
c.generateCommunicateRecord();
System.out.println("�й��ƶ��û�(TreeMap)��ͨ����¼��");
c.printDetails();

PhoneUserCallRecordLinkedHashMap e;
e=(PhoneUserCallRecordLinkedHashMap)XMLUtility.getBean(3);
e.generateCommunicateRecord();
System.out.println("�й���ͨ�û�(LinkedHashMap)��ͨ����¼��");
e.printDetails();
PhoneUserCallRecordHashMap f;
f=(PhoneUserCallRecordHashMap)XMLUtility.getBean(4);
f.generateCommunicateRecord();
System.out.println("�й���ͨ�û�(HashMap)��ͨ����¼��");
f.printDetails();
PhoneUserCallRecordTreeMap g;
g=(PhoneUserCallRecordTreeMap)XMLUtility.getBean(5);
g.generateCommunicateRecord();
System.out.println("�й���ͨ�û�(TreeMap)��ͨ����¼��");
g.printDetails();


	}

}
