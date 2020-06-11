
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Checksum type
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
