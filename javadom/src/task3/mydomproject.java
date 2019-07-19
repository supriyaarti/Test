package task3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class mydomproject {
	public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, FileNotFoundException, TransformerException {
		DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
		DocumentBuilder b=f.newDocumentBuilder();
		Document doc=b.newDocument();
		
		Element rootele=doc.createElement("Student");
		Element studenttele=doc.createElement("Student");
		Element nameele=doc.createElement("name");
		Element emailele=doc.createElement("email");
		Element addressele=doc.createElement("address");
		Element mobileele=doc.createElement("mobile");
		Element idele=doc.createElement("id");
		
		
		Text t1=doc.createTextNode("saurbh");		
		Text t2=doc.createTextNode("sau@123");
		Text t3=doc.createTextNode("pune");
		Text t4=doc.createTextNode("73456");
		Text t5=doc.createTextNode("101");
         
		nameele.appendChild(t1);
		nameele.appendChild(t2);
		nameele.appendChild(t3);
		nameele.appendChild(t4);
		nameele.appendChild(t5);
		//create all data with element
		
		//creatae data with brach element
		
		studenttele.appendChild(nameele);
		studenttele.appendChild(emailele);
		studenttele.appendChild(addressele);
		studenttele.appendChild(mobileele);
		studenttele.appendChild(idele);

		
		//create root element
		rootele.appendChild(studenttele);
		doc.appendChild(rootele);
		
	Transformer t=TransformerFactory.newInstance().newTransformer();
	t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("C:\\Users\\Harish\\git\\Test\\javadom\\student.xml")));
		System.out.println("xml file generated");
	
		

		
		
		

		

		
		
		

		
		
	}

}
