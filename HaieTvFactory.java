package xxx.tvfactory;
import xxx.tv.*;
 public class HaieTvFactory implements TVFactory{
	public Tv produceTv(){
		return new HaieTv();
	}
}