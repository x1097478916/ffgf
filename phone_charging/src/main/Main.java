package main;

import user.*;
import utility.*;
public class Main {

	public static void main(String[] args) {
		PhoneUser a;
		PhoneUser b;
		a=(PhoneUser)XMLUtility.getBean(0);
a.generateCommunicateRecord();
System.out.println("�й��ƶ��û���ͨ����¼��");
a.printDetails();
b=(PhoneUser)XMLUtility.getBean(1);
b.generateCommunicateRecord();
System.out.println("�й���ͨ�û���ͨ����¼��");
b.printDetails();
	}

}
