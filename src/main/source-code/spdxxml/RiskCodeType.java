
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for the level of risk associated with a software artifact
 */
public class RiskCodeType
{
    private RiskCodeSimpleType riskCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public RiskCodeSimpleType getRiskCodeSimpleType() {
        return riskCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param riskCodeSimpleType
     */
    public void setRiskCodeSimpleType(RiskCodeSimpleType riskCodeSimpleType) {
        this.riskCodeSimpleType = riskCodeSimpleType;
    }

    /** 
     * Get the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @return value
     */
    public SimpleObjectAttributeGroup getSimpleObjectAttributeGroup() {
        return simpleObjectAttributeGroup;
    }

    /** 
     * Set the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @param simpleObjectAttributeGroup
     */
    public void setSimpleObjectAttributeGroup(
            SimpleObjectAttributeGroup simpleObjectAttributeGroup) {
        this.simpleObjectAttributeGroup = simpleObjectAttributeGroup;
    }
}
