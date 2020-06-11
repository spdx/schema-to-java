
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for Algorithm properties
 */
public class AlgorithmCodeType
{
    private AlgorithmCodeSimpleType algorithmCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public AlgorithmCodeSimpleType getAlgorithmCodeSimpleType() {
        return algorithmCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param algorithmCodeSimpleType
     */
    public void setAlgorithmCodeSimpleType(
            AlgorithmCodeSimpleType algorithmCodeSimpleType) {
        this.algorithmCodeSimpleType = algorithmCodeSimpleType;
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
