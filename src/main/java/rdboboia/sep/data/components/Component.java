package rdboboia.sep.data.components;

import javax.xml.bind.annotation.XmlElement;

import rdboboia.sep.data.Id;

public class Component {
	private Id id;
	private String displayName;
	private String icon;
	private Size size;
	private String mass;
	private String volume;
	private String model;
	private String physicalMaterial;
	private String maxIntegrity;
	private String dropProbability;
	private String health;
	private String minimumOfferAmount;
	private String maximumOfferAmount;
	private String minimumOrderAmount;
	private String maximumOrderAmount;
	private String canPlayerOrder;
	private String minimumAcquisitionAmount;
	private String maximumAcquisitionAmount;

	public Id getId() {
		return id;
	}

	@XmlElement(name = "Id")
	public void setId(Id id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	@XmlElement(name = "DisplayName")
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getIcon() {
		return icon;
	}

	@XmlElement(name = "Icon")
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Size getSize() {
		return size;
	}

	@XmlElement(name = "Size")
	public void setSize(Size size) {
		this.size = size;
	}

	public String getMass() {
		return mass;
	}

	@XmlElement(name = "Mass")
	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getVolume() {
		return volume;
	}

	@XmlElement(name = "Volume")
	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getModel() {
		return model;
	}

	@XmlElement(name = "Model")
	public void setModel(String model) {
		this.model = model;
	}

	public String getPhysicalMaterial() {
		return physicalMaterial;
	}

	@XmlElement(name = "PhysicalMaterial")
	public void setPhysicalMaterial(String physicalMaterial) {
		this.physicalMaterial = physicalMaterial;
	}

	public String getMaxIntegrity() {
		return maxIntegrity;
	}

	@XmlElement(name = "MaxIntegrity")
	public void setMaxIntegrity(String maxIntegrity) {
		this.maxIntegrity = maxIntegrity;
	}

	public String getDropProbability() {
		return dropProbability;
	}

	@XmlElement(name = "DropProbability")
	public void setDropProbability(String dropProbability) {
		this.dropProbability = dropProbability;
	}

	public String getHealth() {
		return health;
	}

	@XmlElement(name = "Health")
	public void setHealth(String health) {
		this.health = health;
	}

	public String getMinimumOfferAmount() {
		return minimumOfferAmount;
	}

	@XmlElement(name = "MinimumOfferAmount")
	public void setMinimumOfferAmount(String minimumOfferAmount) {
		this.minimumOfferAmount = minimumOfferAmount;
	}

	public String getMaximumOfferAmount() {
		return maximumOfferAmount;
	}

	@XmlElement(name = "MaximumOfferAmount")
	public void setMaximumOfferAmount(String maximumOfferAmount) {
		this.maximumOfferAmount = maximumOfferAmount;
	}

	public String getMinimumOrderAmount() {
		return minimumOrderAmount;
	}

	@XmlElement(name = "MinimumOrderAmount")
	public void setMinimumOrderAmount(String minimumOrderAmount) {
		this.minimumOrderAmount = minimumOrderAmount;
	}

	public String getMaximumOrderAmount() {
		return maximumOrderAmount;
	}

	@XmlElement(name = "MaximumOrderAmount")
	public void setMaximumOrderAmount(String maximumOrderAmount) {
		this.maximumOrderAmount = maximumOrderAmount;
	}

	public String getCanPlayerOrder() {
		return canPlayerOrder;
	}

	@XmlElement(name = "CanPlayerOrder")
	public void setCanPlayerOrder(String canPlayerOrder) {
		this.canPlayerOrder = canPlayerOrder;
	}

	public String getMinimumAcquisitionAmount() {
		return minimumAcquisitionAmount;
	}

	@XmlElement(name = "MinimumAcquisitionAmount")
	public void setMinimumAcquisitionAmount(String minimumAcquisitionAmount) {
		this.minimumAcquisitionAmount = minimumAcquisitionAmount;
	}

	public String getMaximumAcquisitionAmount() {
		return maximumAcquisitionAmount;
	}

	@XmlElement(name = "MaximumAcquisitionAmount")
	public void setMaximumAcquisitionAmount(String maximumAcquisitionAmount) {
		this.maximumAcquisitionAmount = maximumAcquisitionAmount;
	}

	@Override
	public String toString() {
		return "Component [id=" + id + ", displayName=" + displayName + ", icon=" + icon + ", size=" + size + ", mass="
				+ mass + ", volume=" + volume + ", model=" + model + ", physicalMaterial=" + physicalMaterial
				+ ", maxIntegrity=" + maxIntegrity + ", dropProbability=" + dropProbability + ", health=" + health
				+ ", minimumOfferAmount=" + minimumOfferAmount + ", maximumOfferAmount=" + maximumOfferAmount
				+ ", minimumOrderAmount=" + minimumOrderAmount + ", maximumOrderAmount=" + maximumOrderAmount
				+ ", canPlayerOrder=" + canPlayerOrder + ", minimumAcquisitionAmount=" + minimumAcquisitionAmount
				+ ", maximumAcquisitionAmount=" + maximumAcquisitionAmount + "]";
	}
}
