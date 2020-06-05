
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for information collected from virus scans
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VirusInformationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:KnownVirusQuantity"/>
 *         &lt;xs:element ref="ns:EngineVersionText"/>
 *         &lt;xs:element ref="ns:VirusEngineText"/>
 *         &lt;xs:element ref="ns:ScannedDirectoryQuantity"/>
 *         &lt;xs:element ref="ns:ScannedFileQuantity"/>
 *         &lt;xs:element ref="ns:InfectedFileQuantity"/>
 *         &lt;xs:element ref="ns:DataScannedText"/>
 *         &lt;xs:element ref="ns:DataReadText"/>
 *         &lt;xs:element ref="ns:TimeText"/>
 *         &lt;xs:element ref="ns:FileNotesText"/>
 *         &lt;xs:element ref="ns:EngineDetails"/>
 *         &lt;xs:element ref="ns:VirusInformationAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VirusInformationType extends ObjectType
{
    private KnownVirusQuantity knownVirusQuantity;
    private EngineVersionText engineVersionText;
    private VirusEngineText virusEngineText;
    private ScannedDirectoryQuantity scannedDirectoryQuantity;
    private ScannedFileQuantity scannedFileQuantity;
    private InfectedFileQuantity infectedFileQuantity;
    private DataScannedText dataScannedText;
    private DataReadText dataReadText;
    private TimeText timeText;
    private FileNotesText fileNotesText;
    private EngineDetailsType engineDetails;
    private List<VirusInformationAugmentationPoint> virusInformationAugmentationPointList = new ArrayList<VirusInformationAugmentationPoint>();

    /** 
     * Get the 'KnownVirusQuantity' element value. A data item for the number of known viruses
     * 
     * @return value
     */
    public KnownVirusQuantity getKnownVirusQuantity() {
        return knownVirusQuantity;
    }

    /** 
     * Set the 'KnownVirusQuantity' element value. A data item for the number of known viruses
     * 
     * @param knownVirusQuantity
     */
    public void setKnownVirusQuantity(KnownVirusQuantity knownVirusQuantity) {
        this.knownVirusQuantity = knownVirusQuantity;
    }

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
     * Get the 'VirusEngineText' element value. A data item for an entry associated with software repository commit event
     * 
     * @return value
     */
    public VirusEngineText getVirusEngineText() {
        return virusEngineText;
    }

    /** 
     * Set the 'VirusEngineText' element value. A data item for an entry associated with software repository commit event
     * 
     * @param virusEngineText
     */
    public void setVirusEngineText(VirusEngineText virusEngineText) {
        this.virusEngineText = virusEngineText;
    }

    /** 
     * Get the 'ScannedDirectoryQuantity' element value. A data item for the number of directories scanned
     * 
     * @return value
     */
    public ScannedDirectoryQuantity getScannedDirectoryQuantity() {
        return scannedDirectoryQuantity;
    }

    /** 
     * Set the 'ScannedDirectoryQuantity' element value. A data item for the number of directories scanned
     * 
     * @param scannedDirectoryQuantity
     */
    public void setScannedDirectoryQuantity(
            ScannedDirectoryQuantity scannedDirectoryQuantity) {
        this.scannedDirectoryQuantity = scannedDirectoryQuantity;
    }

    /** 
     * Get the 'ScannedFileQuantity' element value. A data item for the number of files scanned
     * 
     * @return value
     */
    public ScannedFileQuantity getScannedFileQuantity() {
        return scannedFileQuantity;
    }

    /** 
     * Set the 'ScannedFileQuantity' element value. A data item for the number of files scanned
     * 
     * @param scannedFileQuantity
     */
    public void setScannedFileQuantity(ScannedFileQuantity scannedFileQuantity) {
        this.scannedFileQuantity = scannedFileQuantity;
    }

    /** 
     * Get the 'InfectedFileQuantity' element value. A data item for the number of files infected by a virus
     * 
     * @return value
     */
    public InfectedFileQuantity getInfectedFileQuantity() {
        return infectedFileQuantity;
    }

    /** 
     * Set the 'InfectedFileQuantity' element value. A data item for the number of files infected by a virus
     * 
     * @param infectedFileQuantity
     */
    public void setInfectedFileQuantity(
            InfectedFileQuantity infectedFileQuantity) {
        this.infectedFileQuantity = infectedFileQuantity;
    }

    /** 
     * Get the 'DataScannedText' element value. A data item for an entry associated with software repository commit event
     * 
     * @return value
     */
    public DataScannedText getDataScannedText() {
        return dataScannedText;
    }

    /** 
     * Set the 'DataScannedText' element value. A data item for an entry associated with software repository commit event
     * 
     * @param dataScannedText
     */
    public void setDataScannedText(DataScannedText dataScannedText) {
        this.dataScannedText = dataScannedText;
    }

    /** 
     * Get the 'DataReadText' element value. A data item for an entry associated with software repository commit event
     * 
     * @return value
     */
    public DataReadText getDataReadText() {
        return dataReadText;
    }

    /** 
     * Set the 'DataReadText' element value. A data item for an entry associated with software repository commit event
     * 
     * @param dataReadText
     */
    public void setDataReadText(DataReadText dataReadText) {
        this.dataReadText = dataReadText;
    }

    /** 
     * Get the 'TimeText' element value. A data item for a text time entry
     * 
     * @return value
     */
    public TimeText getTimeText() {
        return timeText;
    }

    /** 
     * Set the 'TimeText' element value. A data item for a text time entry
     * 
     * @param timeText
     */
    public void setTimeText(TimeText timeText) {
        this.timeText = timeText;
    }

    /** 
     * Get the 'FileNotesText' element value. A data item a for a multi-line entry for file notes
     * 
     * @return value
     */
    public FileNotesText getFileNotesText() {
        return fileNotesText;
    }

    /** 
     * Set the 'FileNotesText' element value. A data item a for a multi-line entry for file notes
     * 
     * @param fileNotesText
     */
    public void setFileNotesText(FileNotesText fileNotesText) {
        this.fileNotesText = fileNotesText;
    }

    /** 
     * Get the 'EngineDetails' element value. A data item for for details of a virus engine
     * 
     * @return value
     */
    public EngineDetailsType getEngineDetails() {
        return engineDetails;
    }

    /** 
     * Set the 'EngineDetails' element value. A data item for for details of a virus engine
     * 
     * @param engineDetails
     */
    public void setEngineDetails(EngineDetailsType engineDetails) {
        this.engineDetails = engineDetails;
    }

    /** 
     * Get the list of 'VirusInformationAugmentationPoint' element items. An augmentation point for VirusInformationType
     * 
     * @return list
     */
    public List<VirusInformationAugmentationPoint> getVirusInformationAugmentationPointList() {
        return virusInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'VirusInformationAugmentationPoint' element items. An augmentation point for VirusInformationType
     * 
     * @param list
     */
    public void setVirusInformationAugmentationPointList(
            List<VirusInformationAugmentationPoint> list) {
        virusInformationAugmentationPointList = list;
    }
}
