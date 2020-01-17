package rdboboia.sep.data.components;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "components")
public class Components {
	private List<Component> componentsList;

	public List<Component> getComponentsList() {
		return componentsList;
	}

	@XmlElement(name = "Component")
	public void setComponentsList(List<Component> componentsList) {
		this.componentsList = componentsList;
	}

	@Override
	public String toString() {
		return "Components [componentsList=" + componentsList + "]";
	}
}
