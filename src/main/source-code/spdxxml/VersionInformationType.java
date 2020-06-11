
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for version information
 */
public class VersionInformationType extends ObjectType
{
    private SoftwareVersionText softwareVersionText;
    private SemanticVersionIndicatorType semanticVersionIndicator;
    private SemanticVersionTextType semanticVersionText;
    private SemanticVersionInformationType semanticVersionInformation;
    private SemanticVersionDate semanticVersionDate;
    private PythonSemanticVersionIndicatorType pythonSemanticVersionIndicator;
    private PythonSemanticVersionType pythonSemanticVersion;
    private PythonVersionTextType pythonVersionText;
    private List<VersionInformationAugmentationPoint> versionInformationAugmentationPointList = new ArrayList<VersionInformationAugmentationPoint>();

    /** 
     * Get the 'SoftwareVersionText' element value. A data item for the raw Version of the software
     * 
     * @return value
     */
    public SoftwareVersionText getSoftwareVersionText() {
        return softwareVersionText;
    }

    /** 
     * Set the 'SoftwareVersionText' element value. A data item for the raw Version of the software
     * 
     * @param softwareVersionText
     */
    public void setSoftwareVersionText(SoftwareVersionText softwareVersionText) {
        this.softwareVersionText = softwareVersionText;
    }

    /** 
     * Get the 'SemanticVersionIndicator' element value. True if semantic version; false if not or not known.
     * 
     * @return value
     */
    public SemanticVersionIndicatorType getSemanticVersionIndicator() {
        return semanticVersionIndicator;
    }

    /** 
     * Set the 'SemanticVersionIndicator' element value. True if semantic version; false if not or not known.
     * 
     * @param semanticVersionIndicator
     */
    public void setSemanticVersionIndicator(
            SemanticVersionIndicatorType semanticVersionIndicator) {
        this.semanticVersionIndicator = semanticVersionIndicator;
    }

    /** 
     * Get the 'SemanticVersionText' element value. A data type for semantic versioning information. A normal version number MUST take the form X.Y.Z where X, Y, and Z are non-negative integers, and MUST NOT
                          contain leading zeroes. X is the major version, Y is the minor version, and Z is the patch version. Each element MUST increase numerically. For instance: 1.9.0 -&gt; 1.10.0
                          -&gt; 1.11.0.(https://semver.org/spec/v2.0.0.html)
     * 
     * @return value
     */
    public SemanticVersionTextType getSemanticVersionText() {
        return semanticVersionText;
    }

    /** 
     * Set the 'SemanticVersionText' element value. A data type for semantic versioning information. A normal version number MUST take the form X.Y.Z where X, Y, and Z are non-negative integers, and MUST NOT
                          contain leading zeroes. X is the major version, Y is the minor version, and Z is the patch version. Each element MUST increase numerically. For instance: 1.9.0 -&gt; 1.10.0
                          -&gt; 1.11.0.(https://semver.org/spec/v2.0.0.html)
     * 
     * @param semanticVersionText
     */
    public void setSemanticVersionText(
            SemanticVersionTextType semanticVersionText) {
        this.semanticVersionText = semanticVersionText;
    }

    /** 
     * Get the 'SemanticVersionInformation' element value. A data type for semantic versioning information. A normal version number MUST take the form X.Y.Z where X, Y, and Z are non-negative integers, and MUST NOT
                          contain leading zeroes. X is the major version, Y is the minor version, and Z is the patch version. Each element MUST increase numerically. For instance: 1.9.0 -&gt; 1.10.0
                          -&gt; 1.11.0.(https://semver.org/spec/v2.0.0.html)
     * 
     * @return value
     */
    public SemanticVersionInformationType getSemanticVersionInformation() {
        return semanticVersionInformation;
    }

    /** 
     * Set the 'SemanticVersionInformation' element value. A data type for semantic versioning information. A normal version number MUST take the form X.Y.Z where X, Y, and Z are non-negative integers, and MUST NOT
                          contain leading zeroes. X is the major version, Y is the minor version, and Z is the patch version. Each element MUST increase numerically. For instance: 1.9.0 -&gt; 1.10.0
                          -&gt; 1.11.0.(https://semver.org/spec/v2.0.0.html)
     * 
     * @param semanticVersionInformation
     */
    public void setSemanticVersionInformation(
            SemanticVersionInformationType semanticVersionInformation) {
        this.semanticVersionInformation = semanticVersionInformation;
    }

    /** 
     * Get the 'SemanticVersionDate' element value. A data type for date and time information
     * 
     * @return value
     */
    public SemanticVersionDate getSemanticVersionDate() {
        return semanticVersionDate;
    }

    /** 
     * Set the 'SemanticVersionDate' element value. A data type for date and time information
     * 
     * @param semanticVersionDate
     */
    public void setSemanticVersionDate(SemanticVersionDate semanticVersionDate) {
        this.semanticVersionDate = semanticVersionDate;
    }

    /** 
     * Get the 'PythonSemanticVersionIndicator' element value. True if python semantic version; false if not or not known.
     * 
     * @return value
     */
    public PythonSemanticVersionIndicatorType getPythonSemanticVersionIndicator() {
        return pythonSemanticVersionIndicator;
    }

    /** 
     * Set the 'PythonSemanticVersionIndicator' element value. True if python semantic version; false if not or not known.
     * 
     * @param pythonSemanticVersionIndicator
     */
    public void setPythonSemanticVersionIndicator(
            PythonSemanticVersionIndicatorType pythonSemanticVersionIndicator) {
        this.pythonSemanticVersionIndicator = pythonSemanticVersionIndicator;
    }

    /** 
     * Get the 'PythonSemanticVersion' element value. A data item for a Python Distribution identified by a public version identifier which supports all defined version comparison operations. The version scheme is
                          used both to describe the distribution version provided by a particular distribution archive, as well as to place constraints on the version of dependencies needed in order to
                          build or run the software.The canonical public version identifiers MUST comply with the following scheme: [N!]N(.N)*[{a|b|rc}N][.postN][.devN]
                          (https://www.python.org/dev/peps/pep-0440/#public-version-identifiers)
     * 
     * @return value
     */
    public PythonSemanticVersionType getPythonSemanticVersion() {
        return pythonSemanticVersion;
    }

    /** 
     * Set the 'PythonSemanticVersion' element value. A data item for a Python Distribution identified by a public version identifier which supports all defined version comparison operations. The version scheme is
                          used both to describe the distribution version provided by a particular distribution archive, as well as to place constraints on the version of dependencies needed in order to
                          build or run the software.The canonical public version identifiers MUST comply with the following scheme: [N!]N(.N)*[{a|b|rc}N][.postN][.devN]
                          (https://www.python.org/dev/peps/pep-0440/#public-version-identifiers)
     * 
     * @param pythonSemanticVersion
     */
    public void setPythonSemanticVersion(
            PythonSemanticVersionType pythonSemanticVersion) {
        this.pythonSemanticVersion = pythonSemanticVersion;
    }

    /** 
     * Get the 'PythonVersionText' element value. A data item for a Python Distribution identified by a public version identifier which supports all defined version comparison operations. The version scheme is
                          used both to describe the distribution version provided by a particular distribution archive, as well as to place constraints on the version of dependencies needed in order to
                          build or run the software.The canonical public version identifiers MUST comply with the following scheme: [N!]N(.N)*[{a|b|rc}N][.postN][.devN]
                          (https://www.python.org/dev/peps/pep-0440/#public-version-identifiers)
     * 
     * @return value
     */
    public PythonVersionTextType getPythonVersionText() {
        return pythonVersionText;
    }

    /** 
     * Set the 'PythonVersionText' element value. A data item for a Python Distribution identified by a public version identifier which supports all defined version comparison operations. The version scheme is
                          used both to describe the distribution version provided by a particular distribution archive, as well as to place constraints on the version of dependencies needed in order to
                          build or run the software.The canonical public version identifiers MUST comply with the following scheme: [N!]N(.N)*[{a|b|rc}N][.postN][.devN]
                          (https://www.python.org/dev/peps/pep-0440/#public-version-identifiers)
     * 
     * @param pythonVersionText
     */
    public void setPythonVersionText(PythonVersionTextType pythonVersionText) {
        this.pythonVersionText = pythonVersionText;
    }

    /** 
     * Get the list of 'VersionInformationAugmentationPoint' element items. An augmentation point for VersionInformationType
     * 
     * @return list
     */
    public List<VersionInformationAugmentationPoint> getVersionInformationAugmentationPointList() {
        return versionInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'VersionInformationAugmentationPoint' element items. An augmentation point for VersionInformationType
     * 
     * @param list
     */
    public void setVersionInformationAugmentationPointList(
            List<VersionInformationAugmentationPoint> list) {
        versionInformationAugmentationPointList = list;
    }
}
