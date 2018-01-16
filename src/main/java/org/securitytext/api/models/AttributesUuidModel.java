/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AttributesUuidModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4825915383439489007L;
    private String value;
    /** GETTER
     * Value of UUID
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * Value of UUID
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
}
 