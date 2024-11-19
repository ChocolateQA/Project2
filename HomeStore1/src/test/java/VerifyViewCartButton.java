import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VerifyViewCartButton extends baseClass{


    //Patikrint ar matosi View Cart mygtukas
    @Test
    void addToCartBtnVisible() {
       driver.findElement(By.cssSelector("[href*='?add-to-cart=127']")).click();

       WebElement viewCartBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.added_to_cart.wc-forward")));
       assertTrue(viewCartBtn.isDisplayed(), "The 'View Cart' button should be visible");

    }
}

