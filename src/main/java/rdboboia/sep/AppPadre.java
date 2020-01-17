package rdboboia.sep;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class AppPadre {
	public static void main(String[] args) throws JAXBException {
		File f = new File("Z:/prueba.xml");

		JAXBContext context = JAXBContext.newInstance(Padre.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Padre definitions = (Padre) unmarshaller.unmarshal(f);
		
		System.out.println(definitions);
	}
}
