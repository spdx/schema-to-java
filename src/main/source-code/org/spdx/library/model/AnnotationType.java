
package org.spdx.library.model;

/** 
 * This type describes the type of annotation. Annotations are usually created when someone reviews the file, and if this is the case the annotation type should be REVIEW.
 */
public enum AnnotationType implements IndividualUriValue {
    /** 
     * A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement.
     */
    annotationType_review, /** 
                            * Type of annotation which does not fit in any of the pre-defined annotation types.
                            */
    annotationType_other;
    private String longName;

    public String getLongName() {
        return "longName";
    }

    public String getNameSpace() {
        return "SpdxConstants.SPDX_NAMESPACE";
    }

    public String getIndividualURI() {
        return getLongName() + getNameSpace();
    }
}
