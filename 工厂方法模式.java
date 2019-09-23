public abstract class Tv{
	public abstract void play();
}
public class HaieTv extends Tv {
	public void play(){
		System.out.println("this is HaieTv.");
	}
}
public interface TVFactory{
	public TV produce TV();
}
public class HaieTvFactory implements TVFactory{
	public TV produceTv(){
		return new HaieTv();
	}
}
public class HisenseTvFactory implements TVFactory{
	public TV produceTv(){
		return new HisenseTv();
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
			String cName = classNode getNodeValue();
			class c = Class.forName(cName);
			object obj =c.newInstance();
			return obj;
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