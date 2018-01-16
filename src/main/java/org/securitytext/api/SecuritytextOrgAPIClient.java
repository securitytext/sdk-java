/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api;

import org.securitytext.api.controllers.*;
import org.securitytext.api.http.client.HttpClient;

public class SecuritytextOrgAPIClient {
    /**
     * Singleton access to Whois controller
     * @return	Returns the WhoisController instance 
     */
    public WhoisController getWhois() {
        return WhoisController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public SecuritytextOrgAPIClient() {
    }

}