package xxx.tvfactory;
import xxx.tv.*;
public class HisenseTvFactory implements TVFactory{
	public Tv produceTv(){
		return new HisenseTv();
	}
}