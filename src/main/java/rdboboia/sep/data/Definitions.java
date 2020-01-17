package rdboboia.sep.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import rdboboia.sep.data.components.Components;
import rdboboia.sep.data.cubeblocks.CubeBlocks;
import rdboboia.sep.data.cubeblocks.energy.CubeBlocksEnergy;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Definitions")
public class Definitions {

	@XmlElement(name = "Components")
	private Components components;

//	@XmlElement(name = "CubeBlocks")
//	private CubeBlocks cubeBlocks;
	
	@XmlElement(name = "CubeBlocks")
	private CubeBlocksEnergy cubeBlocksEnergy;
	
}
