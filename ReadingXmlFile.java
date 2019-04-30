/*
 * package com.cg.basicjava;
 * 
 * public class ReadingXmlFile {
 * 
 * public static void main(String argv[]) {
 * 
 * try { File fXmlFile = new
 * 
 * File("D:\\com\\cg\\test\\Schemas\\EmpDetails_DB-End-Output.xsd");
 * DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
 * DocumentBuilder dBuilder = dbFactory.newDocumentBuilder(); Document doc =
 * dBuilder.parse(fXmlFile); doc.getDocumentElement().normalize();
 * 
 * System.out.println("Root element :" +
 * doc.getDocumentElement().getNodeName()); NodeList nList =
 * doc.getElementsByTagName("EmpDetails"); nList.toString().
 * System.out.println(nList);
 * 
 * for (int temp = 0; temp < nList.getLength(); temp++) {
 * System.out.println("*"); Node nNode = nList.item(temp);
 * System.out.println("\nCurrent Element :" + nNode.getNodeName());
 * 
 * if (nNode.getNodeType() == Node.ELEMENT_NODE) { Element eElement = (Element)
 * nNode; System.out.println("Element details : " +
 * eElement.getAttribute("Name")); System.out.println( "First Name : " +
 * eElement.getElementsByTagName("Age").item(0).getTextContent());
 * System.out.println( "Last Name : " +
 * eElement.getElementsByTagName("lastname").item(0).getTextContent());
 * System.out.println( "Nick Name : " +
 * eElement.getElementsByTagName("nickname").item(0).getTextContent());
 * System.out.println("Salary : " +
 * eElement.getElementsByTagName("salary").item(0).getTextContent()); }
 * 
 * } } catch (Exception e) { e.printStackTrace(); }
 * 
 * 
 * System.setProperty(DOMImplementationRegistry.PROPERTY,
 * "com.sun.org.apache.xerces.internal.dom.DOMXSImplementationSourceImpl");
 * 
 * 
 * }
 */