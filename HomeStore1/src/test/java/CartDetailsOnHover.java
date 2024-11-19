import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartDetailsOnHover extends baseClass{

    //Šito nepabaigiau, bet turėjau patikrint ar matosi title, suma, kiek vnt ir kiek kainuoja prekė.
    //Dar patikrint ar matosi View cart ir Checkout buttons. Tai tik šitą padariau

    @Test
    void detailedCartBlockInfo(){

        driver.findElement(By.cssSelector("[href*='?add-to-cart=127']")).click();


        WebElement cartBlock = driver.findElement(By.cssSelector("a.cart-contents"));
        Actions hover = new Actions(driver);
        hover.moveToElement(cartBlock).perform();





        //View cart ir Checkout mygtukai ar matosi:
        WebElement viewCartButton = driver.findElement(By.cssSelector("a.button,wc-forward,wp-element-button")); // Adjust selector as needed
        Assertions.assertTrue(viewCartButton.isDisplayed(), "'View Cart' button is not visible!");

        WebElement checkoutButton = driver.findElements(By.cssSelector("a.checkout")).get(1); // Adjust selector as needed
        Assertions.assertTrue(checkoutButton.isDisplayed(), "'Checkout' button is not visible!");
    }


    }



    //user can see items amount, sum, title, subtotal sum,
    // "view cart" button and "Checkout" button

// WebElement title = driver.findElement(By.cssSelector("a:nth-child-of-type[1]"));
// Assertions.assertTrue(title.isDisplayed(), "Title is not displayed!");
