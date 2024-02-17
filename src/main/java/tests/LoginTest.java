package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.LoginFlow;


public class LoginTest extends LoginFlow {

    @Test
    public void successLoginTest() {
        doLogin("standard_user", "secret_sauce");
        driver.findElement(By.id("shopping_cart_container"));
    }

    @Test
    public void loginAsBlockedUserTest() {
        doLogin("locked_out_user", "secret_sauce");
        verifyErrorMessageIsDisplayed("Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void loginAsUnexistedUserTest() {
        doLogin("potato", "secret_sauce");
        verifyErrorMessageIsDisplayed("Epic sadface: Username and password do not match any user in this service");
    }

}
