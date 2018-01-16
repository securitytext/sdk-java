/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ResponsesQueryModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5741826179889606686L;
    private boolean found;
    private int status;
    private String output;
    /** GETTER
     * Query matched exactly one Domain object
     */
    @JsonGetter("found")
    public boolean getFound ( ) { 
        return this.found;
    }
    
    /** SETTER
     * Query matched exactly one Domain object
     */
    @JsonSetter("found")
    public void setFound (boolean value) { 
        this.found = value;
    }
 
    /** GETTER
     * Status of matched Domain object (if any)
     */
    @JsonGetter("status")
    public int getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status of matched Domain object (if any)
     */
    @JsonSetter("status")
    public void setStatus (int value) { 
        this.status = value;
    }
 
    /** GETTER
     * Text output of Query
     */
    @JsonGetter("output")
    public String getOutput ( ) { 
        return this.output;
    }
    
    /** SETTER
     * Text output of Query
     */
    @JsonSetter("output")
    public void setOutput (String value) { 
        this.output = value;
    }
 
}
 