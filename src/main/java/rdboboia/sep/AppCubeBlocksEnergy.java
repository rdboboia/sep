//package rdboboia.sep;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//
//import rdboboia.sep.data.Definitions;
//import rdboboia.sep.data.cubeblocks.Definition;
//
//public class AppCubeBlocksEnergy {
//	public static void main(String[] args) throws JAXBException {
//		JAXBContext context = JAXBContext.newInstance(Definitions.class);
//		Unmarshaller unmarshaller = context.createUnmarshaller();
//		Definitions definitions = (Definitions) unmarshaller.unmarshal(FilePath.getCubeBlocksEnergyFile());
//
//		for (Definition definition : definitions.getCubeBlocks().getDefinitionList()) {
//			System.out.println(definition);
//		}
//		
//		System.out.println(definitions);
//	}
//}
