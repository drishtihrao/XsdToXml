package com.test2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.namespace.QName;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.stream.StreamResult;

import jlibs.xml.sax.XMLDocument;
import jlibs.xml.xsd.XSInstance;
import jlibs.xml.xsd.XSParser;

import org.apache.xerces.xs.XSModel;

/**
 * 
 * @author asustya
 *
 */
public class XsdToXml4 {

	/**
	 * @param args
	 * @throws TransformerConfigurationException 
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws TransformerConfigurationException {
		boolean status;

		//Obtain files from specified folder
		File[] samplexsd = new File("D:\\Users\\drirao\\Documents").listFiles();
		
		
		for (File path : samplexsd) {
			System.out.println(path);
		}
		
		

		//Create resulting folder
		
		
		//Default options
		XSInstance instance = new XSInstance();
		instance.minimumElementsGenerated = 0;
		instance.maximumElementsGenerated = 0;
		instance.generateDefaultAttributes = false;
		instance.generateOptionalAttributes = false;
		instance.maximumRecursionDepth = 0;
		instance.generateOptionalElements = true;
		
		//Root element to generate
		QName root = new QName("xs:element");

		for (int i = 0; i < samplexsd.length; i++) {
			if(samplexsd[i].isFile() && samplexsd[i].getName().contains(".xsd")) { 
				//Eliminate directories and make sure is a schema
				XSModel xsModel = new XSParser().parse(samplexsd[i].getAbsolutePath());	
				
				//Name the result
				XMLDocument sample = new XMLDocument(new StreamResult("SampleXML/" + samplexsd[i].getName().substring(0, samplexsd[i].getName().indexOf(".")) + ".xml"), false, 4, null);

				try {
					instance.generate(xsModel, root, sample);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}
			}
		}		
		System.out.println("Done --- check your the SampleXML folder");
	}
}