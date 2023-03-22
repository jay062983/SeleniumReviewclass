 package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchApplication2 {
    public static void main(String[] args) {
       // WebDriver driver=new ChromeDriver();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
