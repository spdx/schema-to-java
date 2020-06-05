
package spdxxml;

/** 
 * A data type for the Python development release segment with the scheme: .devN: [N!]N(.N)*[{a|b|rc}N][.postN][.devN]
 (https://www.python.org/dev/peps/pep-0440/#public-version-identifiers).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="ns:PythonPreReleaseVersionType" nillable="true" name="PythonDevelopmentReleaseSegmentText"/>
 * </pre>
 */
public class PythonDevelopmentReleaseSegmentText
        extends
            PythonPreReleaseVersionType
{
}
