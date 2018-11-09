/*
 * Simple Inventory API
 * This is a simple API xkkxdm
 *
 * OpenAPI spec version: 1.0.0
 * Contact: you@your-company.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InventoryItem;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevelopersApi
 */
@Ignore
public class DevelopersApiTest {

    private final DevelopersApi api = new DevelopersApi();

    
    /**
     * searches inventory
     *
     * By passing in the appropriate options, you can search for available inventory in the system 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchInventoryTest() throws ApiException {
        String searchString = null;
        Integer skip = null;
        Integer limit = null;
        List<InventoryItem> response = api.searchInventory(searchString, skip, limit);

        // TODO: test validations
    }
    
}
