package com.cg.basicjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XsdElements {
	public static void main(String args[]) {

		try

		{

			// parse the document
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File("D:\\Users\\drirao\\Documents\\shiporder.xsd"));
			NodeList list = doc.getElementsByTagName("xs:element");
			NamedNodeMap newlist = doc.getAttributes();

			System.out.println(newlist);
			
			
			
			
			// loop to print data
			for (int i = 0; i < list.getLength(); i++) {
				System.out.println("*******");
				Element first = (Element) list.item(i);
				System.out.println(list.toString().startsWith("<xs:element"));
				System.out.println("^^^^");
				System.out.println("1 " + first.getAttribute("name"));
				/* System.out.println("1 " + first.getAttribute("name")); */
				System.out.println("2 " + first.getNodeValue());
				System.out.println("3 " + first.getTagName());
				System.out.println("4 " + first.getChildNodes());
				if (first.hasAttributes()) {

					NodeList nm = first.getElementsByTagName("Name");
					String name = first.getAttribute("Name");
					System.out.println(nm);
					System.out.println("name is " + name);
					/* System.out.println("*******"); */
					String nm1 = first.getAttribute("Age");
					System.out.println(nm1);
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException ed) {
			ed.printStackTrace();
		}
	}

//	public static void parse(String name) {
//		try {
//			// Setup classes to parse XSD file for complex types
//			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//			DocumentBuilder db = dbf.newDocumentBuilder();
//			Document doc = db.parse(new FileInputStream("D:\\com\\cg\\test\\Schemas\\EmpDetails_DB-End-Output.xsd"));
//
//			// Given the id, go to correct place in XSD to get all the parameters
//			XPath xpath = XPathFactory.newInstance().newXPath();
//			NodeList result = (NodeList) xpath.compile(getExpression(name)).evaluate(doc, XPathConstants.NODESET);
//
//			for (int i = 0; i < result.getLength(); i++) {
//				Element e = (Element) result.item(i);
//				System.out.println(e.getAttribute("name") + " = " + e.getNodeValue());
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//// Get XSD Expression
//	private static String getExpression(String name) {
//		String expression = "name";
//
//		switch (name) {
//		case "99":
//			expression = "//xsd:complexType[@name='SomethingOne']//xsd:element";
//			break;
//
//		default:
//			System.out.println("\n Invalid name");
//			break;
//		}
//
//		return expression;
//	}
}
