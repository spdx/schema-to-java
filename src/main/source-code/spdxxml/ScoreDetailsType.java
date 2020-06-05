
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for common vulnerability score details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ScoreDetailsType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:CommonVulnerabilityScoringSystemV2"/>
 *         &lt;xs:element ref="ns:CommonVulnerabilityScoringSystemV3" minOccurs="0" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ScoreDetailsAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ScoreDetailsType extends ObjectType
{
    private CommonVulnerabilityScoringSystemV2Type commonVulnerabilityScoringSystemV2;
    private CommonVulnerabilityScoringSystemV3Type commonVulnerabilityScoringSystemV3;
    private List<ScoreDetailsAugmentationPoint> scoreDetailsAugmentationPointList = new ArrayList<ScoreDetailsAugmentationPoint>();

    /** 
     * Get the 'CommonVulnerabilityScoringSystemV2' element value. A data type for Common Vulnerability Scoring System V2 (CVSSV2) Information
     * 
     * @return value
     */
    public CommonVulnerabilityScoringSystemV2Type getCommonVulnerabilityScoringSystemV2() {
        return commonVulnerabilityScoringSystemV2;
    }

    /** 
     * Set the 'CommonVulnerabilityScoringSystemV2' element value. A data type for Common Vulnerability Scoring System V2 (CVSSV2) Information
     * 
     * @param commonVulnerabilityScoringSystemV2
     */
    public void setCommonVulnerabilityScoringSystemV2(
            CommonVulnerabilityScoringSystemV2Type commonVulnerabilityScoringSystemV2) {
        this.commonVulnerabilityScoringSystemV2 = commonVulnerabilityScoringSystemV2;
    }

    /** 
     * Get the 'CommonVulnerabilityScoringSystemV3' element value. A data type for Common Vulnerability Scoring System V3 (CVSSV3) Information
     * 
     * @return value
     */
    public CommonVulnerabilityScoringSystemV3Type getCommonVulnerabilityScoringSystemV3() {
        return commonVulnerabilityScoringSystemV3;
    }

    /** 
     * Set the 'CommonVulnerabilityScoringSystemV3' element value. A data type for Common Vulnerability Scoring System V3 (CVSSV3) Information
     * 
     * @param commonVulnerabilityScoringSystemV3
     */
    public void setCommonVulnerabilityScoringSystemV3(
            CommonVulnerabilityScoringSystemV3Type commonVulnerabilityScoringSystemV3) {
        this.commonVulnerabilityScoringSystemV3 = commonVulnerabilityScoringSystemV3;
    }

    /** 
     * Get the list of 'ScoreDetailsAugmentationPoint' element items. An augmentation point for ScoreDetailsType
     * 
     * @return list
     */
    public List<ScoreDetailsAugmentationPoint> getScoreDetailsAugmentationPointList() {
        return scoreDetailsAugmentationPointList;
    }

    /** 
     * Set the list of 'ScoreDetailsAugmentationPoint' element items. An augmentation point for ScoreDetailsType
     * 
     * @param list
     */
    public void setScoreDetailsAugmentationPointList(
            List<ScoreDetailsAugmentationPoint> list) {
        scoreDetailsAugmentationPointList = list;
    }
}
