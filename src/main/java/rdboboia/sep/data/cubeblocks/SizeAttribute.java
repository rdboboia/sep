package rdboboia.sep.data.cubeblocks;

import javax.xml.bind.annotation.XmlAttribute;

public class SizeAttribute {
	private String x;
	private String y;
	private String z;

	public String getX() {
		return x;
	}

	@XmlAttribute(name = "x")
	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	@XmlAttribute(name = "y")
	public void setY(String y) {
		this.y = y;
	}

	public String getZ() {
		return z;
	}

	@XmlAttribute(name = "z")
	public void setZ(String z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "SizeAttribute [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
