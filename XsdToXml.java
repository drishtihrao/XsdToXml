package com.test2;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.soap.Text;



public class XsdToXml {
	public void generateXml() throws JAXBException, IOException {
	    Text test = new Text();
	    ScreensType screens = new ScreensType();
	    test.getOption1OrOption2OrOption3().add(screens);
	    ScreenType screen = new ScreenType();
	    screen.setName1("a");
	    screen.setName2("b");
	    screen.setName3("c");
	    screens.getScreen().add(screen);

	    File f = new File("new.xml");
	    JAXBContext context= JAXBContext.newInstance("com.q1labs.qa.xmlgenerator.model.generatedxmlclasses");
	    Marshaller jaxbMarshaller = context.createMarshaller();
	    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	    jaxbMarshaller.marshal(test, f);
	    jaxbMarshaller.marshal(test, System.out);
	}
}
