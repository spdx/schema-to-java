
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for AnyLicenseInfo type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AnyLicenseInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:AnyLicenseInfoAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AnyLicenseInfoType extends ObjectType
{
    private List<AnyLicenseInfoAugmentationPoint> anyLicenseInfoAugmentationPointList = new ArrayList<AnyLicenseInfoAugmentationPoint>();

    /** 
     * Get the list of 'AnyLicenseInfoAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<AnyLicenseInfoAugmentationPoint> getAnyLicenseInfoAugmentationPointList() {
        return anyLicenseInfoAugmentationPointList;
    }

    /** 
     * Set the list of 'AnyLicenseInfoAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setAnyLicenseInfoAugmentationPointList(
            List<AnyLicenseInfoAugmentationPoint> list) {
        anyLicenseInfoAugmentationPointList = list;
    }
}
