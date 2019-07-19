package task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class mysaxprojects extends DefaultHandler {
	public void startdocument() {
		System.out.println("documents start  begins");
		
	}
	public void startElement(String uri,String localname,String qname,Attributes atters) {
		System.out.println("<"+ qname + ">");
	}
	public void chacters(char ch[],int start,int len) {
		System.out.println(new String(ch,start,len));
		
	}
	public void endElement(String uri,String localname,String qname,Attributes atters) {
		System.out.println("</"+ qname + ">");
	

}
	public void enddocument() {
		System.out.println("documents ends");
	}
	public static void main(String[] args) throws ParserConfigurationException, SAXException, FileNotFoundException, IOException {
		SAXParser p=SAXParserFactory.newInstance().newSAXParser();
		p.parse(new FileInputStream("E:\\NEW WORKSPACE\\javadom\\student.xml"),new mysaxprojects());
	}
}

