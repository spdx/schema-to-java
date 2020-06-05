
package spdxxml;

/** 
 * A data item for The licensing under which the creator of this SPDX document allows related data to be reproduced. The only valid value for this property is
 http://spdx.org/licenses/CC0-1.0. This is to alleviate any concern that content (the data) in an SPDX file is subject to any form of intellectual property right that could restrict the
 re-use of the information or the creation of another SPDX file for the same project(s). This approach avoids intellectual property and related restrictions over the SPDX file, however
 individuals can still contract one to one to restrict release of specific collections of SPDX files (which map to software bill of materials) and the identification of the supplier of SPDX
 files.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="ns:LicenseIDType" nillable="true" name="DataLicenseID"/>
 * </pre>
 */
public class DataLicenseID extends LicenseIDType
{
}
