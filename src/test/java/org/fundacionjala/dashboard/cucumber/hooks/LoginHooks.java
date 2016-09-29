package org.fundacionjala.dashboard.cucumber.hooks;

import cucumber.api.java.Before;
import org.fundacionjala.dashboard.ui.pages.HomePage;
import org.fundacionjala.dashboard.ui.pages.LoginPage;
import org.fundacionjala.dashboard.ui.pages.menu.Profile;
import org.fundacionjala.dashboard.ui.pages.menu.Service;
import org.fundacionjala.dashboard.ui.pages.menu.TopMenu;


/**
 * Created by BrunoVasquez on 9/29/2016.
 */
public class LoginHooks {


    private static boolean beforeAllFlag;

    @Before("@Login")
    public void beforeAll() {
        if (!beforeAllFlag) {
            // Login as Primary
            HomePage homePage = LoginPage.loginAsPrimaryUser();

            // Select the Service
            TopMenu topMenu = homePage.goToTopMenu();
            Profile profile = topMenu.clickOnProfileMenu();

            beforeAllFlag = true;
        }
    }
}
