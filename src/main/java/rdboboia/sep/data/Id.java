package rdboboia.sep.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Component")
public class Id {
	private String typeId;
	private String subtypeId;

	public String getTypeId() {
		return typeId;
	}

	@XmlElement(name = "TypeId")
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getSubtypeId() {
		return subtypeId;
	}

	@XmlElement(name = "SubtypeId")
	public void setSubtypeId(String subtypeId) {
		this.subtypeId = subtypeId;
	}

	@Override
	public String toString() {
		return "Id [typeId=" + typeId + ", subtypeId=" + subtypeId + "]";
	}
}
