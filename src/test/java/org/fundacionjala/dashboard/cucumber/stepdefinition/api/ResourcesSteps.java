package org.fundacionjala.dashboard.cucumber.stepdefinition.api;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import org.fundacionjala.dashboard.api.Mapper;
import org.fundacionjala.dashboard.api.RequestManager;

/**
 * This class is in charge to manage the steps definitions.
 */
public class ResourcesSteps {

    private Response resp;

    /**
     * Method to store the response.
     *
     * @param key that identify the response.
     */
    @And("^I store as (.*)")
    public void storedAs(final String key) {
        Mapper.addResponse(key, resp);
    }

    /**
     * Method to validate the Get request.
     *
     * @param endPoint end point of the get request.
     */
    @When("^I send a GET request to (.*)$")
    public void iSendAGetRequestTo(final String endPoint) {
        resp = RequestManager.get(Mapper.mapEndpoint(endPoint));
    }

    /**
     * Method to validate the post request.
     *
     * @param endPoint end point of the post request.
     * @param jsonData data in map format.
     */
    @When("^I send a POST request to (.*)")
    public void iSendAPostRequestTo(final String endPoint, final Map<String, Object> jsonData) {
        resp = RequestManager.post(Mapper.mapEndpoint(endPoint), jsonData);
    }

    /**
     * Method to validate the post request for a given list of map.
     *
     * @param endPoint end point of the post request.
     * @param jsonData List of data in map format.
     */
    @When("^I send a POST request with list to (.*)")
    public void iSendAPostRequestWithListTo(final String endPoint, final List<Map<String, Object>> jsonData) {
        for(int i = 0; i< jsonData.size();i++){
            resp = RequestManager.post(Mapper.mapEndpoint(endPoint), jsonData.get(i));
        }
    }

    /**
     * Method to validate the put request.
     *
     * @param endPoint end point of the put request.
     * @param jsonData data in Map format.
     */
    @When("^I send a PUT request to (.*)$")
    public void iSendAPutRequestTo(final String endPoint, final Map<String, Object> jsonData) {
        resp = RequestManager.put(Mapper.mapEndpoint(endPoint), jsonData);
    }

    /**
     * Method to validate delete request.
     *
     * @param endPoint end point of the delete request.
     */
    @When("^I send a DELETE request to (.*)$")
    public void iSendADeleteRequestTo(final String endPoint) {
        resp = RequestManager.delete(Mapper.mapEndpoint(endPoint));
    }

    /**
     * Get the Response.
     *
     * @return the response.
     */
    public Response getResponse() {
        return resp;
    }
}
