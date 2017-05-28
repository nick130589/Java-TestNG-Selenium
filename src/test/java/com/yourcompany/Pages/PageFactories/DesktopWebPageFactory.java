package com.yourcompany.Pages.PageFactories;

import com.yourcompany.Pages.DesktopWeb.DesktopSauceHomePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by neil on 5/27/17.
 */
public class DesktopWebPageFactory implements PageFactory {
    @Override
    public DesktopSauceHomePage createSauceHomePage(WebDriver driver) {
        return new DesktopSauceHomePage(driver);
    }
}
