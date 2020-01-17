package rdboboia.sep.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Component")
public class Id {

	@XmlElement(name = "TypeId")
	private String typeId;

	@XmlElement(name = "SubtypeId")
	private String subtypeId;
}
