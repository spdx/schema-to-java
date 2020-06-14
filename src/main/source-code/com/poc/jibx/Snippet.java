
package com.poc.jibx;

import java.util.ArrayList;
import java.util.List;

/** 
 * The set of bytes in a file. The name of the snippet is the name of the file appended with the byte range in parenthesis (ie: "./file/name(2145:5532)")
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Snippet">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:SpdxItem">
 *       &lt;xs:all>
 *         &lt;xs:element type="ns:CompoundPointer" name="range" maxOccurs="unbounded"/>
 *         &lt;xs:element type="ns:File" name="snippetFromFile"/>
 *         &lt;xs:element type="ns:SimpleLicensingInfo" name="licenseInfoInSnippet" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Snippet extends SpdxItem
{
    private List<CompoundPointer> rangeList = new ArrayList<CompoundPointer>();
    private File snippetFromFile;
    private List<SimpleLicensingInfo> licenseInfoInSnippetList = new ArrayList<SimpleLicensingInfo>();

    /** 
     * Get the list of 'range' element items. This field defines the byte range in the original host file (in X.2) that the snippet information applies to
     * 
     * @return list
     */
    public List<CompoundPointer> getRangeList() {
        return rangeList;
    }

    /** 
     * Set the list of 'range' element items. This field defines the byte range in the original host file (in X.2) that the snippet information applies to
     * 
     * @param list
     */
    public void setRangeList(List<CompoundPointer> list) {
        rangeList = list;
    }

    /** 
     * Get the 'snippetFromFile' element value. File containing the SPDX element (e.g. the file contaning a snippet).
     * 
     * @return value
     */
    public File getSnippetFromFile() {
        return snippetFromFile;
    }

    /** 
     * Set the 'snippetFromFile' element value. File containing the SPDX element (e.g. the file contaning a snippet).
     * 
     * @param snippetFromFile
     */
    public void setSnippetFromFile(File snippetFromFile) {
        this.snippetFromFile = snippetFromFile;
    }

    /** 
     * Get the list of 'licenseInfoInSnippet' element items. Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.
     * 
     * @return list
     */
    public List<SimpleLicensingInfo> getLicenseInfoInSnippetList() {
        return licenseInfoInSnippetList;
    }

    /** 
     * Set the list of 'licenseInfoInSnippet' element items. Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.
     * 
     * @param list
     */
    public void setLicenseInfoInSnippetList(List<SimpleLicensingInfo> list) {
        licenseInfoInSnippetList = list;
    }
}
