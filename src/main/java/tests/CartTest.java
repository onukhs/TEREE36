package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.LoginFlow;

import java.util.List;


public class CartTest extends LoginFlow {

    @Test
    public void addItemToCartTest() {
        doLogin("standard_user", "secret_sauce");
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
        addToCartButtons.get(addToCartButtons.size()-1).click();
        driver.findElement(By.xpath("//span[contains(text(),'1')]"));
    }

    @Test
    public void addMultipleItemsToCartTest() {
        doLogin("standard_user", "secret_sauce");
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
        addToCartButtons.get(0).click();
        addToCartButtons.get(addToCartButtons.size()-1).click();
        driver.findElement(By.xpath("//span[contains(text(),'2')]"));
    }

    @Test
    public void addAndRemoveItemsToCartTest() {
        doLogin("standard_user", "secret_sauce");
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
        addToCartButtons.get(0).click();
        addToCartButtons.get(addToCartButtons.size()-1).click();
        driver.findElement(By.xpath("//span[contains(text(),'2')]"));
        List<WebElement> removeFromCartButton = driver.findElements(By.xpath("//button[contains(text(),'Remove')]"));
        removeFromCartButton.get(0).click();
        driver.findElement(By.xpath("//span[contains(text(),'1')]"));
    }
}
