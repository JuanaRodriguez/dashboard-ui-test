package org.fundacionjala.dashboard.cucumber.stepdefinition.dashboard;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import cucumber.api.java.en.When;
import org.fundacionjala.dashboard.ui.pages.menu.Profile;
import org.fundacionjala.dashboard.ui.pages.menu.Service;

/**
 * Created by BrunoVasquez on 9/29/2016.
 */
public class ServiceSteps {

    @When("^I add a service$")
    public void iAddAService(Map<ServiceFieldStep, String> serviceMap) {

        new Profile().clickAddServiceButton();

        Map<ServiceFieldStep, Steps> map = new HashMap<>();
        map.put(ServiceFieldStep.SERVICENAME, () -> new Service().selectServiceDropdown(serviceMap.get(ServiceFieldStep.SERVICENAME)));
        map.put(ServiceFieldStep.TOKEN, () -> new Service().setTokenTextField(serviceMap.get(ServiceFieldStep.TOKEN)));
        map.put(ServiceFieldStep.DESCRIPTION, () -> new Service().setDescriptionTextField(serviceMap.get(ServiceFieldStep.DESCRIPTION)));
        map.put(ServiceFieldStep.SERVERADDRESS, () -> new Service().setDescriptionTextField(serviceMap.get(ServiceFieldStep.SERVERADDRESS)));


        Set<ServiceFieldStep> keys = serviceMap.keySet();
        for (ServiceFieldStep key : keys) {
            map.get(key).executeStep();
        }
        new Service().clickSaveButton();
    }
}
