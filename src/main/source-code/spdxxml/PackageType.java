
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Package type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PackageType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:SpdxItemType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ExternalRef" minOccurs="0"/>
 *         &lt;xs:element ref="ns:PackageFileName" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:FilesAnalyzedIndicator" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:DescriptionText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:HomepageURI" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:OriginatorText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:DownloadLocationURI" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SourceInfoText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SupplierText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:PackageVerificationCode" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:LicenseDeclaredCode"/>
 *         &lt;xs:element ref="ns:VersionInfoText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SummaryText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:Checksum" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:PackageAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PackageType extends SpdxItemType
{
    private ExternalRefType externalRef;
    private PackageFileNameType packageFileName;
    private FilesAnalyzedIndicatorType filesAnalyzedIndicator;
    private DescriptionTextType descriptionText;
    private HomepageURIType homepageURI;
    private OriginatorTextType originatorText;
    private DownloadLocationURIType downloadLocationURI;
    private SourceInfoTextType sourceInfoText;
    private SupplierTextType supplierText;
    private PackageVerificationCodeType packageVerificationCode;
    private LicenseDeclaredCodeType licenseDeclaredCode;
    private VersionInfoTextType versionInfoText;
    private SummaryTextType summaryText;
    private ChecksumType checksum;
    private List<PackageAugmentationPoint> packageAugmentationPointList = new ArrayList<PackageAugmentationPoint>();

    /** 
     * Get the 'ExternalRef' element value.
     * 
     * @return value
     */
    public ExternalRefType getExternalRef() {
        return externalRef;
    }

    /** 
     * Set the 'ExternalRef' element value.
     * 
     * @param externalRef
     */
    public void setExternalRef(ExternalRefType externalRef) {
        this.externalRef = externalRef;
    }

    /** 
     * Get the 'PackageFileName' element value.
     * 
     * @return value
     */
    public PackageFileNameType getPackageFileName() {
        return packageFileName;
    }

    /** 
     * Set the 'PackageFileName' element value.
     * 
     * @param packageFileName
     */
    public void setPackageFileName(PackageFileNameType packageFileName) {
        this.packageFileName = packageFileName;
    }

    /** 
     * Get the 'FilesAnalyzedIndicator' element value.
     * 
     * @return value
     */
    public FilesAnalyzedIndicatorType getFilesAnalyzedIndicator() {
        return filesAnalyzedIndicator;
    }

    /** 
     * Set the 'FilesAnalyzedIndicator' element value.
     * 
     * @param filesAnalyzedIndicator
     */
    public void setFilesAnalyzedIndicator(
            FilesAnalyzedIndicatorType filesAnalyzedIndicator) {
        this.filesAnalyzedIndicator = filesAnalyzedIndicator;
    }

    /** 
     * Get the 'DescriptionText' element value.
     * 
     * @return value
     */
    public DescriptionTextType getDescriptionText() {
        return descriptionText;
    }

    /** 
     * Set the 'DescriptionText' element value.
     * 
     * @param descriptionText
     */
    public void setDescriptionText(DescriptionTextType descriptionText) {
        this.descriptionText = descriptionText;
    }

    /** 
     * Get the 'HomepageURI' element value.
     * 
     * @return value
     */
    public HomepageURIType getHomepageURI() {
        return homepageURI;
    }

    /** 
     * Set the 'HomepageURI' element value.
     * 
     * @param homepageURI
     */
    public void setHomepageURI(HomepageURIType homepageURI) {
        this.homepageURI = homepageURI;
    }

    /** 
     * Get the 'OriginatorText' element value.
     * 
     * @return value
     */
    public OriginatorTextType getOriginatorText() {
        return originatorText;
    }

    /** 
     * Set the 'OriginatorText' element value.
     * 
     * @param originatorText
     */
    public void setOriginatorText(OriginatorTextType originatorText) {
        this.originatorText = originatorText;
    }

    /** 
     * Get the 'DownloadLocationURI' element value.
     * 
     * @return value
     */
    public DownloadLocationURIType getDownloadLocationURI() {
        return downloadLocationURI;
    }

    /** 
     * Set the 'DownloadLocationURI' element value.
     * 
     * @param downloadLocationURI
     */
    public void setDownloadLocationURI(
            DownloadLocationURIType downloadLocationURI) {
        this.downloadLocationURI = downloadLocationURI;
    }

    /** 
     * Get the 'SourceInfoText' element value.
     * 
     * @return value
     */
    public SourceInfoTextType getSourceInfoText() {
        return sourceInfoText;
    }

    /** 
     * Set the 'SourceInfoText' element value.
     * 
     * @param sourceInfoText
     */
    public void setSourceInfoText(SourceInfoTextType sourceInfoText) {
        this.sourceInfoText = sourceInfoText;
    }

    /** 
     * Get the 'SupplierText' element value.
     * 
     * @return value
     */
    public SupplierTextType getSupplierText() {
        return supplierText;
    }

    /** 
     * Set the 'SupplierText' element value.
     * 
     * @param supplierText
     */
    public void setSupplierText(SupplierTextType supplierText) {
        this.supplierText = supplierText;
    }

    /** 
     * Get the 'PackageVerificationCode' element value.
     * 
     * @return value
     */
    public PackageVerificationCodeType getPackageVerificationCode() {
        return packageVerificationCode;
    }

    /** 
     * Set the 'PackageVerificationCode' element value.
     * 
     * @param packageVerificationCode
     */
    public void setPackageVerificationCode(
            PackageVerificationCodeType packageVerificationCode) {
        this.packageVerificationCode = packageVerificationCode;
    }

    /** 
     * Get the 'LicenseDeclaredCode' element value.
     * 
     * @return value
     */
    public LicenseDeclaredCodeType getLicenseDeclaredCode() {
        return licenseDeclaredCode;
    }

    /** 
     * Set the 'LicenseDeclaredCode' element value.
     * 
     * @param licenseDeclaredCode
     */
    public void setLicenseDeclaredCode(
            LicenseDeclaredCodeType licenseDeclaredCode) {
        this.licenseDeclaredCode = licenseDeclaredCode;
    }

    /** 
     * Get the 'VersionInfoText' element value.
     * 
     * @return value
     */
    public VersionInfoTextType getVersionInfoText() {
        return versionInfoText;
    }

    /** 
     * Set the 'VersionInfoText' element value.
     * 
     * @param versionInfoText
     */
    public void setVersionInfoText(VersionInfoTextType versionInfoText) {
        this.versionInfoText = versionInfoText;
    }

    /** 
     * Get the 'SummaryText' element value.
     * 
     * @return value
     */
    public SummaryTextType getSummaryText() {
        return summaryText;
    }

    /** 
     * Set the 'SummaryText' element value.
     * 
     * @param summaryText
     */
    public void setSummaryText(SummaryTextType summaryText) {
        this.summaryText = summaryText;
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
     * Get the list of 'PackageAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<PackageAugmentationPoint> getPackageAugmentationPointList() {
        return packageAugmentationPointList;
    }

    /** 
     * Set the list of 'PackageAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setPackageAugmentationPointList(
            List<PackageAugmentationPoint> list) {
        packageAugmentationPointList = list;
    }
}
