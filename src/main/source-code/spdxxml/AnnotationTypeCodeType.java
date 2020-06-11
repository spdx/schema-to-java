
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for AnnotationType properties
 */
public class AnnotationTypeCodeType
{
    private AnnotationTypeCodeSimpleType annotationTypeCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public AnnotationTypeCodeSimpleType getAnnotationTypeCodeSimpleType() {
        return annotationTypeCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param annotationTypeCodeSimpleType
     */
    public void setAnnotationTypeCodeSimpleType(
            AnnotationTypeCodeSimpleType annotationTypeCodeSimpleType) {
        this.annotationTypeCodeSimpleType = annotationTypeCodeSimpleType;
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
