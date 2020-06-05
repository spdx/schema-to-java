
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for delivery information including the target url and last delivered date and time for a previously signed Software Evidence Archive.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DeliveryInformationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:DeliveringOrganizationText"/>
 *         &lt;xs:element ref="ns:DestinationText"/>
 *         &lt;xs:element ref="ns:HashText"/>
 *         &lt;xs:element ref="ns:LastRegistryUpdateDate"/>
 *         &lt;xs:element ref="ns:DeliveryInformationAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DeliveryInformationType extends ObjectType
{
    private DeliveringOrganizationText deliveringOrganizationText;
    private DestinationText destinationText;
    private HashText hashText;
    private LastRegistryUpdateDate lastRegistryUpdateDate;
    private List<DeliveryInformationAugmentationPoint> deliveryInformationAugmentationPointList = new ArrayList<DeliveryInformationAugmentationPoint>();

    /** 
     * Get the 'DeliveringOrganizationText' element value. A data item for Organization Delivering the security
     * 
     * @return value
     */
    public DeliveringOrganizationText getDeliveringOrganizationText() {
        return deliveringOrganizationText;
    }

    /** 
     * Set the 'DeliveringOrganizationText' element value. A data item for Organization Delivering the security
     * 
     * @param deliveringOrganizationText
     */
    public void setDeliveringOrganizationText(
            DeliveringOrganizationText deliveringOrganizationText) {
        this.deliveringOrganizationText = deliveringOrganizationText;
    }

    /** 
     * Get the 'DestinationText' element value. A data item for a destination
     * 
     * @return value
     */
    public DestinationText getDestinationText() {
        return destinationText;
    }

    /** 
     * Set the 'DestinationText' element value. A data item for a destination
     * 
     * @param destinationText
     */
    public void setDestinationText(DestinationText destinationText) {
        this.destinationText = destinationText;
    }

    /** 
     * Get the 'HashText' element value. A data item for a hash of the artifact delivered
     * 
     * @return value
     */
    public HashText getHashText() {
        return hashText;
    }

    /** 
     * Set the 'HashText' element value. A data item for a hash of the artifact delivered
     * 
     * @param hashText
     */
    public void setHashText(HashText hashText) {
        this.hashText = hashText;
    }

    /** 
     * Get the 'LastRegistryUpdateDate' element value. A data type for date and time of last registry update
     * 
     * @return value
     */
    public LastRegistryUpdateDate getLastRegistryUpdateDate() {
        return lastRegistryUpdateDate;
    }

    /** 
     * Set the 'LastRegistryUpdateDate' element value. A data type for date and time of last registry update
     * 
     * @param lastRegistryUpdateDate
     */
    public void setLastRegistryUpdateDate(
            LastRegistryUpdateDate lastRegistryUpdateDate) {
        this.lastRegistryUpdateDate = lastRegistryUpdateDate;
    }

    /** 
     * Get the list of 'DeliveryInformationAugmentationPoint' element items. An augmentation point for DeliveryInformationType
     * 
     * @return list
     */
    public List<DeliveryInformationAugmentationPoint> getDeliveryInformationAugmentationPointList() {
        return deliveryInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'DeliveryInformationAugmentationPoint' element items. An augmentation point for DeliveryInformationType
     * 
     * @param list
     */
    public void setDeliveryInformationAugmentationPointList(
            List<DeliveryInformationAugmentationPoint> list) {
        deliveryInformationAugmentationPointList = list;
    }
}
