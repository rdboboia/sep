package rdboboia.sep.data.cubeblocks.energy;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;
import rdboboia.sep.data.Id;
import rdboboia.sep.data.components.Size;
import rdboboia.sep.data.cubeblocks.ComponentAttribute;
import rdboboia.sep.data.cubeblocks.Components;
import rdboboia.sep.data.cubeblocks.CriticalComponent;
import rdboboia.sep.data.cubeblocks.SizeAttribute;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Definition {

	@XmlAttribute(name = "type", namespace = "http://www.w3.org/2001/XMLSchema-instance")
	public String type;
	
	@XmlElement(name = "Id")
	public Id id;
	
	@XmlElement(name = "DisplayName")
	public String displayName;
	
	@XmlElement(name = "Icon")
	public String icon;
	
	@XmlElement(name = "Description")
	public String description;
	
	@XmlElement(name = "CubeSize")
	public String cubeSize;
	
	@XmlElement(name = "BlockTopology")
	public String blockTopology;
	
	@XmlElement(name = "Size")
	public SizeAttribute size;
	
	@XmlElement(name = "ModelOffset")
	public Size modelOffset;
	
	@XmlElement(name = "Model")
	public String model;
	
	@XmlElement(name = "Components")
	public Components components;
	
	@XmlElement(name = "CriticalComponent")
	public CriticalComponent criticalComponent;
	
	@XmlElement(name = "BlockPairName")
	public String blockPairName;
	
	@XmlElement(name = "EdgeType")
	public String edgeType;
	
	@XmlElement(name = "BuildTimeSeconds")
	public String buildTimeSeconds;
	
	@XmlElement(name = "ResourceSourceGroup")
	public String resourceSourceGroup;
	
	@XmlElement(name = "MaxPowerOutput")
	public String maxPowerOutput;
	
	@XmlElement(name = "ResourceSinkGroup")
	public String resourceSinkGroup;
	
	@XmlElement(name = "RequiredPowerInput")
	public String requiredPowerInput;
	
	@XmlElement(name = "AdaptibleInput")
	public String adaptibleInput;
	
	@XmlElement(name = "MaxStoredPower")
	public String maxStoredPower;
	
	@XmlElement(name = "InitialStoredPowerRatio")
	public String initialStoredPowerRatio;
	
	@XmlElement(name = "InventorySize")
	public InventorySize inventorySize;
	
	@XmlElement(name = "Public")
	public String _public;
	
	@XmlElement(name = "DamageEffectName")
	public String damageEffectName;
	
	@XmlElement(name = "DamagedSound")
	public String damagedSound;
	
	@XmlElement(name = "EmissiveColorPreset")
	public String emissiveColorPreset;
	
	@XmlElement(name = "DestroyEffect")
	public String destroyEffect;
	
	@XmlElement(name = "DestroySound")
	public String destroySound;
	
	@XmlElement(name = "PCU")
	public String pCU;
	
	@XmlElement(name = "IsAirTight")
	public String isAirTight;
	
	@XmlElement(name = "MirroringZ")
	public String mirroringZ;
	
	@XmlElement(name = "MirroringY")
	public String mirroringY;
	
	@XmlElement(name = "GuiVisible")
	public String guiVisible;
	
	@XmlElement(name = "SilenceableByShipSoundSystem")
	public String silenceableByShipSoundSystem;
	
	@XmlElement(name = "FuelInfos")
	public FuelInfos fuelInfos;
	
	@XmlElement(name = "PrimarySound")
	public String primarySound;
	
	@XmlElement(name = "FuelCapacity")
	public String fuelCapacity;
	
	@XmlElement(name = "FuelProductionToCapacityMultiplier")
	public String fuelProductionToCapacityMultiplier;
	
	@XmlElement(name = "AnimationSpeed")
	public String animationSpeed;
	
	@XmlElement(name = "PistonAnimationMin")
	public String pistonAnimationMin;
	
	@XmlElement(name = "PistonAnimationMax")
	public String pistonAnimationMax;
	
	@XmlElement(name = "PistonAnimationOffsets")
	public List<String> pistonAnimationOffsets;
	
	@XmlElement(name = "AnimationSpinUpSpeed")
	public String animationSpinUpSpeed;
	
	@XmlElement(name = "AnimationSpinDownSpeed")
	public String animationSpinDownSpeed;
	
	@XmlElement(name = "PlaceDecals")
	public String placeDecals;
	
	@XmlElement(name = "ResearchGroup")
	public String researchGroup;
	
	@XmlElement(name = "ResearchCost")
	public String researchCost;
	
	@XmlElement(name = "Center")
	public Size center;
	
	@XmlElement(name = "DamageEffectId")
	public String damageEffectId;
	
	@XmlElement(name = "ActionSound")
	public String actionSound;

	@XmlElement(name = "RaycasterSize")
	public String raycasterSize;
	
	@XmlElement(name = "RaycastersCount")
	public String raycastersCount;
	
	@XmlElement(name = "MinRaycasterClearance")
	public String minRaycasterClearance;
	
	@XmlElement(name = "OptimalGroundClearance")
	public String optimalGroundClearance;
	
	@XmlElement(name = "RaycastersToFullEfficiency")
	public String raycastersToFullEfficiency;
	
	@XmlElement(name = "OptimalWindSpeed")
	public String optimalWindSpeed;
	
	@XmlElement(name = "TurbineSpinUpSpeed")
	public String turbineSpinUpSpeed;
	
	@XmlElement(name = "TurbineSpinDownSpeed")
	public String turbineSpinDownSpeed;
	
	@XmlElement(name = "TurbineRotationSpeed")
	public String turbineRotationSpeed;
	
	@XmlElement(name = "TwoSidedPanel")
	public String twoSidedPanel;
	
	@XmlElement(name = "PanelOffset")
	public String panelOffset;
	
	@XmlElement(name = "PhysicalMaterial")
	public String physicalMaterial;
	
	@XmlElement(name = "MirroringX")
	public String mirroringX;

}
