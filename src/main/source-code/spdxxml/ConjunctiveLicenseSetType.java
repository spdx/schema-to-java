
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ConjunctiveLicenseSet type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConjunctiveLicenseSetType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AnyLicenseInfoType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:Member" minOccurs="2" maxOccurs="unbounded"/>
 *         &lt;xs:element ref="ns:ConjunctiveLicenseSetAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConjunctiveLicenseSetType extends AnyLicenseInfoType
{
    private List<Member> memberList = new ArrayList<Member>();
    private List<ConjunctiveLicenseSetAugmentationPoint> conjunctiveLicenseSetAugmentationPointList = new ArrayList<ConjunctiveLicenseSetAugmentationPoint>();

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
     * Get the list of 'ConjunctiveLicenseSetAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ConjunctiveLicenseSetAugmentationPoint> getConjunctiveLicenseSetAugmentationPointList() {
        return conjunctiveLicenseSetAugmentationPointList;
    }

    /** 
     * Set the list of 'ConjunctiveLicenseSetAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setConjunctiveLicenseSetAugmentationPointList(
            List<ConjunctiveLicenseSetAugmentationPoint> list) {
        conjunctiveLicenseSetAugmentationPointList = list;
    }
}
