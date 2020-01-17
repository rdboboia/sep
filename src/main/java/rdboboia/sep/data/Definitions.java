package rdboboia.sep.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import rdboboia.sep.data.components.Components;
import rdboboia.sep.data.cubeblocks.CubeBlocks;

@XmlRootElement(name = "Definitions")
public class Definitions {
	private Components components;
	private CubeBlocks cubeBlocks;

	public Components getComponents() {
		return components;
	}

	@XmlElement(name = "Components")
	public void setComponents(Components components) {
		this.components = components;
	}

	public CubeBlocks getCubeBlocks() {
		return cubeBlocks;
	}

	@XmlElement(name = "CubeBlocks")
	public void setCubeBlocks(CubeBlocks cubeBlocks) {
		this.cubeBlocks = cubeBlocks;
	}

	@Override
	public String toString() {
		return "Definitions [components=" + components + ", cubeBlocks=" + cubeBlocks + "]";
	}
}
