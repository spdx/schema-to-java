
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ReferenceID type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceIDType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ExternalReferenceSiteURI" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ContextualExampleText" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:DocumentationURI" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ReferenceIDAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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
