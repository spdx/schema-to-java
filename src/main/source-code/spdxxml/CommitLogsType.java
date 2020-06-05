
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for entries associated with software repository commit events
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommitLogsType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:CommitLogText" minOccurs="1" maxOccurs="100"/>
 *         &lt;xs:element ref="ns:CommitLogsAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommitLogsType extends ObjectType
{
    private List<CommitLogText> commitLogTextList = new ArrayList<CommitLogText>();
    private List<CommitLogsAugmentationPoint> commitLogsAugmentationPointList = new ArrayList<CommitLogsAugmentationPoint>();

    /** 
     * Get the list of 'CommitLogText' element items. A data item for an entry associated with software repository commit event
     * 
     * @return list
     */
    public List<CommitLogText> getCommitLogTextList() {
        return commitLogTextList;
    }

    /** 
     * Set the list of 'CommitLogText' element items. A data item for an entry associated with software repository commit event
     * 
     * @param list
     */
    public void setCommitLogTextList(List<CommitLogText> list) {
        commitLogTextList = list;
    }

    /** 
     * Get the list of 'CommitLogsAugmentationPoint' element items. An augmentation point for CommitLogsType
     * 
     * @return list
     */
    public List<CommitLogsAugmentationPoint> getCommitLogsAugmentationPointList() {
        return commitLogsAugmentationPointList;
    }

    /** 
     * Set the list of 'CommitLogsAugmentationPoint' element items. An augmentation point for CommitLogsType
     * 
     * @param list
     */
    public void setCommitLogsAugmentationPointList(
            List<CommitLogsAugmentationPoint> list) {
        commitLogsAugmentationPointList = list;
    }
}
