package rdboboia.sep.data.cubeblocks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class CriticalComponent {
	@XmlAttribute(name = "Subtype")
	private String subtype;

	@XmlAttribute(name = "Index")
	private String index;
}
