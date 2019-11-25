package utility;
import javax.xml.parsers.*;
	import org.w3c.dom.*;
	import org.xml.sax.SAXException;
	import java.io.*;
public class XMLUtility {
	
	
			public static Object getBean(int i){
			
				if(i==0) {
					try{
						DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
						DocumentBuilder builder = dFactory.newDocumentBuilder();
						Document doc = builder.parse(new File("config.xml"));
						NodeList nl= doc.getElementsByTagName("className") ;
						Node classNode = nl.item(0).getFirstChild();
						String cName = classNode.getNodeValue();
						Class c = Class.forName(cName);
						Object obj =c.newInstance();
						return obj;
					}catch(Exception e){
						e.printStackTrace();
						return null;
					
					}
					}
					
				else if(i==1) {
					try{
						DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
						DocumentBuilder builder = dFactory.newDocumentBuilder();
						Document doc = builder.parse(new File("config.xml"));
						NodeList nl= doc.getElementsByTagName("alassName") ;
						Node classNode = nl.item(0).getFirstChild();
						String cName = classNode.getNodeValue();
						Class c = Class.forName(cName);
						Object obj =c.newInstance();
						return obj;
					}catch(Exception e){
						e.printStackTrace();
						return null;
					
					}
					}
				else if(i==2) {
					try{
						DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
						DocumentBuilder builder = dFactory.newDocumentBuilder();
						Document doc = builder.parse(new File("config.xml"));
						NodeList nl= doc.getElementsByTagName("blassName") ;
						Node classNode = nl.item(0).getFirstChild();
						String cName = classNode.getNodeValue();
						Class c = Class.forName(cName);
						Object obj =c.newInstance();
						return obj;
					}catch(Exception e){
						e.printStackTrace();
						return null;
					
				}
			}
				else {
					try{
						DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
						DocumentBuilder builder = dFactory.newDocumentBuilder();
						Document doc = builder.parse(new File("config.xml"));
						NodeList nl= doc.getElementsByTagName("elassName") ;
						Node classNode = nl.item(0).getFirstChild();
						String cName = classNode.getNodeValue();
						Class c = Class.forName(cName);
						Object obj =c.newInstance();
						return obj;
					}catch(Exception e){
						e.printStackTrace();
						return null;
					
				}
				}
		}
}
