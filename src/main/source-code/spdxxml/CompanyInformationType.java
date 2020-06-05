
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyInformationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:NameText"/>
 *         &lt;xs:element ref="ns:CompanyInformationAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyInformationType extends ObjectType
{
    private NameText nameText;
    private List<CompanyInformationAugmentationPoint> companyInformationAugmentationPointList = new ArrayList<CompanyInformationAugmentationPoint>();

    /** 
     * Get the 'NameText' element value. A data item for a name
     * 
     * @return value
     */
    public NameText getNameText() {
        return nameText;
    }

    /** 
     * Set the 'NameText' element value. A data item for a name
     * 
     * @param nameText
     */
    public void setNameText(NameText nameText) {
        this.nameText = nameText;
    }

    /** 
     * Get the list of 'CompanyInformationAugmentationPoint' element items. An augmentation point for CompanyInformationType
     * 
     * @return list
     */
    public List<CompanyInformationAugmentationPoint> getCompanyInformationAugmentationPointList() {
        return companyInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'CompanyInformationAugmentationPoint' element items. An augmentation point for CompanyInformationType
     * 
     * @param list
     */
    public void setCompanyInformationAugmentationPointList(
            List<CompanyInformationAugmentationPoint> list) {
        companyInformationAugmentationPointList = list;
    }
}
