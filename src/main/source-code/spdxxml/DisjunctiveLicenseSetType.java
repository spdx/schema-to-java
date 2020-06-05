
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for DisjunctiveLicenseSet type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DisjunctiveLicenseSetType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AnyLicenseInfoType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:Member" minOccurs="2" maxOccurs="unbounded"/>
 *         &lt;xs:element ref="ns:DisjunctiveLicenseSetAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DisjunctiveLicenseSetType extends AnyLicenseInfoType
{
    private List<Member> memberList = new ArrayList<Member>();
    private List<DisjunctiveLicenseSetAugmentationPoint> disjunctiveLicenseSetAugmentationPointList = new ArrayList<DisjunctiveLicenseSetAugmentationPoint>();

    /** 
     * Get the list of 'Member' element items.
     * 
     * @return list
     */
    public List<Member> getMemberList() {
        return memberList;
    }

    /** 
     * Set the list of 'Member' element items.
     * 
     * @param list
     */
    public void setMemberList(List<Member> list) {
        memberList = list;
    }

    /** 
     * Get the list of 'DisjunctiveLicenseSetAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<DisjunctiveLicenseSetAugmentationPoint> getDisjunctiveLicenseSetAugmentationPointList() {
        return disjunctiveLicenseSetAugmentationPointList;
    }

    /** 
     * Set the list of 'DisjunctiveLicenseSetAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setDisjunctiveLicenseSetAugmentationPointList(
            List<DisjunctiveLicenseSetAugmentationPoint> list) {
        disjunctiveLicenseSetAugmentationPointList = list;
    }
}
