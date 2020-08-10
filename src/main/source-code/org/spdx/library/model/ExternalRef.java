
package org.spdx.library.model;

/** 
 * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.
 */
public class ExternalRef extends ModelObject
{
    private String comment;
    private ReferenceCategory referenceCategory;
    private String referenceLocator;
    private ReferenceType referenceType;

    ExternalRef(IModelStore modelStore, String documentUri, String id) {
        super();
    }

    /** 
     * Get the 'comment' element value.
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'comment' element value.
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'referenceCategory' element value. Category for the external reference
     * 
     * @return value
     */
    public ReferenceCategory getReferenceCategory() {
        return referenceCategory;
    }

    /** 
     * Set the 'referenceCategory' element value. Category for the external reference
     * 
     * @param referenceCategory
     */
    public void setReferenceCategory(ReferenceCategory referenceCategory) {
        this.referenceCategory = referenceCategory;
    }

    /** 
     * Get the 'referenceLocator' element value. The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the &lt;type&gt;.
     * 
     * @return value
     */
    public String getReferenceLocator() {
        return referenceLocator;
    }

    /** 
     * Set the 'referenceLocator' element value. The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the &lt;type&gt;.
     * 
     * @param referenceLocator
     */
    public void setReferenceLocator(String referenceLocator) {
        this.referenceLocator = referenceLocator;
    }

    /** 
     * Get the 'referenceType' element value. Type of the external reference. These are definined in an appendix in the SPDX specification.
     * 
     * @return value
     */
    public ReferenceType getReferenceType() {
        return referenceType;
    }

    /** 
     * Set the 'referenceType' element value. Type of the external reference. These are definined in an appendix in the SPDX specification.
     * 
     * @param referenceType
     */
    public void setReferenceType(ReferenceType referenceType) {
        this.referenceType = referenceType;
    }
}
