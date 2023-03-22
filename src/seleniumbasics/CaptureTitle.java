package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");// first google page will open and then facebook page
        driver.navigate().to("https://www.facebook.com/");
   String PageTitle=driver.getTitle();
        System.out.println("The title of the page is: "+PageTitle);

    }
    }

