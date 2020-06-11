
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ListedLicense type
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
