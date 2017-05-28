package com.yourcompany.Pages.Android;

import com.yourcompany.Pages.BasePage;
import com.yourcompany.Pages.SauceHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by neil on 5/27/17.
 */
public class AndroidSauceHomePage extends BasePage implements SauceHomePage {

    public AndroidSauceHomePage(WebDriver driver) {
        this.driver = driver;
    }
    private By menuBtn = By.cssSelector(".N54G");
    private By signInButton = By.cssSelector("#site-header a[data-reactid='69']");

    public static String url = "https://saucelabs.com";

    public void visitPage() {
        this.driver.get(url);
    }

    public void goToLogin() throws Exception {
        click(menuBtn);
        click(signInButton);
    }
}
