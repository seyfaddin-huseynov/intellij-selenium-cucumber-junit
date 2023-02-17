package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinitions {
    @Given("I am at Google search page")
    public void i_am_at_google_search_page() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        WebElement googleSearch = driver.findElement(By.cssSelector("[title=\"Search\"]"));
        googleSearch.sendKeys("Di get!", Keys.ENTER);
    }
}
