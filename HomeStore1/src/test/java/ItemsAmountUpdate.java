import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemsAmountUpdate extends baseClass{


    //Čia tikrinu kaip naviguoja į krepšelio puslapį per viršutinį bloką (kur visa info kiek prekių ir pan)
    @Test
    void viewCartBtnTest() {

        //Ideda preke ir patikrina, kad butu daugiau nei 1 preke
        driver.findElement(By.cssSelector("[href*='?add-to-cart=127']")).click();
        wait.until(driver -> {
            String itemCountString = driver.findElement(By.cssSelector("span.count")).getText();
            int itemCount = Integer.parseInt(itemCountString.split(" " )[0]);
            return itemCount > 0;
        });


    }

    }










//      @Test
//    void amountUpdateTest(){
//
//        //Čia labai nesąmoningai padariau, daug keisčiau, bet tiksliai nežinojau kaip :D
//        //Bet esmė patikrint ar keičiasi VNT kiekis, kai įdedi daugiau nei vieną prekę
//
//
//        //1. Idet pradzioj viena preke ir patikrint koks quantity
//        driver.findElement(By.cssSelector("[href*='?add-to-cart=127']")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("span.count"), "1 item"));
//
//        WebElement quantityOneItem = driver.findElement(By.cssSelector("span.count"));
//        String firstUpdate = quantityOneItem.getText();
//
//        assertEquals("1 item", firstUpdate, "The amount should be 1");
//
//        //2. Idet antra preke ir patikrint koks quantity
//
//        driver.findElement(By.cssSelector("[href*='?add-to-cart=127']")).click();
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("span.count"), "2 item"));
//
//        WebElement quantityTwoItems = driver.findElement(By.cssSelector("span.count"));
//        String secondUpdate = quantityTwoItems.getText();
//
//        assertEquals("2 items", secondUpdate, "The amount should be 2");
//
//    }
//
//}