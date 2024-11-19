import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationToCartPage extends baseClass {


    //Čia tikrinu kaip naviguoja į krepšelio puslapį paspaudus po preke "View cart"
    @Test
    void cartUnderProductBtnNav() {
        driver.findElement(By.cssSelector("[href*='?add-to-cart=127']")).click();

        WebElement viewCartBtnProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.added_to_cart")));
        viewCartBtnProduct.click();
    }


    @Test
    void cartNavigationUpperBlock() {
        WebElement topCartBlock = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a.cart-contents"))));
        topCartBlock.click();
    }
}