
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Python versioning. Python Distributions are identified by a public version identifier which supports all defined version comparison operations. The version
 scheme is used both to describe the distribution version provided by a particular distribution archive, as well as to place constraints on the version of dependencies needed in order to
 build or run the software.The canonical public version identifiers MUST comply with the following scheme: [N!]N(.N)*[{a|b|rc}N][.postN][.devN]
 (https://www.python.org/dev/peps/pep-0440/#public-version-identifiers)
 */
public class PythonSemanticVersionType extends ObjectType
{
    private PythonEpochVersionType pythonEpochSegmentText;
    private PythonReleaseVersionType pythonReleaseSegmentText;
    private PythonPreReleaseSegmentText pythonPreReleaseSegmentText;
    private PythonPostReleaseVersionType pythonPostReleaseSegmentText;
    private PythonDevelopmentReleaseSegmentText pythonDevelopmentReleaseSegmentText;
    private List<PythonSemanticVersionAugmentationPoint> pythonSemanticVersionAugmentationPointList = new ArrayList<PythonSemanticVersionAugmentationPoint>();

    /** 
     * Get the 'PythonEpochSegmentText' element value.
     * 
     * @return value
     */
    public PythonEpochVersionType getPythonEpochSegmentText() {
        return pythonEpochSegmentText;
    }

    /** 
     * Set the 'PythonEpochSegmentText' element value.
     * 
     * @param pythonEpochSegmentText
     */
    public void setPythonEpochSegmentText(
            PythonEpochVersionType pythonEpochSegmentText) {
        this.pythonEpochSegmentText = pythonEpochSegmentText;
    }

    /** 
     * Get the 'PythonReleaseSegmentText' element value.
     * 
     * @return value
     */
    public PythonReleaseVersionType getPythonReleaseSegmentText() {
        return pythonReleaseSegmentText;
    }

    /** 
     * Set the 'PythonReleaseSegmentText' element value.
     * 
     * @param pythonReleaseSegmentText
     */
    public void setPythonReleaseSegmentText(
            PythonReleaseVersionType pythonReleaseSegmentText) {
        this.pythonReleaseSegmentText = pythonReleaseSegmentText;
    }

    /** 
     * Get the 'PythonPreReleaseSegmentText' element value.
     * 
     * @return value
     */
    public PythonPreReleaseSegmentText getPythonPreReleaseSegmentText() {
        return pythonPreReleaseSegmentText;
    }

    /** 
     * Set the 'PythonPreReleaseSegmentText' element value.
     * 
     * @param pythonPreReleaseSegmentText
     */
    public void setPythonPreReleaseSegmentText(
            PythonPreReleaseSegmentText pythonPreReleaseSegmentText) {
        this.pythonPreReleaseSegmentText = pythonPreReleaseSegmentText;
    }

    /** 
     * Get the 'PythonPostReleaseSegmentText' element value.
     * 
     * @return value
     */
    public PythonPostReleaseVersionType getPythonPostReleaseSegmentText() {
        return pythonPostReleaseSegmentText;
    }

    /** 
     * Set the 'PythonPostReleaseSegmentText' element value.
     * 
     * @param pythonPostReleaseSegmentText
     */
    public void setPythonPostReleaseSegmentText(
            PythonPostReleaseVersionType pythonPostReleaseSegmentText) {
        this.pythonPostReleaseSegmentText = pythonPostReleaseSegmentText;
    }

    /** 
     * Get the 'PythonDevelopmentReleaseSegmentText' element value.
     * 
     * @return value
     */
    public PythonDevelopmentReleaseSegmentText getPythonDevelopmentReleaseSegmentText() {
        return pythonDevelopmentReleaseSegmentText;
    }

    /** 
     * Set the 'PythonDevelopmentReleaseSegmentText' element value.
     * 
     * @param pythonDevelopmentReleaseSegmentText
     */
    public void setPythonDevelopmentReleaseSegmentText(
            PythonDevelopmentReleaseSegmentText pythonDevelopmentReleaseSegmentText) {
        this.pythonDevelopmentReleaseSegmentText = pythonDevelopmentReleaseSegmentText;
    }

    /** 
     * Get the list of 'PythonSemanticVersionAugmentationPoint' element items. An augmentation point for PythonSemanticVersionType
     * 
     * @return list
     */
    public List<PythonSemanticVersionAugmentationPoint> getPythonSemanticVersionAugmentationPointList() {
        return pythonSemanticVersionAugmentationPointList;
    }

    /** 
     * Set the list of 'PythonSemanticVersionAugmentationPoint' element items. An augmentation point for PythonSemanticVersionType
     * 
     * @param list
     */
    public void setPythonSemanticVersionAugmentationPointList(
            List<PythonSemanticVersionAugmentationPoint> list) {
        pythonSemanticVersionAugmentationPointList = list;
    }
}
