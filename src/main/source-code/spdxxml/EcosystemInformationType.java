
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for information pertaining to a software project's ecosystem which includes programming languages, references, number of committers, mailing list activity,
 overall sentiment, and other information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EcosystemInformationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:Ecosystem"/>
 *         &lt;xs:element ref="ns:CompanyInformation"/>
 *         &lt;xs:element ref="ns:EcosystemInformationAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EcosystemInformationType extends ObjectType
{
    private EcosystemType ecosystem;
    private CompanyInformationType companyInformation;
    private List<EcosystemInformationAugmentationPoint> ecosystemInformationAugmentationPointList = new ArrayList<EcosystemInformationAugmentationPoint>();

    /** 
     * Get the 'Ecosystem' element value. A data item for software ecosystem information
     * 
     * @return value
     */
    public EcosystemType getEcosystem() {
        return ecosystem;
    }

    /** 
     * Set the 'Ecosystem' element value. A data item for software ecosystem information
     * 
     * @param ecosystem
     */
    public void setEcosystem(EcosystemType ecosystem) {
        this.ecosystem = ecosystem;
    }

    /** 
     * Get the 'CompanyInformation' element value. A data item for languages used in a software repository
     * 
     * @return value
     */
    public CompanyInformationType getCompanyInformation() {
        return companyInformation;
    }

    /** 
     * Set the 'CompanyInformation' element value. A data item for languages used in a software repository
     * 
     * @param companyInformation
     */
    public void setCompanyInformation(CompanyInformationType companyInformation) {
        this.companyInformation = companyInformation;
    }

    /** 
     * Get the list of 'EcosystemInformationAugmentationPoint' element items. An augmentation point for EcosystemInformationType
     * 
     * @return list
     */
    public List<EcosystemInformationAugmentationPoint> getEcosystemInformationAugmentationPointList() {
        return ecosystemInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'EcosystemInformationAugmentationPoint' element items. An augmentation point for EcosystemInformationType
     * 
     * @param list
     */
    public void setEcosystemInformationAugmentationPointList(
            List<EcosystemInformationAugmentationPoint> list) {
        ecosystemInformationAugmentationPointList = list;
    }
}
