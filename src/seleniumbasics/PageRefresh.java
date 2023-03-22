package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageRefresh {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
       // driver.get("https://www.google.com/");// first google page will open and then facebook page
        driver.navigate().to("https://www.facebook.com/");
         driver.navigate().refresh();
         driver.close();

    }
}