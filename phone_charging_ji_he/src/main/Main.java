package main;
import user.*;
import java.util.*;
import utility.*;	
public class Main {

	public static void main(String[] args) {
		
				PhoneUserCallRecordArrayList a;
				a=(PhoneUserCallRecordArrayList)XMLUtility.getBean(0);
		a.generateCommunicateRecord();
		System.out.println("�й��ƶ��û�(ArrayList)��ͨ����¼��");
		a.printDetails();
		PhoneUserCallRecordLinkedList b;
		b=(PhoneUserCallRecordLinkedList)XMLUtility.getBean(1);
b.generateCommunicateRecord();
System.out.println("�й��ƶ��û�(LinkedList)��ͨ����¼��");
b.printDetails();
PhoneUserCallRecordHashSet d;
d=(PhoneUserCallRecordHashSet)XMLUtility.getBean(2);
d.generateCommunicateRecord();
System.out.println("�й��ƶ��û�(HashSet)��ͨ����¼��");
d.printDetails();

PhoneUserCallRecordTreeSet e;
e=(PhoneUserCallRecordTreeSet)XMLUtility.getBean(3);
e.generateCommunicateRecord();
System.out.println("�й��ƶ��û�(TreeSet)��ͨ����¼��");
e.printDetails();
		
			}

		}


	


