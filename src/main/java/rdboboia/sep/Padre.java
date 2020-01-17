package rdboboia.sep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "Padre")
@XmlAccessorType(XmlAccessType.FIELD)
public class Padre {
	@XmlElement(name = "Edad")
	private int edad;
}
