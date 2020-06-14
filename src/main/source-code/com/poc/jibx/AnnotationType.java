
package com.poc.jibx;

/** 
 * This type describes the type of annotation. Annotations are usually created when someone reviews the file, and if this is the case the annotation type should be REVIEW.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AnnotationType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="annotationType_review"/>
 *     &lt;xs:enumeration value="annotationType_other"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum AnnotationType {
    /** 
     * A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement.
     */
    ANNOTATION_TYPE_REVIEW("annotationType_review"), /** 
                                                      * Type of annotation which does not fit in any of the pre-defined annotation types.
                                                      */
    ANNOTATION_TYPE_OTHER("annotationType_other");
    private final String value;

    private AnnotationType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AnnotationType convert(String value) {
        for (AnnotationType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
