package xxx.main;
import xxx.tv.*;
import xxx.tvfactory.*;
public class J21P{
	public static void main(String[] args){
		TVFactory tvf1=new HaieTvFactory();
		TVFactory tvf2=new HisenseTvFactory();
		tvProduce(tvf1);
		tvProduce(tvf2);
		}
		public static void  tvProduce(TVFactory tvf){
		Tv tv=tvf.produceTv();
		tv.play();
		
	}
}