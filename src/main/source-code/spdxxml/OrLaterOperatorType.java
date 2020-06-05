
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for OrLaterOperator type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OrLaterOperatorType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AnyLicenseInfoType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:Member" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:OrLaterOperatorAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OrLaterOperatorType extends AnyLicenseInfoType
{
    private Member member;
    private List<OrLaterOperatorAugmentationPoint> orLaterOperatorAugmentationPointList = new ArrayList<OrLaterOperatorAugmentationPoint>();

    /** 
     * Get the 'Member' element value.
     * 
     * @return value
     */
    public Member getMember() {
        return member;
    }

    /** 
     * Set the 'Member' element value.
     * 
     * @param member
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /** 
     * Get the list of 'OrLaterOperatorAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<OrLaterOperatorAugmentationPoint> getOrLaterOperatorAugmentationPointList() {
        return orLaterOperatorAugmentationPointList;
    }

    /** 
     * Set the list of 'OrLaterOperatorAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setOrLaterOperatorAugmentationPointList(
            List<OrLaterOperatorAugmentationPoint> list) {
        orLaterOperatorAugmentationPointList = list;
    }
}
