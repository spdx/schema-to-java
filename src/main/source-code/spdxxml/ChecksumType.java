
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Checksum type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ChecksumType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ChecksumValue" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:AlgorithmCode"/>
 *         &lt;xs:element ref="ns:ChecksumAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ChecksumType extends ObjectType
{
    private ChecksumValueType checksumValue;
    private AlgorithmCodeType algorithmCode;
    private List<ChecksumAugmentationPoint> checksumAugmentationPointList = new ArrayList<ChecksumAugmentationPoint>();

    /** 
     * Get the 'ChecksumValue' element value.
     * 
     * @return value
     */
    public ChecksumValueType getChecksumValue() {
        return checksumValue;
    }

    /** 
     * Set the 'ChecksumValue' element value.
     * 
     * @param checksumValue
     */
    public void setChecksumValue(ChecksumValueType checksumValue) {
        this.checksumValue = checksumValue;
    }

    /** 
     * Get the 'AlgorithmCode' element value.
     * 
     * @return value
     */
    public AlgorithmCodeType getAlgorithmCode() {
        return algorithmCode;
    }

    /** 
     * Set the 'AlgorithmCode' element value.
     * 
     * @param algorithmCode
     */
    public void setAlgorithmCode(AlgorithmCodeType algorithmCode) {
        this.algorithmCode = algorithmCode;
    }

    /** 
     * Get the list of 'ChecksumAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ChecksumAugmentationPoint> getChecksumAugmentationPointList() {
        return checksumAugmentationPointList;
    }

    /** 
     * Set the list of 'ChecksumAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setChecksumAugmentationPointList(
            List<ChecksumAugmentationPoint> list) {
        checksumAugmentationPointList = list;
    }
}
