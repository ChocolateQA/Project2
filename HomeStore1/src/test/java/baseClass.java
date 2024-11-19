import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class baseClass {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://themes.woocommerce.com/homestore/shop/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }


}
