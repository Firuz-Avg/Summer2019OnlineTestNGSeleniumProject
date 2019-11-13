package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MyFirstSeleniumScript {
    public static void main(String[] args) {
        // we have to setup webdriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        // We need to create an onject of appropriate class
        ChromeDriver driver = new ChromeDriver();
        // let's open gooogle.con
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
//        driver.findElement(By.id("u_0_b")).click();
//        driver.findElement(By.id("email")).sendKeys("Alik");
//        driver.findElement(By.id("pass")).sendKeys("Fatush");
//        driver.findElement(By.id("u_0_c")).click();

        driver.findElement(By.id("u_0_f")).sendKeys("iTeam");
        driver.findElement(By.id("u_0_h")).sendKeys("iTeam");
        driver.findElement(By.id("u_0_k")).sendKeys("2018888888");
        driver.findElement(By.id("u_0_r")).sendKeys("123456");



        Select Month = new Select(driver.findElement(By.id("month")));
        Month.selectByVisibleText("Aug");
        Select Day = new Select(driver.findElement(By.id("day")));
        Day.selectByVisibleText("17");
        Select Year = new Select(driver.findElement(By.id("year")));
        Year.selectByVisibleText("1989");

        driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
        driver.findElement(By.id("u_0_y")).click();






    }

}
