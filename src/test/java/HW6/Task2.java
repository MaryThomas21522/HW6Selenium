package HW6;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement getNewUserBtn = driver.findElement(By.xpath("//button[@id='save']"));
        getNewUserBtn.click();

        WebElement userFirstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));
        System.out.println(userFirstName.getText());
        driver.close();
    }
}

/*
Go to http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
Click on get new user
Print the firstname of user
 */
