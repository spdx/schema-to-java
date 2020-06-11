
package com.javatpoint;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://www.javatpoint.com" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="employee">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:string" name="firstname"/>
 *       &lt;xs:element type="xs:string" name="lastname"/>
 *       &lt;xs:element type="xs:string" name="email"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class Employee
{
    private String firstname;
    private String lastname;
    private String email;

    /** 
     * Get the 'firstname' element value.
     * 
     * @return value
     */
    public String getFirstname() {
        return firstname;
    }

    /** 
     * Set the 'firstname' element value.
     * 
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /** 
     * Get the 'lastname' element value.
     * 
     * @return value
     */
    public String getLastname() {
        return lastname;
    }

    /** 
     * Set the 'lastname' element value.
     * 
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /** 
     * Get the 'email' element value.
     * 
     * @return value
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Set the 'email' element value.
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
