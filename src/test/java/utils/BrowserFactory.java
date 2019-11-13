package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    // we gonna create a method
    // that will return a webdriver object
    // this method will take one parameter - String browser
    // based on the value of the browser parameter
    // method will return corresponded webdriver object
    // if browser = chrome, then return chromedriver object
    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        return null;
    }

    public void login(String username, String password) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        BrowserUtils.wait(3);
        driver.findElement(By.id("_submit")).click();
       Thread.sleep(8000);


        if (driver.findElement(By.xpath("//div[@class='nav logo-wrapper']/h1/a")).isDisplayed()){
            System.out.println("Passed");
            driver.close();
        }else if (driver.findElement(By.xpath("//div[contains(text(),'Invalid user name or password')]")).isDisplayed()){
            System.out.println("Failed");
            driver.close();

        }





    }

}

