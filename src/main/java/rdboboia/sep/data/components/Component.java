package rdboboia.sep.data.components;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;
import rdboboia.sep.data.Id;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Component {

	@XmlElement(name = "Id")
	private Id id;

	@XmlElement(name = "DisplayName")
	private String displayName;

	@XmlElement(name = "Icon")
	private String icon;

	@XmlElement(name = "Size")
	private Size size;

	@XmlElement(name = "Mass")
	private String mass;

	@XmlElement(name = "Volume")
	private String volume;

	@XmlElement(name = "Model")
	private String model;

	@XmlElement(name = "PhysicalMaterial")
	private String physicalMaterial;

	@XmlElement(name = "MaxIntegrity")
	private String maxIntegrity;

	@XmlElement(name = "DropProbability")
	private String dropProbability;

	@XmlElement(name = "Health")
	private String health;

	@XmlElement(name = "MinimumOfferAmount")
	private String minimumOfferAmount;

	@XmlElement(name = "MaximumOfferAmount")
	private String maximumOfferAmount;

	@XmlElement(name = "MinimumOrderAmount")
	private String minimumOrderAmount;

	@XmlElement(name = "MaximumOrderAmount")
	private String maximumOrderAmount;

	@XmlElement(name = "CanPlayerOrder")
	private String canPlayerOrder;

	@XmlElement(name = "MinimumAcquisitionAmount")
	private String minimumAcquisitionAmount;

	@XmlElement(name = "MaximumAcquisitionAmount")
	private String maximumAcquisitionAmount;
}
