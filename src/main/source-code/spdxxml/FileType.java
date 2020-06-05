
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for File type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FileType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:SpdxItemType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:NoticeText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:FileContributorText" minOccurs="0"/>
 *         &lt;xs:element ref="ns:FileName" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:FileTypeCode"/>
 *         &lt;xs:element ref="ns:Checksum" minOccurs="1"/>
 *         &lt;xs:element ref="ns:FileAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FileType extends SpdxItemType
{
    private NoticeTextType noticeText;
    private FileContributorTextType fileContributorText;
    private FileNameType fileName;
    private FileTypeCodeType fileTypeCode;
    private ChecksumType checksum;
    private List<FileAugmentationPoint> fileAugmentationPointList = new ArrayList<FileAugmentationPoint>();

    /** 
     * Get the 'NoticeText' element value.
     * 
     * @return value
     */
    public NoticeTextType getNoticeText() {
        return noticeText;
    }

    /** 
     * Set the 'NoticeText' element value.
     * 
     * @param noticeText
     */
    public void setNoticeText(NoticeTextType noticeText) {
        this.noticeText = noticeText;
    }

    /** 
     * Get the 'FileContributorText' element value.
     * 
     * @return value
     */
    public FileContributorTextType getFileContributorText() {
        return fileContributorText;
    }

    /** 
     * Set the 'FileContributorText' element value.
     * 
     * @param fileContributorText
     */
    public void setFileContributorText(
            FileContributorTextType fileContributorText) {
        this.fileContributorText = fileContributorText;
    }

    /** 
     * Get the 'FileName' element value.
     * 
     * @return value
     */
    public FileNameType getFileName() {
        return fileName;
    }

    /** 
     * Set the 'FileName' element value.
     * 
     * @param fileName
     */
    public void setFileName(FileNameType fileName) {
        this.fileName = fileName;
    }

    /** 
     * Get the 'FileTypeCode' element value.
     * 
     * @return value
     */
    public FileTypeCodeType getFileTypeCode() {
        return fileTypeCode;
    }

    /** 
     * Set the 'FileTypeCode' element value.
     * 
     * @param fileTypeCode
     */
    public void setFileTypeCode(FileTypeCodeType fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    /** 
     * Get the 'Checksum' element value.
     * 
     * @return value
     */
    public ChecksumType getChecksum() {
        return checksum;
    }

    /** 
     * Set the 'Checksum' element value.
     * 
     * @param checksum
     */
    public void setChecksum(ChecksumType checksum) {
        this.checksum = checksum;
    }

    /** 
     * Get the list of 'FileAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<FileAugmentationPoint> getFileAugmentationPointList() {
        return fileAugmentationPointList;
    }

    /** 
     * Set the list of 'FileAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setFileAugmentationPointList(List<FileAugmentationPoint> list) {
        fileAugmentationPointList = list;
    }
}
