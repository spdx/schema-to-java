
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for file types and related Multipurpose Internet Mail Extensions (MIME) types
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FileInformationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ComputerFileNameText"/>
 *         &lt;xs:element ref="ns:FileExtensionText"/>
 *         &lt;xs:element ref="ns:FileInformationAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FileInformationType extends ObjectType
{
    private ComputerFileNameType computerFileNameText;
    private FileExtensionType fileExtensionText;
    private List<FileInformationAugmentationPoint> fileInformationAugmentationPointList = new ArrayList<FileInformationAugmentationPoint>();

    /** 
     * Get the 'ComputerFileNameText' element value. A data item for a computer file name without extension
     * 
     * @return value
     */
    public ComputerFileNameType getComputerFileNameText() {
        return computerFileNameText;
    }

    /** 
     * Set the 'ComputerFileNameText' element value. A data item for a computer file name without extension
     * 
     * @param computerFileNameText
     */
    public void setComputerFileNameText(
            ComputerFileNameType computerFileNameText) {
        this.computerFileNameText = computerFileNameText;
    }

    /** 
     * Get the 'FileExtensionText' element value. A data item for a computer file extension
     * 
     * @return value
     */
    public FileExtensionType getFileExtensionText() {
        return fileExtensionText;
    }

    /** 
     * Set the 'FileExtensionText' element value. A data item for a computer file extension
     * 
     * @param fileExtensionText
     */
    public void setFileExtensionText(FileExtensionType fileExtensionText) {
        this.fileExtensionText = fileExtensionText;
    }

    /** 
     * Get the list of 'FileInformationAugmentationPoint' element items. An augmentation point for FileInformationType
     * 
     * @return list
     */
    public List<FileInformationAugmentationPoint> getFileInformationAugmentationPointList() {
        return fileInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'FileInformationAugmentationPoint' element items. An augmentation point for FileInformationType
     * 
     * @param list
     */
    public void setFileInformationAugmentationPointList(
            List<FileInformationAugmentationPoint> list) {
        fileInformationAugmentationPointList = list;
    }
}
