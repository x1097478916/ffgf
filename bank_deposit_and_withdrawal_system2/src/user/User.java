package user;

import java.io.Serializable;

public class User implements Serializable{
	private	String call;
	private  int account;
	private String userName;
	private	String cardPwd;
	private	String cardId;
    public String getCall() {
    	return call;
    }
    public String getUserName() {
    	return userName;
    }
    public int getAccount() {
    	return account;
    }
    public String getCardPwd() {
    	return cardPwd;
    }
    public String getCardId() {
    	return cardId;
    }
    public void setCall(String call) {
    	this.call=call;
    	
    }
    public void setAccount(int account) {
    	this.account=account;
    }
    public void setUserName(String userName) {
    	this.userName=userName;
    }
    public void setCardPwd(String cardPwd) {
    	this.cardPwd=cardPwd;
    }
    public void setCardId(String cardId) {
    	this.cardId=cardId;
    }
}

