package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String  browser ="Chrome";
    static  String baseUrl ="https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //1/ Setup Multibrowser
        if (browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver =new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver= new FirefoxDriver();
        } else System.out.println("Invalid Input");

        // 2. Open the URL
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



