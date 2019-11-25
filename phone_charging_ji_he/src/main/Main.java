package main;
import user.*;
import java.util.*;
import utility.*;	
public class Main {

	public static void main(String[] args) {
		
				PhoneUserCallRecordArrayList a;
				a=(PhoneUserCallRecordArrayList)XMLUtility.getBean(0);
		a.generateCommunicateRecord();
		System.out.println("中国移动用户(ArrayList)的通话记录：");
		a.printDetails();
		PhoneUserCallRecordLinkedList b;
		b=(PhoneUserCallRecordLinkedList)XMLUtility.getBean(1);
b.generateCommunicateRecord();
System.out.println("中国移动用户(LinkedList)的通话记录：");
b.printDetails();
PhoneUserCallRecordHashSet d;
d=(PhoneUserCallRecordHashSet)XMLUtility.getBean(2);
d.generateCommunicateRecord();
System.out.println("中国移动用户(HashSet)的通话记录：");
d.printDetails();

PhoneUserCallRecordTreeSet e;
e=(PhoneUserCallRecordTreeSet)XMLUtility.getBean(3);
e.generateCommunicateRecord();
System.out.println("中国移动用户(TreeSet)的通话记录：");
e.printDetails();
		
			}

		}


	


