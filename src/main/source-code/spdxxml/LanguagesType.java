
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for languages used in a software repository
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LanguagesType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:LanguageText" minOccurs="1" maxOccurs="100"/>
 *         &lt;xs:element ref="ns:LanguagesAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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
