package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchApplication {

    public static void main(String[] args) {
        //1. Open the Browser
   System.setProperty("webdriver.chrome.driver","C:\\Users\\jaycs\\SeleniumReviewclass\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
    }
}
