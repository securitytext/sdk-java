/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class AttributesTimestampsModelBuilder {
    //the instance to build
    private AttributesTimestampsModel attributesTimestampsModel;

    /**
     * Default constructor to initialize the instance
     */
    public AttributesTimestampsModelBuilder() {
        attributesTimestampsModel = new AttributesTimestampsModel();
    }

    /**
     * Creation date
     */
    public AttributesTimestampsModelBuilder createdAt(DateTime createdAt) {
        attributesTimestampsModel.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last updated
     */
    public AttributesTimestampsModelBuilder updatedAt(DateTime updatedAt) {
        attributesTimestampsModel.setUpdatedAt(updatedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AttributesTimestampsModel build() {
        return attributesTimestampsModel;
    }
}