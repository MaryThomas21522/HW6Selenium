package HW6;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class Task1 extends CommonMethods {
        public static void main(String[] args) throws InterruptedException {
            String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
            String browser = "chrome";
            openBrowserAndLaunchApplication(url, browser);

            // Click on start
            WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
            startBtn.click();


            // Print the text
            WebElement messageElement = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.textToBePresentInElement(messageElement, "Welcome Syntax Technologies"));
            System.out.println(messageElement.getText());
            Thread.sleep(2000);
            driver.close();
        }
    }

      /*
    Go to  http://practice.syntaxtechs.net/dynamic-elements-loading.php
    Click on start
    Print the text  "welcome syntax technologies" on the console
     */