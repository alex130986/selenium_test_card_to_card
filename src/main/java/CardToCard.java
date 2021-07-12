import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CardToCard {

    By debitCard = By.xpath("//input[@data-qa-node='numberdebitSource']");
    By expiredDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    By firstNamedebitSource = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    By lastNamedebitSource = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
    By numberreceiver = By.xpath("//input[@data-qa-node='numberreceiver']");
    By firstNamereceiver = By.xpath("//input[@data-qa-node='firstNamereceiver']");
    By lastNamereceiver = By.xpath("//input[@data-qa-node='lastNamereceiver']");
    By amount = By.xpath("//input[@data-qa-node='amount']");
    By button = By.xpath("//button[@data-qa-node='currency']");
    By submitButton = By.xpath("//button[@type='submit']");




    @Test
    public void CardToCardPayment(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://next.privat24.ua/money-transfer/card");
        driver.findElement(debitCard).sendKeys("4506909324274797");
        driver.findElement(expiredDate).sendKeys("0622");
        driver.findElement(cvv).sendKeys("327");
        driver.findElement(firstNamedebitSource).sendKeys("Peter");
        driver.findElement(lastNamedebitSource).sendKeys("Scroggs");
        driver.findElement(numberreceiver).sendKeys("4506503231399019");
        driver.findElement(firstNamereceiver).sendKeys("Symon");
        driver.findElement(lastNamereceiver).sendKeys("Cassady");
        driver.findElement(amount).sendKeys("15");
        driver.findElement(By.xpath("//button[@data-qa-node='currency']")).click();
        driver.findElement(By.xpath("//button[@data-qa-value='USD']")).click();
        driver.findElement(submitButton).submit();

    }
}
