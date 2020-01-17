package rdboboia.sep;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import rdboboia.sep.data.Definitions;
import rdboboia.sep.data.components.Component;

public class AppComponents {
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Definitions.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Definitions definitions = (Definitions) unmarshaller.unmarshal(FilePath.getComponentsFile());

		for (Component component : definitions.getComponents().getComponentsList()) {
			System.out.println(component.getId().getTypeId());
			System.out.println(component.getId().getSubtypeId());
			System.out.println(component.getMass());
			System.out.println("======");
		}
	}
}
