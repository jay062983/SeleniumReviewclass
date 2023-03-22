package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClose {
    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        // driver.get("https://www.google.com/");// first google page will open and then facebook page
        driver.navigate().to("https://www.facebook.com/");

        driver.close();// closes only current tab
        driver.quit();// will close whole browser
    }
}