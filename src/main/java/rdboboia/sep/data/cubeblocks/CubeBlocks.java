package rdboboia.sep.data.cubeblocks;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class CubeBlocks {

	@XmlElement(name = "Definition")
	private List<Definition> definitionList;
}
