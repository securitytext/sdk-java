/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.models;

import java.util.*;

public class ResponsesQueryModelBuilder {
    //the instance to build
    private ResponsesQueryModel responsesQueryModel;

    /**
     * Default constructor to initialize the instance
     */
    public ResponsesQueryModelBuilder() {
        responsesQueryModel = new ResponsesQueryModel();
    }

    /**
     * Query matched exactly one Domain object
     */
    public ResponsesQueryModelBuilder found(boolean found) {
        responsesQueryModel.setFound(found);
        return this;
    }

    /**
     * Status of matched Domain object (if any)
     */
    public ResponsesQueryModelBuilder status(int status) {
        responsesQueryModel.setStatus(status);
        return this;
    }

    /**
     * Text output of Query
     */
    public ResponsesQueryModelBuilder output(String output) {
        responsesQueryModel.setOutput(output);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ResponsesQueryModel build() {
        return responsesQueryModel;
    }
}