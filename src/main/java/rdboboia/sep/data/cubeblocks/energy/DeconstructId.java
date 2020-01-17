
package rdboboia.sep.data.cubeblocks.energy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DeconstructId {

	@XmlElement(name = "TypeId")
	public String typeId;

	@XmlElement(name = "SubtypeId")
	public String subtypeId;

}
