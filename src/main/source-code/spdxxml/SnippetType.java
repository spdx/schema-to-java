
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Snippet type
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
