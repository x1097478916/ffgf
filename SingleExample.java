class Single{
private static Single si=new Single();
private Single(){}
public static Single getSi(){
	return si;
}
}
public class SingleExample{
	public static void main(String[] args){
		Single s1=Single.getSi();
		Single s2=Single.getSi();
		System.out.println(s1==s2);
	}
}