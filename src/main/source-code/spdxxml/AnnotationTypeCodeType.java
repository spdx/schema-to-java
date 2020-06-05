
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for AnnotationType properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AnnotationTypeCodeType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:AnnotationTypeCodeSimpleType">
 *       &lt;xs:attributeGroup ref="ns1:SimpleObjectAttributeGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
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
