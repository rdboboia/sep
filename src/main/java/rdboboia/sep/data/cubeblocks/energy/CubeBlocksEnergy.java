
package rdboboia.sep.data.cubeblocks.energy;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CubeBlocks")
public class CubeBlocksEnergy {

    @XmlElement(name = "Definition")
    public List<Definition> definitionList;

}
