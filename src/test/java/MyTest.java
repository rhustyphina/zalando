import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class MyTest extends BaseTest {

    Random generator = new Random();

    public int randomize(int i) {
        int rndNumber = generator.nextInt(i);
        System.out.println("Randomed number: " + rndNumber);
        return rndNumber;
    }

    @Test
    public void secondTest() throws InterruptedException {
        driver.get("https://www.zalando.pl/");



        WebElement promocje = driver.findElement(By.cssSelector("li[class='z-navicat-header_categoryListElement 7_bb']"));
        promocje.click();

//        WebElement kobiety = driver.findElement(By.cssSelector("#z-nvg-cognac-root > div.cat_catalog-ec2An > z-grid > z-grid-item:nth-child(1) > div > div:nth-child(1) > a"));
//        kobiety.click();

        Thread.sleep(2000);

        List<WebElement> kobiety = driver.findElements(By.cssSelector("a[class='cat_link-mTK6o']"));
        kobiety.get(0).click();

        Thread.sleep(3000);

        List<WebElement> odziez = driver.findElements(By.cssSelector("a[class='cat_link-mTK6o']"));
        odziez.get(0).click();

        Thread.sleep(3000);

        WebElement rozwinFiltry = driver.findElement(By.cssSelector("div[class='cat_button-1PoVy']"));
        rozwinFiltry.click();

        Thread.sleep(3000);


        List<WebElement> filtrRozmiar = driver.findElements(By.cssSelector("div.cat_filterHead-3-7Lz"));
        filtrRozmiar.get(0).click();

        Thread.sleep(2000);

        List<WebElement> rozmiary = driver.findElements(By.cssSelector("li.cat_checkboxOption-w9fJZ"));
        rozmiary.get(13).click();
        rozmiary.get(18).click();

        Thread.sleep(2000);

        WebElement zapiszRozmiar = driver.findElement(By.cssSelector("button[class='cat_saveButton-1KxIT']"));
        zapiszRozmiar.click();


        Thread.sleep(3000);


        List<WebElement> filtrMarka = driver.findElements(By.cssSelector("div.cat_filterHead-3-7Lz"));
        filtrMarka.get(1).click();

        WebElement szukajMarki = driver.findElement(By.name("search"));
        szukajMarki.sendKeys("Nike");



        List<WebElement> wyszukane = driver.findElements(By.cssSelector("li.cat_checkboxOption-w9fJZ"));
        int i = randomize(wyszukane.size() - 1);
        wyszukane.get(i).click();

        Thread.sleep(2000);

        WebElement zapiszMarke = driver.findElement(By.cssSelector("button[class='cat_saveButton-1KxIT']"));
        zapiszMarke.click();

        Thread.sleep(3000);


        List<WebElement> filtrCena = driver.findElements(By.cssSelector("div.cat_filterHead-3-7Lz"));
        filtrCena.get(2).click();

        Thread.sleep(3000);


        WebElement cenaDo = driver.findElements(By.cssSelector("input.cat_field-33opO")).get(1);

        cenaDo.sendKeys(Keys.BACK_SPACE);
        cenaDo.sendKeys(Keys.BACK_SPACE);
        cenaDo.sendKeys(Keys.BACK_SPACE);
//        cenaDo.clear();

//        cenaDo.sendKeys(Keys.CONTROL, "a");
//        cenaDo.sendKeys(Keys.DELETE);
//        cenaDo.sendKeys("200");

//        cenaDo.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        cenaDo.sendKeys("200");

        WebElement zapiszCene = driver.findElement(By.cssSelector("button[class='cat_saveButton-1KxIT']"));
        zapiszCene.click();

        Thread.sleep(5000);

//        List<WebElement> rozmiary = driver.findElements(By.cssSelector("li.cat_checkboxOption-w9fJZ"));
//        rozmiary.get(13).click();
//        rozmiary.get(18).click();
//
//        Thread.sleep(2000);
//
//        WebElement zapisz = driver.findElement(By.cssSelector("button[class='cat_saveButton-1KxIT']"));
//        zapisz.click();
//
//
//
//
//        Thread.sleep(2000);


    }
}
