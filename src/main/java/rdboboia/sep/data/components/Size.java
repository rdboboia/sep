package rdboboia.sep.data.components;

import javax.xml.bind.annotation.XmlElement;

public class Size {
	private float x;
	private float y;
	private float z;

	@Override
	public String toString() {
		return "Size [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public float getX() {
		return x;
	}

	@XmlElement(name = "X")
	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	@XmlElement(name = "Y")
	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	@XmlElement(name = "Z")
	public void setZ(float z) {
		this.z = z;
	}
}
