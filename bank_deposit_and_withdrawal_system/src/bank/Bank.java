package bank;
import user.*;
import d_b_util.*;
import java.util.*;
public class Bank {
	User user;
	int account;
	public void login() {
		DBUtil dbUtil=DBUtil.getInstance();
		System.out.println("��ӭʹ����������ϵͳ");
		while(true) {
			Scanner in=new Scanner(System.in);
			System.out.println("���������п��ţ�");
			String cardId=in.nextLine();
			System.out.println("���������п����룺");
			String cardPwd=in.nextLine();
			user=dbUtil.getUser(cardId);
			if(dbUtil.getUsers().containsKey(cardId)&&user.getCardPwd().equals(cardPwd)) {
				System.out.println("��½�ɹ�����ӭ��"+user.getUserName()+"�û�");
				break;
			}
			else {
				System.out.println("�˺Ż��������");
				continue;
			}
		}
	}
	public void operate() {
		Bank b=this;
		
		while(true) {
			System.out.println("����������ѡ���Իس�������");
			System.out.println("��1"+"\t"+"ȡ��:2"+"\t"+"���:3"+"\t"+"�˳�:0");
			Scanner in=new Scanner(System.in);
			String s=in.nextLine();
			if("1".equals(s)||"2".equals(s)) {
				int num=0;
				try {
					System.out.println("�������");
					num=Integer.parseInt(in.nextLine());
				}catch(Exception e) {
					System.out.println("����������");
					continue;
				}
				switch(s) {
				case"1":
					b.income(num);
					break;
				case"2":
					b.takeout(num);
					break;
					
				}
			}
			else if("3".equals(s)) {
				
				b.show();
			}
			else if("0".equals(s)) {
				System.out.println("�˳�ϵͳ");
				break;
			}else {
				System.out.println("��������Чѡ��");
			}
		}
	}
	public void income(int num) {
		user.setAccount(user.getAccount()+num);
	}
	public void takeout(int num) {
		user.setAccount(user.getAccount()-num);
	}
	public void show() {
		System.out.println(user.getAccount());
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.login();
		b.operate();
	}
}
