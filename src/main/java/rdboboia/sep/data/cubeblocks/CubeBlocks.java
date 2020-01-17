package rdboboia.sep.data.cubeblocks;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class CubeBlocks {
	private List<Definition> definitionList;

	public List<Definition> getDefinitionList() {
		return definitionList;
	}

	@XmlElement(name = "Definition")
	public void setDefinitionList(List<Definition> definitionList) {
		this.definitionList = definitionList;
	}

	@Override
	public String toString() {
		return "CubeBlocks [definitionList=" + definitionList + "]";
	}
}
