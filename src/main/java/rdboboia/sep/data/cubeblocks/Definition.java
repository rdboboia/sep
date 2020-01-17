package rdboboia.sep.data.cubeblocks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Data;
import rdboboia.sep.data.Id;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "energy")
public class Definition {

	@XmlElement(name = "Id")
	private Id id;
	@XmlElement(name = "DisplayName")
	private String displayName;
	@XmlElement(name = "Icon")
	private String icon;
	@XmlElement(name = "Public")
	private String _public;
	@XmlElement(name = "CubeSize")
	private String cubeSize;
	@XmlElement(name = "BlockTopology")
	private String blockTopology;
	@XmlElement(name = "Size")
	private SizeAttribute size;

	@XmlElement(name = "Model")
	private String model;
	@XmlElement(name = "Components")
	private Components components;
	@XmlElement(name = "CriticalComponent")
	private CriticalComponent criticalComponent;

	@XmlElement(name = "BlockPairName")
	private String blockPairName;
	@XmlElement(name = "EdgeType")
	private String edgeType;
	@XmlElement(name = "BuildTimeSeconds")
	private String buildTimeSeconds;
	@XmlElement(name = "PCU")
	private String pCU;
	@XmlElement(name = "IsAirTight")
	private String isAirTight;
	@XmlElement(name = "@type")
	private String type;
	@XmlElement(name = "RequiredPowerInput")
	private String requiredPowerInput;
}
