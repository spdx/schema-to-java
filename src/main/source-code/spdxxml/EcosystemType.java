
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software ecosystem information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EcosystemType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:CommitterQuantity"/>
 *         &lt;xs:element ref="ns:Languages"/>
 *         &lt;xs:element ref="ns:CommitLogs"/>
 *         &lt;xs:element ref="ns:EcosystemAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EcosystemType extends ObjectType
{
    private CommitterQuantity committerQuantity;
    private LanguagesType languages;
    private CommitLogsType commitLogs;
    private List<EcosystemAugmentationPoint> ecosystemAugmentationPointList = new ArrayList<EcosystemAugmentationPoint>();

    /** 
     * Get the 'CommitterQuantity' element value. A data item for the number of committers to a software repository
     * 
     * @return value
     */
    public CommitterQuantity getCommitterQuantity() {
        return committerQuantity;
    }

    /** 
     * Set the 'CommitterQuantity' element value. A data item for the number of committers to a software repository
     * 
     * @param committerQuantity
     */
    public void setCommitterQuantity(CommitterQuantity committerQuantity) {
        this.committerQuantity = committerQuantity;
    }

    /** 
     * Get the 'Languages' element value. A data item for languages used in a software repository
     * 
     * @return value
     */
    public LanguagesType getLanguages() {
        return languages;
    }

    /** 
     * Set the 'Languages' element value. A data item for languages used in a software repository
     * 
     * @param languages
     */
    public void setLanguages(LanguagesType languages) {
        this.languages = languages;
    }

    /** 
     * Get the 'CommitLogs' element value. A data item for entries associated with software repository commit events
     * 
     * @return value
     */
    public CommitLogsType getCommitLogs() {
        return commitLogs;
    }

    /** 
     * Set the 'CommitLogs' element value. A data item for entries associated with software repository commit events
     * 
     * @param commitLogs
     */
    public void setCommitLogs(CommitLogsType commitLogs) {
        this.commitLogs = commitLogs;
    }

    /** 
     * Get the list of 'EcosystemAugmentationPoint' element items. An augmentation point for EcosystemType
     * 
     * @return list
     */
    public List<EcosystemAugmentationPoint> getEcosystemAugmentationPointList() {
        return ecosystemAugmentationPointList;
    }

    /** 
     * Set the list of 'EcosystemAugmentationPoint' element items. An augmentation point for EcosystemType
     * 
     * @param list
     */
    public void setEcosystemAugmentationPointList(
            List<EcosystemAugmentationPoint> list) {
        ecosystemAugmentationPointList = list;
    }
}
