
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for details of a virus engine
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EngineDetailsType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:EngineVersionText"/>
 *         &lt;xs:element ref="ns:DatabaseVersionText"/>
 *         &lt;xs:element ref="ns:EngineDetailsAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EngineDetailsType extends ObjectType
{
    private EngineVersionText engineVersionText;
    private DatabaseVersionText databaseVersionText;
    private List<EngineDetailsAugmentationPoint> engineDetailsAugmentationPointList = new ArrayList<EngineDetailsAugmentationPoint>();

    /** 
     * Get the 'EngineVersionText' element value. A data item for a virus engine version
     * 
     * @return value
     */
    public EngineVersionText getEngineVersionText() {
        return engineVersionText;
    }

    /** 
     * Set the 'EngineVersionText' element value. A data item for a virus engine version
     * 
     * @param engineVersionText
     */
    public void setEngineVersionText(EngineVersionText engineVersionText) {
        this.engineVersionText = engineVersionText;
    }

    /** 
     * Get the 'DatabaseVersionText' element value. A data item for a virus database version
     * 
     * @return value
     */
    public DatabaseVersionText getDatabaseVersionText() {
        return databaseVersionText;
    }

    /** 
     * Set the 'DatabaseVersionText' element value. A data item for a virus database version
     * 
     * @param databaseVersionText
     */
    public void setDatabaseVersionText(DatabaseVersionText databaseVersionText) {
        this.databaseVersionText = databaseVersionText;
    }

    /** 
     * Get the list of 'EngineDetailsAugmentationPoint' element items. An augmentation point for EngineDetailsType
     * 
     * @return list
     */
    public List<EngineDetailsAugmentationPoint> getEngineDetailsAugmentationPointList() {
        return engineDetailsAugmentationPointList;
    }

    /** 
     * Set the list of 'EngineDetailsAugmentationPoint' element items. An augmentation point for EngineDetailsType
     * 
     * @param list
     */
    public void setEngineDetailsAugmentationPointList(
            List<EngineDetailsAugmentationPoint> list) {
        engineDetailsAugmentationPointList = list;
    }
}
