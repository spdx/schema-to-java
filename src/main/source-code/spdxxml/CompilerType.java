
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software compiler information
 */
public class CompilerType extends ObjectType
{
    private NameText nameText;
    private CompilerVersionText compilerVersionText;
    private List<CompilerAugmentationPoint> compilerAugmentationPointList = new ArrayList<CompilerAugmentationPoint>();

    /** 
     * Get the 'NameText' element value. A data item for a name
     * 
     * @return value
     */
    public NameText getNameText() {
        return nameText;
    }

    /** 
     * Set the 'NameText' element value. A data item for a name
     * 
     * @param nameText
     */
    public void setNameText(NameText nameText) {
        this.nameText = nameText;
    }

    /** 
     * Get the 'CompilerVersionText' element value. A data item for a compiler version
     * 
     * @return value
     */
    public CompilerVersionText getCompilerVersionText() {
        return compilerVersionText;
    }

    /** 
     * Set the 'CompilerVersionText' element value. A data item for a compiler version
     * 
     * @param compilerVersionText
     */
    public void setCompilerVersionText(CompilerVersionText compilerVersionText) {
        this.compilerVersionText = compilerVersionText;
    }

    /** 
     * Get the list of 'CompilerAugmentationPoint' element items. An augmentation point for CompilerType
     * 
     * @return list
     */
    public List<CompilerAugmentationPoint> getCompilerAugmentationPointList() {
        return compilerAugmentationPointList;
    }

    /** 
     * Set the list of 'CompilerAugmentationPoint' element items. An augmentation point for CompilerType
     * 
     * @param list
     */
    public void setCompilerAugmentationPointList(
            List<CompilerAugmentationPoint> list) {
        compilerAugmentationPointList = list;
    }
}
