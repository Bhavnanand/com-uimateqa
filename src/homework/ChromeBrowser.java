package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl ="https://courses.ultimateqa.com/users/sign_in";
        // 1. Setup chrome browser
        WebDriver driver= new ChromeDriver();

       // 2. Open URL
        driver.get(baseUrl);


        //3. Print the title of the page
        driver.getTitle();
        System.out.println("Title of Url :"+driver.getTitle());

        //4. Print the current url
        driver.getCurrentUrl();
        System.out.println("Current Url Name  :"+driver.getCurrentUrl());

        //5. Print the page source
        driver.getPageSource();
        System.out.println("Page Source :"+driver.getPageSource());


        //6. Enter the email to email field
        driver.findElement(By.name("user[email]"));
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("admin");


        //7. Enter the password to password field
        driver.findElement(By.id("user[password]"));
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("admin123");

        Thread.sleep(5000);
        //8. Close the browser
        driver.close();
    }
}
