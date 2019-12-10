package bank;
import user.*;
import d_b_util.*;
import java.util.*;
public class Bank {
	User user;
	int account;
	public void login() {
		DBUtil dbUtil=DBUtil.getInstance();
		System.out.println("欢迎使用网上银行系统");
		while(true) {
			Scanner in=new Scanner(System.in);
			System.out.println("请输入银行卡号：");
			String cardId=in.nextLine();
			System.out.println("请输入银行卡密码：");
			String cardPwd=in.nextLine();
			user=dbUtil.getUser(cardId);
			if(dbUtil.getUsers().containsKey(cardId)&&user.getCardPwd().equals(cardPwd)) {
				System.out.println("登陆成功。欢迎："+user.getUserName()+"用户");
				break;
			}
			else {
				System.out.println("账号或密码错误");
				continue;
			}
		}
	}
	public void operate() {
		Bank b=this;
		
		while(true) {
			System.out.println("请输入您的选择，以回车键结束");
			System.out.println("存款：1"+"\t"+"取款:2"+"\t"+"余额:3"+"\t"+"退出:0");
			Scanner in=new Scanner(System.in);
			String s=in.nextLine();
			if("1".equals(s)||"2".equals(s)) {
				int num=0;
				try {
					System.out.println("请输入金额：");
					num=Integer.parseInt(in.nextLine());
				}catch(Exception e) {
					System.out.println("金额输入错误");
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
				System.out.println("退出系统");
				break;
			}else {
				System.out.println("请输入有效选项");
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
