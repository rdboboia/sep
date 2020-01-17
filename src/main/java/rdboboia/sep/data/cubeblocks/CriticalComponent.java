package rdboboia.sep.data.cubeblocks;

import javax.xml.bind.annotation.XmlAttribute;

public class CriticalComponent {
	private String subtype;
	private String index;

	public String getSubtype() {
		return subtype;
	}

	@XmlAttribute(name = "Subtype")
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getIndex() {
		return index;
	}

	@XmlAttribute(name = "Index")
	public void setIndex(String index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "CriticalComponent [subtype=" + subtype + ", index=" + index + "]";
	}
}
