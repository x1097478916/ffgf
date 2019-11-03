package xxx.tvfactory;
import xxx.tv.*;
 public class HaieTvFactory implements TVFactory{
	public Tv produceTv(){
		return new HaieTv();
	}
}
package utility;
import javax.xml.parsers.*;
	import org.w3c.dom.*;
	import org.xml.sax.SAXException;
	import java.io.*;
	public class XMLUtility{
		public static Object getBean(){
			try{
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc = builder.parse(new File("config.xml"));
				NodeList nl = doc.getElementsByTagName("alassName");
				Node classNode = nl.item(0).getFirstChild();
				String cName = classNode.getNodeValue();
				Class c = Class.forName(cName);
				Object obj =c.newInstance();
				return obj;
			}catch(Exception e){
				System.out.println(e.getMessage());
				return null;
			}
		}
	}



