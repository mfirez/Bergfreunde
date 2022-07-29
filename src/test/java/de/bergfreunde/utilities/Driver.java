package de.bergfreunde.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public Driver() {
    }

    public static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null){

            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }

        }

        driver.manage().window().maximize();

        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
