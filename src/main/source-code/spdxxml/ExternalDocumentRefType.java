
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ExternalDocumentRef type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExternalDocumentRefType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:Checksum" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ExternalDocumentID" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SpdxDocumentID" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ExternalDocumentRefAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExternalDocumentRefType extends ObjectType
{
    private ChecksumType checksum;
    private ExternalDocumentIDType externalDocumentID;
    private SpdxDocumentID spdxDocumentID;
    private List<ExternalDocumentRefAugmentationPoint> externalDocumentRefAugmentationPointList = new ArrayList<ExternalDocumentRefAugmentationPoint>();

    /** 
     * Get the 'Checksum' element value.
     * 
     * @return value
     */
    public ChecksumType getChecksum() {
        return checksum;
    }

    /** 
     * Set the 'Checksum' element value.
     * 
     * @param checksum
     */
    public void setChecksum(ChecksumType checksum) {
        this.checksum = checksum;
    }

    /** 
     * Get the 'ExternalDocumentID' element value.
     * 
     * @return value
     */
    public ExternalDocumentIDType getExternalDocumentID() {
        return externalDocumentID;
    }

    /** 
     * Set the 'ExternalDocumentID' element value.
     * 
     * @param externalDocumentID
     */
    public void setExternalDocumentID(ExternalDocumentIDType externalDocumentID) {
        this.externalDocumentID = externalDocumentID;
    }

    /** 
     * Get the 'SpdxDocumentID' element value.
     * 
     * @return value
     */
    public SpdxDocumentID getSpdxDocumentID() {
        return spdxDocumentID;
    }

    /** 
     * Set the 'SpdxDocumentID' element value.
     * 
     * @param spdxDocumentID
     */
    public void setSpdxDocumentID(SpdxDocumentID spdxDocumentID) {
        this.spdxDocumentID = spdxDocumentID;
    }

    /** 
     * Get the list of 'ExternalDocumentRefAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ExternalDocumentRefAugmentationPoint> getExternalDocumentRefAugmentationPointList() {
        return externalDocumentRefAugmentationPointList;
    }

    /** 
     * Set the list of 'ExternalDocumentRefAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setExternalDocumentRefAugmentationPointList(
            List<ExternalDocumentRefAugmentationPoint> list) {
        externalDocumentRefAugmentationPointList = list;
    }
}
