package tests;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import utils.TestBase;

import static java.lang.Thread.sleep;

public class Practice extends TestBase {

    @Test
    public void windowManage() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        sleep(2000);
        driver.manage().window().maximize();
        sleep(2000);
        driver.manage().window().minimize();
        sleep(2000);
        driver.manage().window().fullscreen();
        sleep(2000);
        driver.manage().window().setSize(new Dimension(100,600));
        sleep(2000);
        driver.close();
        driver.quit();
    }

    @Test
    public void navigate() throws InterruptedException {
        sleep(2000);
        driver.get("https://www.amazon.de/");
        sleep(2000);
        driver.navigate().back();
        sleep(2000);
        driver.navigate().forward();
        sleep(2000);
        driver.navigate().refresh();
        sleep(2000);
        driver.close();
        driver.quit();
    }

    @Test
    public void openPagetest(){

    }
}
