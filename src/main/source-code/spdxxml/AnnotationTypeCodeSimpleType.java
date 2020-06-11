
package spdxxml;

/** 
 * A data type for AnnotationType properties
 */
public enum AnnotationTypeCodeSimpleType {
    /** 
     * Type of annotation which does not fit in any of the pre-defined annotation types.
     */
    ANNOTATION_TYPE_OTHER("AnnotationTypeOther"), /** 
                                                   * A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement.
                                                   */
    ANNOTATION_TYPE_REVIEW("AnnotationTypeReview");
    private final String value;

    private AnnotationTypeCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AnnotationTypeCodeSimpleType convert(String value) {
        for (AnnotationTypeCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
