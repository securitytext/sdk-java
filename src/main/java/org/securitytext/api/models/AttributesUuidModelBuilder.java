/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.models;

import java.util.*;

public class AttributesUuidModelBuilder {
    //the instance to build
    private AttributesUuidModel attributesUuidModel;

    /**
     * Default constructor to initialize the instance
     */
    public AttributesUuidModelBuilder() {
        attributesUuidModel = new AttributesUuidModel();
    }

    /**
     * Value of UUID
     */
    public AttributesUuidModelBuilder value(String value) {
        attributesUuidModel.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AttributesUuidModel build() {
        return attributesUuidModel;
    }
}