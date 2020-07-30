
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * An exception to a license.
 */
public class LicenseException extends ModelObject
{
    private String example;
    private List<String> seeAlsoList = new ArrayList<String>();
    private String name;
    private String licenseExceptionId;
    private String comment;
    private String licenseExceptionText;

    /** 
    * Get the 'example' element value. Text for examples in describing an SPDX element.
    * 
    * @return value
    */
    public String getExample() {
        return example;
    }

    /** 
    * Set the 'example' element value. Text for examples in describing an SPDX element.
    * 
    * @param example
    */
    public void setExample(String example) {
        this.example = example;
    }

    /** 
    * Get the list of 'seeAlso' element items.
    * 
    * @return list
    */
    public List<String> getSeeAlsoList() {
        return seeAlsoList;
    }

    /** 
    * Set the list of 'seeAlso' element items.
    * 
    * @param list
    */
    public void setSeeAlsoList(List<String> list) {
        seeAlsoList = list;
    }

    /** 
    * Get the 'name' element value. Identify name of this SpdxElement.
    * 
    * @return value
    */
    public String getName() {
        return name;
    }

    /** 
    * Set the 'name' element value. Identify name of this SpdxElement.
    * 
    * @param name
    */
    public void setName(String name) {
        this.name = name;
    }

    /** 
    * Get the 'licenseExceptionId' element value. Short form license exception identifier in Appendix I.2 of the SPDX specification.
    * 
    * @return value
    */
    public String getLicenseExceptionId() {
        return licenseExceptionId;
    }

    /** 
    * Set the 'licenseExceptionId' element value. Short form license exception identifier in Appendix I.2 of the SPDX specification.
    * 
    * @param licenseExceptionId
    */
    public void setLicenseExceptionId(String licenseExceptionId) {
        this.licenseExceptionId = licenseExceptionId;
    }

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
    * Get the 'licenseExceptionText' element value. Full text of the license exception.
    * 
    * @return value
    */
    public String getLicenseExceptionText() {
        return licenseExceptionText;
    }

    /** 
    * Set the 'licenseExceptionText' element value. Full text of the license exception.
    * 
    * @param licenseExceptionText
    */
    public void setLicenseExceptionText(String licenseExceptionText) {
        this.licenseExceptionText = licenseExceptionText;
    }
}
