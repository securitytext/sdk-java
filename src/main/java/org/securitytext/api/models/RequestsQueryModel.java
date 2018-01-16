/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RequestsQueryModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4629011925815974641L;
    private String domain;
    /** GETTER
     * Name of Domain to query
     */
    @JsonGetter("domain")
    public String getDomain ( ) { 
        return this.domain;
    }
    
    /** SETTER
     * Name of Domain to query
     */
    @JsonSetter("domain")
    public void setDomain (String value) { 
        this.domain = value;
    }
 
}
 