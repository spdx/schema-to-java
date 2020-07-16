
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools.
 */
public class CreationInfo extends Package
{
    private String comment;
    private Date created;
    private List<String> creatorList = new ArrayList<String>();
    private String licenseListVersion;

    /** 
    * Get the 'comment' element value.
    * 
    * @return value
    */
    public String getComment() {
        return comment;
    }

    /** 
    * Set the 'comment' element value.
    * 
    * @param comment
    */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
    * Get the 'created' element value. Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard. This field is distinct from the fields in section 8, which involves the addition of information during a subsequent review.
    * 
    * @return value
    */
    public Date getCreated() {
        return created;
    }

    /** 
    * Set the 'created' element value. Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard. This field is distinct from the fields in section 8, which involves the addition of information during a subsequent review.
    * 
    * @param created
    */
    public void setCreated(Date created) {
        this.created = created;
    }

    /** 
    * Get the list of 'creator' element items. Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person's name. If the SPDX file was created on behalf of a company or organization, indicate the entity name. If the SPDX file was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate.
    * 
    * @return list
    */
    public List<String> getCreatorList() {
        return creatorList;
    }

    /** 
    * Set the list of 'creator' element items. Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person's name. If the SPDX file was created on behalf of a company or organization, indicate the entity name. If the SPDX file was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate.
    * 
    * @param list
    */
    public void setCreatorList(List<String> list) {
        creatorList = list;
    }

    /** 
    * Get the 'licenseListVersion' element value. An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created.
    * 
    * @return value
    */
    public String getLicenseListVersion() {
        return licenseListVersion;
    }

    /** 
    * Set the 'licenseListVersion' element value. An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created.
    * 
    * @param licenseListVersion
    */
    public void setLicenseListVersion(String licenseListVersion) {
        this.licenseListVersion = licenseListVersion;
    }
}
