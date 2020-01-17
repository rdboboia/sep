package rdboboia.sep.data.cubeblocks;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cubeblocks")
public class Components {
	@XmlElement(name = "Component")
	private List<ComponentAttribute> componentList;
}
