package main;
import user_action.*;
import web_serve.*;
public class ShiYong {
	public static void main(String[] args) {
	Web tb=new Web();
	InPut tp=new InPut(tb);
	OutPut tr=new OutPut(tb);
	new Thread(tp).start();
	new Thread(tr).start();

	}

}