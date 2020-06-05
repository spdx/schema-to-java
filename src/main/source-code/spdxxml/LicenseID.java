
package spdxxml;

/** 
 * A data type for A human readable short form license identifier for a license. The license ID is iether on the standard license oist or the form "LicenseRef-"[idString] where
 [idString] is a unique string containing letters, numbers, ".", "-" or "+".
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="ns:LicenseIDType" nillable="true" name="LicenseID"/>
 * </pre>
 */
public class LicenseID extends LicenseIDType
{
}
