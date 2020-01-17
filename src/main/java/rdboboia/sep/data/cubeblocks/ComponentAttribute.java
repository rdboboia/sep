package rdboboia.sep.data.cubeblocks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;
import rdboboia.sep.data.cubeblocks.energy.DeconstructId;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ComponentAttribute {

    @XmlAttribute(name = "Subtype")
    public String subtype;
    
    @XmlAttribute(name = "Count")
    public String count;
    
    @XmlElement(name = "DeconstructId")
    public DeconstructId deconstructId;
}
