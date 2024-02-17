package utils;

import org.openqa.selenium.By;

public class LoginFlow extends TestBase {
    public void doLogin(String username, String password) {
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    public void verifyErrorMessageIsDisplayed(String expectedErrorMessage) {
        driver.findElement(By.xpath("//*[contains(text(), '" + expectedErrorMessage + "')]"));
    }
}
