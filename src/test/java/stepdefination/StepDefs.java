package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    WebDriver driver;

   /* @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    } */

    @Given("I navigate to {string} page")
    public void i_navigate_to_page(String string) {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get(string);

    }

    @And("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@href='/login'])[1]")).click();
        Thread.sleep(3000);
    }

    @When("^I enter (.*?) and (.*?)$")
    public void i_enter_UserID_and_Password(String strOne, String strTwo) {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(strOne);
        driver.findElement(By.xpath("(//*[@id='password'])[1]")).sendKeys(strTwo);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

    @And("I should go to home page")
    public void i_should_go_to_home_page() {

    }

    @Then("I click on Green Ghost")
    public void i_click_green_ghost() throws InterruptedException {
        driver.findElement(By.linkText("Green Ghost")).click();
        Thread.sleep(3000);
        System.out.println("clicked on Product");
        driver.quit();
    }

   /* @After
    public void logOut() {
        driver.quit();
    } */
}
