package rdboboia.sep.data.cubeblocks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SizeAttribute {

	@XmlAttribute(name = "x")
	private String x;

	@XmlAttribute(name = "y")
	private String y;

	@XmlAttribute(name = "z")
	private String z;
}
