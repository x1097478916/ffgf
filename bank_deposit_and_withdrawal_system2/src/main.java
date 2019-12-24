import java.io.FileInputStream;
import java.io.ObjectInputStream;

import bank.*;
import d_b_util.DBUtil;
public class main {

	public static void main(String[] args) throws Exception{
		FileInputStream foss=new FileInputStream("dbUtil.txt");
		ObjectInputStream ooss=new ObjectInputStream(foss);
		DBUtil ki=(DBUtil)ooss.readObject();
		ki.getUser("1001");// TODO Auto-generated method stub

	}

}
