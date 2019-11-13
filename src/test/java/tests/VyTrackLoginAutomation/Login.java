package tests.VyTrackLoginAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class Login {
    
    

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        BrowserFactory browser = new BrowserFactory();
        browser.login("storemanager89", "UserUser123");
        System.out.println("passed");




       browser.login("Abdul", "manon");
            System.out.println("Failed");











    }
}
