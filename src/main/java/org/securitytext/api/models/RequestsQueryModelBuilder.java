/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.models;

import java.util.*;

public class RequestsQueryModelBuilder {
    //the instance to build
    private RequestsQueryModel requestsQueryModel;

    /**
     * Default constructor to initialize the instance
     */
    public RequestsQueryModelBuilder() {
        requestsQueryModel = new RequestsQueryModel();
    }

    /**
     * Name of Domain to query
     */
    public RequestsQueryModelBuilder domain(String domain) {
        requestsQueryModel.setDomain(domain);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RequestsQueryModel build() {
        return requestsQueryModel;
    }
}