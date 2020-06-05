
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for automated software supply chain Product and version information metadata
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SoftwareEvidenceArchiveType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:SoftwareInformation"/>
 *         &lt;xs:element ref="ns:FileInformation"/>
 *         &lt;xs:element ref="ns:AuthoritativeSourceInformation"/>
 *         &lt;xs:element ref="ns:EcosystemInformation"/>
 *         &lt;xs:element ref="ns:DependencyInformation"/>
 *         &lt;xs:element ref="ns:LicenseInformation"/>
 *         &lt;xs:element ref="ns:VulnerabilityInformation"/>
 *         &lt;xs:element ref="ns:GovernanceRiskCompliance"/>
 *         &lt;xs:element ref="ns:DeliveryInformation"/>
 *         &lt;xs:element ref="ns:SoftwareEvidenceArchiveAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SoftwareEvidenceArchiveType extends ObjectType
{
    private SoftwareInformationType softwareInformation;
    private FileInformationType fileInformation;
    private AuthoritativeSourceInformationType authoritativeSourceInformation;
    private EcosystemInformationType ecosystemInformation;
    private DependencyInformationType dependencyInformation;
    private LicenseInformationType licenseInformation;
    private VulnerabilityInformationType vulnerabilityInformation;
    private GovernanceRiskComplianceType governanceRiskCompliance;
    private DeliveryInformationType deliveryInformation;
    private List<SoftwareEvidenceArchiveAugmentationPoint> softwareEvidenceArchiveAugmentationPointList = new ArrayList<SoftwareEvidenceArchiveAugmentationPoint>();

    /** 
     * Get the 'SoftwareInformation' element value. A data item for software product naming or version related information
     * 
     * @return value
     */
    public SoftwareInformationType getSoftwareInformation() {
        return softwareInformation;
    }

    /** 
     * Set the 'SoftwareInformation' element value. A data item for software product naming or version related information
     * 
     * @param softwareInformation
     */
    public void setSoftwareInformation(
            SoftwareInformationType softwareInformation) {
        this.softwareInformation = softwareInformation;
    }

    /** 
     * Get the 'FileInformation' element value. A data item for file types and related Multipurpose Internet Mail Extensions (MIME) types
     * 
     * @return value
     */
    public FileInformationType getFileInformation() {
        return fileInformation;
    }

    /** 
     * Set the 'FileInformation' element value. A data item for file types and related Multipurpose Internet Mail Extensions (MIME) types
     * 
     * @param fileInformation
     */
    public void setFileInformation(FileInformationType fileInformation) {
        this.fileInformation = fileInformation;
    }

    /** 
     * Get the 'AuthoritativeSourceInformation' element value. A data item for information about what is to be considered the authoritative source for a given artifact or source repository. This includes an URL, a hash of
                          the source, and whether or not the source has been signed
     * 
     * @return value
     */
    public AuthoritativeSourceInformationType getAuthoritativeSourceInformation() {
        return authoritativeSourceInformation;
    }

    /** 
     * Set the 'AuthoritativeSourceInformation' element value. A data item for information about what is to be considered the authoritative source for a given artifact or source repository. This includes an URL, a hash of
                          the source, and whether or not the source has been signed
     * 
     * @param authoritativeSourceInformation
     */
    public void setAuthoritativeSourceInformation(
            AuthoritativeSourceInformationType authoritativeSourceInformation) {
        this.authoritativeSourceInformation = authoritativeSourceInformation;
    }

    /** 
     * Get the 'EcosystemInformation' element value. A data item for information pertaining to a software project's ecosystem which includes programming languages, references, number of committers, mailing list
                          activity, overall sentiment, and other information
     * 
     * @return value
     */
    public EcosystemInformationType getEcosystemInformation() {
        return ecosystemInformation;
    }

    /** 
     * Set the 'EcosystemInformation' element value. A data item for information pertaining to a software project's ecosystem which includes programming languages, references, number of committers, mailing list
                          activity, overall sentiment, and other information
     * 
     * @param ecosystemInformation
     */
    public void setEcosystemInformation(
            EcosystemInformationType ecosystemInformation) {
        this.ecosystemInformation = ecosystemInformation;
    }

    /** 
     * Get the 'DependencyInformation' element value. A data item for a list of dependencies for a given software project derived directly from the artifact or source dependency definition file. Entries include
                          names, versions, and vulnerabilities
     * 
     * @return value
     */
    public DependencyInformationType getDependencyInformation() {
        return dependencyInformation;
    }

    /** 
     * Set the 'DependencyInformation' element value. A data item for a list of dependencies for a given software project derived directly from the artifact or source dependency definition file. Entries include
                          names, versions, and vulnerabilities
     * 
     * @param dependencyInformation
     */
    public void setDependencyInformation(
            DependencyInformationType dependencyInformation) {
        this.dependencyInformation = dependencyInformation;
    }

    /** 
     * Get the 'LicenseInformation' element value. A data item for software license information for a software artifact or source repository
     * 
     * @return value
     */
    public LicenseInformationType getLicenseInformation() {
        return licenseInformation;
    }

    /** 
     * Set the 'LicenseInformation' element value. A data item for software license information for a software artifact or source repository
     * 
     * @param licenseInformation
     */
    public void setLicenseInformation(LicenseInformationType licenseInformation) {
        this.licenseInformation = licenseInformation;
    }

    /** 
     * Get the 'VulnerabilityInformation' element value. A data item for vulnerability or virus information for a software artifact or source repository
     * 
     * @return value
     */
    public VulnerabilityInformationType getVulnerabilityInformation() {
        return vulnerabilityInformation;
    }

    /** 
     * Set the 'VulnerabilityInformation' element value. A data item for vulnerability or virus information for a software artifact or source repository
     * 
     * @param vulnerabilityInformation
     */
    public void setVulnerabilityInformation(
            VulnerabilityInformationType vulnerabilityInformation) {
        this.vulnerabilityInformation = vulnerabilityInformation;
    }

    /** 
     * Get the 'GovernanceRiskCompliance' element value. A data item for calculated risk and compliance to governance for a software artifact or source repository
     * 
     * @return value
     */
    public GovernanceRiskComplianceType getGovernanceRiskCompliance() {
        return governanceRiskCompliance;
    }

    /** 
     * Set the 'GovernanceRiskCompliance' element value. A data item for calculated risk and compliance to governance for a software artifact or source repository
     * 
     * @param governanceRiskCompliance
     */
    public void setGovernanceRiskCompliance(
            GovernanceRiskComplianceType governanceRiskCompliance) {
        this.governanceRiskCompliance = governanceRiskCompliance;
    }

    /** 
     * Get the 'DeliveryInformation' element value. A data item for delivery information including the target url and last delivered date and time for a previously signed Software Evidence
                          Archive.
     * 
     * @return value
     */
    public DeliveryInformationType getDeliveryInformation() {
        return deliveryInformation;
    }

    /** 
     * Set the 'DeliveryInformation' element value. A data item for delivery information including the target url and last delivered date and time for a previously signed Software Evidence
                          Archive.
     * 
     * @param deliveryInformation
     */
    public void setDeliveryInformation(
            DeliveryInformationType deliveryInformation) {
        this.deliveryInformation = deliveryInformation;
    }

    /** 
     * Get the list of 'SoftwareEvidenceArchiveAugmentationPoint' element items. An augmentation point for SoftwareEvidenceArchiveType
     * 
     * @return list
     */
    public List<SoftwareEvidenceArchiveAugmentationPoint> getSoftwareEvidenceArchiveAugmentationPointList() {
        return softwareEvidenceArchiveAugmentationPointList;
    }

    /** 
     * Set the list of 'SoftwareEvidenceArchiveAugmentationPoint' element items. An augmentation point for SoftwareEvidenceArchiveType
     * 
     * @param list
     */
    public void setSoftwareEvidenceArchiveAugmentationPointList(
            List<SoftwareEvidenceArchiveAugmentationPoint> list) {
        softwareEvidenceArchiveAugmentationPointList = list;
    }
}
