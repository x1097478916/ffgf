package d_b_util;
import java.util.*;
import java.io.*;
import user.User; 
public class DBUtil implements Serializable{
private static DBUtil instance=null;
private HashMap <String,User>dB=new HashMap();
private  DBUtil() {
	User u1=new User();
	u1.setCardId("1001");
	u1.setCardPwd("123456");
	u1.setUserName("¸ÇÂ×");
	u1.setAccount(1000);
	u1.setCall("15294910121");
	dB.put(u1.getCardId(), u1);
	
	User u2=new User();
	u2.setCardId("1002");
	u2.setCardPwd("123457");
	u2.setUserName("»Ê×Ó");
	u2.setAccount(1000);
	u2.setCall("13794910121");
	dB.put(u2.getCardId(), u2);
	
	User u3=new User();
	u3.setCardId("1003");
	u3.setCardPwd("123458");
	u3.setUserName("¿¨ÌØ");
	u3.setAccount(1000);
	u3.setCall("15094910121");
	dB.put(u3.getCardId(), u3);
}
public static DBUtil getInstance() {
	if (instance==null) {
		synchronized(DBUtil.class) {
			if (instance==null) {
				instance=new DBUtil();
			}
		}
	}
	return instance;
}

public User getUser(String cardId) {
	return dB.get(cardId);
}
public HashMap getUsers() {
	return dB;
}
}