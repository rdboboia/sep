package rdboboia.sep;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import rdboboia.sep.data.Definitions;
import rdboboia.sep.data.components.Component;
import rdboboia.sep.data.components.Components;
import rdboboia.sep.data.cubeblocks.ComponentAttribute;
import rdboboia.sep.data.cubeblocks.energy.CubeBlocksEnergy;

public class DataProcessingPoc {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Definitions.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		System.out.println("Reading and parsing game data files...");
		Components components = ((Definitions) unmarshaller.unmarshal(FilePath.getComponentsFile())).getComponents();
		CubeBlocksEnergy energyBlocks = ((Definitions) unmarshaller.unmarshal(FilePath.getCubeBlocksEnergyFile())).getCubeBlocksEnergy();
		System.out.println(energyBlocks);
		
		System.out.println("Mapping the data...");
		Map<String, Component> compMap = new HashMap<>();
		for (Component comp : components.getComponentsList()) {
			compMap.put(comp.getId().getSubtypeId(), comp);
		}
		
		System.out.println("Computing battery weight...");
		// How much a large battery weights?
		float weight = 0;
		for (ComponentAttribute batteryComps : energyBlocks.getDefinitionList().get(0).getComponents().getComponentList()) {
			Component comp = compMap.get(batteryComps.getSubtype());
			weight += Float.parseFloat(comp.getMass()) * Integer.parseInt(batteryComps.getCount());
			
			System.out.println(weight);
		}
		
		
	}
}