public abstract class Tv{
	public abstract void play();
}
public class HaieTv extends Tv {
	public void play(){
		System.out.println("this is HaieTv.");
	}
}
public class HisenseTv extends Tv{
	public void play(){
		System.out.println("this is HisenseTv.");
}
public class TVFactory{
	public static Tv produceTv(String brand){
		if(brand.equals("HaieTv"))
			return new HaierTv();
		if(brand.equals("HisenseTv"))
			return new HisenseTv();
		return null;
	}
}
<?xml version="1.0"?>
<config>
    <brandName>HisenseTv</brandName>
</config>
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUTiLTV{
	public static String getBrandFactoty(){
		try{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("configTV.xml"));
			NodeList nl = doc.getElementsByTsgName("brandName");
			Node classNode = nl.item(0).getFirstChild();
			String brandName = classNode.getNodeValue().trim();
			
			return brandName;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
public class Main{
	public static void main(String args[]){
		Tv tv;
		String brandName = XMLUtiLTV.getBrandName();
		tv = TVFactory.produceTv(brandName);
		tv.play();
	}
}