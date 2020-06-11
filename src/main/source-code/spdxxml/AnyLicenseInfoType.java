
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for AnyLicenseInfo type
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
