
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software company information
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
