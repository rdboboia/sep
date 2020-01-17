package rdboboia.sep.data.cubeblocks;

import javax.xml.bind.annotation.XmlAttribute;

public class ComponentAttribute {
	private String subtype;
	private String count;

	public String getSubtype() {
		return subtype;
	}

	@XmlAttribute(name = "Subtype")
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getCount() {
		return count;
	}

	@XmlAttribute(name = "Count")
	public void setCount(String count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ComponentAttribute [subtype=" + subtype + ", count=" + count + "]";
	}

}
