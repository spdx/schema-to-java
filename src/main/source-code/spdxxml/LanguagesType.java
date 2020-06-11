
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for languages used in a software repository
 */
public class LanguagesType extends ObjectType
{
    private List<LanguageText> languageTextList = new ArrayList<LanguageText>();
    private List<LanguagesAugmentationPoint> languagesAugmentationPointList = new ArrayList<LanguagesAugmentationPoint>();

    /** 
     * Get the list of 'LanguageText' element items. A data item for the name of a programming language
     * 
     * @return list
     */
    public List<LanguageText> getLanguageTextList() {
        return languageTextList;
    }

    /** 
     * Set the list of 'LanguageText' element items. A data item for the name of a programming language
     * 
     * @param list
     */
    public void setLanguageTextList(List<LanguageText> list) {
        languageTextList = list;
    }

    /** 
     * Get the list of 'LanguagesAugmentationPoint' element items. An augmentation point for LanguagesType
     * 
     * @return list
     */
    public List<LanguagesAugmentationPoint> getLanguagesAugmentationPointList() {
        return languagesAugmentationPointList;
    }

    /** 
     * Set the list of 'LanguagesAugmentationPoint' element items. An augmentation point for LanguagesType
     * 
     * @param list
     */
    public void setLanguagesAugmentationPointList(
            List<LanguagesAugmentationPoint> list) {
        languagesAugmentationPointList = list;
    }
}
