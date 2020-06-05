
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ListedLicense type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListedLicenseType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:LicenseType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ListedLicenseAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ListedLicenseType extends LicenseType
{
    private List<ListedLicenseAugmentationPoint> listedLicenseAugmentationPointList = new ArrayList<ListedLicenseAugmentationPoint>();

    /** 
     * Get the list of 'ListedLicenseAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ListedLicenseAugmentationPoint> getListedLicenseAugmentationPointList() {
        return listedLicenseAugmentationPointList;
    }

    /** 
     * Set the list of 'ListedLicenseAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setListedLicenseAugmentationPointList(
            List<ListedLicenseAugmentationPoint> list) {
        listedLicenseAugmentationPointList = list;
    }
}
