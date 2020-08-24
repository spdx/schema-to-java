
package org.spdx.library.model;

/** 
 * This type describes the type of annotation. Annotations are usually created when someone reviews the file, and if this is the case the annotation type should be REVIEW.
 */
public enum AnnotationType implements IndividualUriValue {
    /** 
     * A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement.
     */
    ANNOTATION_TYPE_REVIEW("annotationType_review"), /** 
                                                      * Type of annotation which does not fit in any of the pre-defined annotation types.
                                                      */
    ANNOTATION_TYPE_OTHER("annotationType_other");
    private String longName;
    private final String value;

    public String getLongName() {
        return "longName";
    }

    public String getNameSpace() {
        return "SpdxConstants.SPDX_NAMESPACE";
    }

    public String getIndividualURI() {
        return getLongName() + getNameSpace();
    }

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
