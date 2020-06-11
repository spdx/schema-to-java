
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ReferenceID type
 */
public class ReferenceIDType extends ObjectType
{
    private ExternalReferenceSiteURIType externalReferenceSiteURI;
    private ContextualExampleTextType contextualExampleText;
    private DocumentationURIType documentationURI;
    private List<ReferenceIDAugmentationPoint> referenceIDAugmentationPointList = new ArrayList<ReferenceIDAugmentationPoint>();

    /** 
     * Get the 'ExternalReferenceSiteURI' element value.
     * 
     * @return value
     */
    public ExternalReferenceSiteURIType getExternalReferenceSiteURI() {
        return externalReferenceSiteURI;
    }

    /** 
     * Set the 'ExternalReferenceSiteURI' element value.
     * 
     * @param externalReferenceSiteURI
     */
    public void setExternalReferenceSiteURI(
            ExternalReferenceSiteURIType externalReferenceSiteURI) {
        this.externalReferenceSiteURI = externalReferenceSiteURI;
    }

    /** 
     * Get the 'ContextualExampleText' element value.
     * 
     * @return value
     */
    public ContextualExampleTextType getContextualExampleText() {
        return contextualExampleText;
    }

    /** 
     * Set the 'ContextualExampleText' element value.
     * 
     * @param contextualExampleText
     */
    public void setContextualExampleText(
            ContextualExampleTextType contextualExampleText) {
        this.contextualExampleText = contextualExampleText;
    }

    /** 
     * Get the 'DocumentationURI' element value.
     * 
     * @return value
     */
    public DocumentationURIType getDocumentationURI() {
        return documentationURI;
    }

    /** 
     * Set the 'DocumentationURI' element value.
     * 
     * @param documentationURI
     */
    public void setDocumentationURI(DocumentationURIType documentationURI) {
        this.documentationURI = documentationURI;
    }

    /** 
     * Get the list of 'ReferenceIDAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ReferenceIDAugmentationPoint> getReferenceIDAugmentationPointList() {
        return referenceIDAugmentationPointList;
    }

    /** 
     * Set the list of 'ReferenceIDAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setReferenceIDAugmentationPointList(
            List<ReferenceIDAugmentationPoint> list) {
        referenceIDAugmentationPointList = list;
    }
}
