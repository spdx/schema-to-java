
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for semantic versioning information. A normal version number MUST take the form X.Y.Z where X, Y, and Z are non-negative integers, and MUST NOT contain leading
 zeroes. X is the major version, Y is the minor version, and Z is the patch version. Each element MUST increase numerically. For instance: 1.9.0 -&gt; 1.10.0 -&gt; 1.11.0.
 (https://semver.org/spec/v2.0.0.html)
 */
public class SemanticVersionInformationType extends ObjectType
{
    private APINameType APIName;
    private MajorVersionType majorVersionNumeric;
    private MinorVersionType minorVersionNumeric;
    private PatchVersionType patchVersionText;
    private PreReleaseVersionType preReleaseVersionText;
    private BuildMetaType buildMetaText;
    private List<SemanticVersionInformationAugmentationPoint> semanticVersionInformationAugmentationPointList = new ArrayList<SemanticVersionInformationAugmentationPoint>();

    /** 
     * Get the 'APIName' element value. A data item for a public API declaration
     * 
     * @return value
     */
    public APINameType getAPIName() {
        return APIName;
    }

    /** 
     * Set the 'APIName' element value. A data item for a public API declaration
     * 
     * @param APIName
     */
    public void setAPIName(APINameType APIName) {
        this.APIName = APIName;
    }

    /** 
     * Get the 'MajorVersionNumeric' element value. A data item for the Major version. The value zero (0.y.z) is for initial development. Anything may change at any time. The public API should not be considered
                          stable. Version 1.0.0 defines the public API. The way in which the version number is incremented after this release is dependent on this public API and how it changes. Major
                          version X (X.y.z | X &gt; 0) MUST be incremented if any backwards incompatible changes are introduced to the public API. It MAY include minor and patch level changes. Patch and
                          minor version MUST be reset to 0 when major version is incremented.(https://semver.org/spec/v2.0.0.html)
     * 
     * @return value
     */
    public MajorVersionType getMajorVersionNumeric() {
        return majorVersionNumeric;
    }

    /** 
     * Set the 'MajorVersionNumeric' element value. A data item for the Major version. The value zero (0.y.z) is for initial development. Anything may change at any time. The public API should not be considered
                          stable. Version 1.0.0 defines the public API. The way in which the version number is incremented after this release is dependent on this public API and how it changes. Major
                          version X (X.y.z | X &gt; 0) MUST be incremented if any backwards incompatible changes are introduced to the public API. It MAY include minor and patch level changes. Patch and
                          minor version MUST be reset to 0 when major version is incremented.(https://semver.org/spec/v2.0.0.html)
     * 
     * @param majorVersionNumeric
     */
    public void setMajorVersionNumeric(MajorVersionType majorVersionNumeric) {
        this.majorVersionNumeric = majorVersionNumeric;
    }

    /** 
     * Get the 'MinorVersionNumeric' element value. A data item for the Minor version. Minor version Y (x.Y.z | x &gt; 0) MUST be incremented if new, backwards compatible functionality is introduced to the public
                          API. It MUST be incremented if any public API functionality is marked as deprecated. It MAY be incremented if substantial new functionality or improvements are introduced
                          within the private code. It MAY include patch level changes. Patch version MUST be reset to 0 when minor version is
                          incremented.(https://semver.org/spec/v2.0.0.html)
     * 
     * @return value
     */
    public MinorVersionType getMinorVersionNumeric() {
        return minorVersionNumeric;
    }

    /** 
     * Set the 'MinorVersionNumeric' element value. A data item for the Minor version. Minor version Y (x.Y.z | x &gt; 0) MUST be incremented if new, backwards compatible functionality is introduced to the public
                          API. It MUST be incremented if any public API functionality is marked as deprecated. It MAY be incremented if substantial new functionality or improvements are introduced
                          within the private code. It MAY include patch level changes. Patch version MUST be reset to 0 when minor version is
                          incremented.(https://semver.org/spec/v2.0.0.html)
     * 
     * @param minorVersionNumeric
     */
    public void setMinorVersionNumeric(MinorVersionType minorVersionNumeric) {
        this.minorVersionNumeric = minorVersionNumeric;
    }

    /** 
     * Get the 'PatchVersionText' element value. A data item for the Patch version. Patch version Z (x.y.Z | x &gt; 0) MUST be incremented if only backwards compatible bug fixes are introduced. A bug fix is
                          defined as an internal change that fixes incorrect behavior.(https://semver.org/spec/v2.0.0.html)
     * 
     * @return value
     */
    public PatchVersionType getPatchVersionText() {
        return patchVersionText;
    }

    /** 
     * Set the 'PatchVersionText' element value. A data item for the Patch version. Patch version Z (x.y.Z | x &gt; 0) MUST be incremented if only backwards compatible bug fixes are introduced. A bug fix is
                          defined as an internal change that fixes incorrect behavior.(https://semver.org/spec/v2.0.0.html)
     * 
     * @param patchVersionText
     */
    public void setPatchVersionText(PatchVersionType patchVersionText) {
        this.patchVersionText = patchVersionText;
    }

    /** 
     * Get the 'PreReleaseVersionText' element value. A pre-release version MAY be denoted by appending a hyphen and a series of dot separated identifiers immediately following the patch version. Identifiers MUST
                          comprise only ASCII alphanumerics and hyphen [0-9A-Za-z-]. Identifiers MUST NOT be empty. Numeric identifiers MUST NOT include leading zeroes. Pre-release versions have a lower
                          precedence than the associated normal version. A pre-release version indicates that the version is unstable and might not satisfy the intended compatibility requirements as
                          denoted by its associated normal version. Examples: 1.0.0-alpha, 1.0.0-alpha.1, 1.0.0-0.3.7, 1.0.0-x.7.z.92.(https://semver.org/spec/v2.0.0.html)
     * 
     * @return value
     */
    public PreReleaseVersionType getPreReleaseVersionText() {
        return preReleaseVersionText;
    }

    /** 
     * Set the 'PreReleaseVersionText' element value. A pre-release version MAY be denoted by appending a hyphen and a series of dot separated identifiers immediately following the patch version. Identifiers MUST
                          comprise only ASCII alphanumerics and hyphen [0-9A-Za-z-]. Identifiers MUST NOT be empty. Numeric identifiers MUST NOT include leading zeroes. Pre-release versions have a lower
                          precedence than the associated normal version. A pre-release version indicates that the version is unstable and might not satisfy the intended compatibility requirements as
                          denoted by its associated normal version. Examples: 1.0.0-alpha, 1.0.0-alpha.1, 1.0.0-0.3.7, 1.0.0-x.7.z.92.(https://semver.org/spec/v2.0.0.html)
     * 
     * @param preReleaseVersionText
     */
    public void setPreReleaseVersionText(
            PreReleaseVersionType preReleaseVersionText) {
        this.preReleaseVersionText = preReleaseVersionText;
    }

    /** 
     * Get the 'BuildMetaText' element value. Build metadata MAY be denoted by appending a plus sign and a series of dot separated identifiers immediately following the patch or pre-release version.
                          Identifiers MUST comprise only ASCII alphanumerics and hyphen [0-9A-Za-z-]. Identifiers MUST NOT be empty. Build metadata SHOULD be ignored when determining version precedence.
                          Thus two versions that differ only in the build metadata, have the same precedence. Examples: 1.0.0-alpha+001, 1.0.0+20130313144700,
                          1.0.0-beta+exp.sha.5114f85.(https://semver.org/spec/v2.0.0.html)
     * 
     * @return value
     */
    public BuildMetaType getBuildMetaText() {
        return buildMetaText;
    }

    /** 
     * Set the 'BuildMetaText' element value. Build metadata MAY be denoted by appending a plus sign and a series of dot separated identifiers immediately following the patch or pre-release version.
                          Identifiers MUST comprise only ASCII alphanumerics and hyphen [0-9A-Za-z-]. Identifiers MUST NOT be empty. Build metadata SHOULD be ignored when determining version precedence.
                          Thus two versions that differ only in the build metadata, have the same precedence. Examples: 1.0.0-alpha+001, 1.0.0+20130313144700,
                          1.0.0-beta+exp.sha.5114f85.(https://semver.org/spec/v2.0.0.html)
     * 
     * @param buildMetaText
     */
    public void setBuildMetaText(BuildMetaType buildMetaText) {
        this.buildMetaText = buildMetaText;
    }

    /** 
     * Get the list of 'SemanticVersionInformationAugmentationPoint' element items. An augmentation point for SemanticVersionInformationType
     * 
     * @return list
     */
    public List<SemanticVersionInformationAugmentationPoint> getSemanticVersionInformationAugmentationPointList() {
        return semanticVersionInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'SemanticVersionInformationAugmentationPoint' element items. An augmentation point for SemanticVersionInformationType
     * 
     * @param list
     */
    public void setSemanticVersionInformationAugmentationPointList(
            List<SemanticVersionInformationAugmentationPoint> list) {
        semanticVersionInformationAugmentationPointList = list;
    }
}
