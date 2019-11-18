package main;

import user.*;
import utility.*;
public class Main {

	public static void main(String[] args) {
		PhoneUser a;
		PhoneUser b;
		a=(PhoneUser)XMLUtility.getBean(0);
a.generateCommunicateRecord();
System.out.println("中国移动用户的通话记录：");
a.printDetails();
b=(PhoneUser)XMLUtility.getBean(1);
b.generateCommunicateRecord();
System.out.println("中国联通用户的通话记录：");
b.printDetails();
	}

}
