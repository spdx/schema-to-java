
package org.spdx.library.model;

/** 
 * Types used to external reference identifiers.
 */
public class ReferenceType extends ModelObject
{
    private String contextualExample;
    private String externalReferenceSite;
    private String documentation;

    ReferenceType(String Id) {
        super(Id);
    }

    ReferenceType(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    /** 
     * Get the 'contextualExample' element value. Example for use of the external repository identifier
     * 
     * @return value
     */
    public String getContextualExample() {
        return contextualExample;
    }

    /** 
     * Set the 'contextualExample' element value. Example for use of the external repository identifier
     * 
     * @param contextualExample
     */
    public void setContextualExample(String contextualExample) {
        this.contextualExample = contextualExample;
    }

    /** 
     * Get the 'externalReferenceSite' element value. Website for the maintainers of the external reference site
     * 
     * @return value
     */
    public String getExternalReferenceSite() {
        return externalReferenceSite;
    }

    /** 
     * Set the 'externalReferenceSite' element value. Website for the maintainers of the external reference site
     * 
     * @param externalReferenceSite
     */
    public void setExternalReferenceSite(String externalReferenceSite) {
        this.externalReferenceSite = externalReferenceSite;
    }

    /** 
     * Get the 'documentation' element value. Website containing the documentation related to the repository identifier
     * 
     * @return value
     */
    public String getDocumentation() {
        return documentation;
    }

    /** 
     * Set the 'documentation' element value. Website containing the documentation related to the repository identifier
     * 
     * @param documentation
     */
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
}
