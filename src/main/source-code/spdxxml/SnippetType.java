
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Snippet type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SnippetType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:SpdxItemType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:SnippetFromFile" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:Range" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SnippetAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SnippetType extends SpdxItemType
{
    private SnippetFromFile snippetFromFile;
    private Range range;
    private List<SnippetAugmentationPoint> snippetAugmentationPointList = new ArrayList<SnippetAugmentationPoint>();

    /** 
     * Get the 'SnippetFromFile' element value.
     * 
     * @return value
     */
    public SnippetFromFile getSnippetFromFile() {
        return snippetFromFile;
    }

    /** 
     * Set the 'SnippetFromFile' element value.
     * 
     * @param snippetFromFile
     */
    public void setSnippetFromFile(SnippetFromFile snippetFromFile) {
        this.snippetFromFile = snippetFromFile;
    }

    /** 
     * Get the 'Range' element value.
     * 
     * @return value
     */
    public Range getRange() {
        return range;
    }

    /** 
     * Set the 'Range' element value.
     * 
     * @param range
     */
    public void setRange(Range range) {
        this.range = range;
    }

    /** 
     * Get the list of 'SnippetAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<SnippetAugmentationPoint> getSnippetAugmentationPointList() {
        return snippetAugmentationPointList;
    }

    /** 
     * Set the list of 'SnippetAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setSnippetAugmentationPointList(
            List<SnippetAugmentationPoint> list) {
        snippetAugmentationPointList = list;
    }
}
