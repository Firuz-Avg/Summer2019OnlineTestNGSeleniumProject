package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice01 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com");
        driver.wait(3000);
        driver.findElement(By.id("emailId")).sendKeys("Asal@gmail.com");
        driver.findElement(By.cssSelector("[data-static-id='button-wrap-container']>div>input")).click();
        driver.wait(3000);

        driver.findElement(By.id("gh-search-input")).sendKeys("iphone");
        driver.close();








    }

}
