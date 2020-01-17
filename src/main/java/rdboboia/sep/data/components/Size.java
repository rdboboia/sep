package rdboboia.sep.data.components;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Size {

	@XmlElement(name = "X")
	private float x;

	@XmlElement(name = "Y")
	private float y;

	@XmlElement(name = "Z")
	private float z;
}
