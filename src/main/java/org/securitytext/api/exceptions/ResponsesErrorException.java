/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.securitytext.api.http.client.HttpContext;

public class ResponsesErrorException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 5636757622776456345L;
    private String message;
    private Object errors;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    private void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("errors")
    public Object getErrors ( ) { 
        return this.errors;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("errors")
    private void setErrors (Object value) { 
        this.errors = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public ResponsesErrorException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 