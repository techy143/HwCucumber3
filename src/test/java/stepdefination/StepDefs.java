package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefs {

    WebDriver driver;

    @Given("I navigate to www.ebay.com")
    public void i_navigate_to_www_ebay_com() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.get("https://demo.broadleafcommerce.org/");
    }

    @Given("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@href='/login'])[1]")).click();
        Thread.sleep(5000);
    }

    @When("I enter UserID and Password")
    public void i_enter_UserID_and_Password() {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("khanshabb111@gmail.com");
        driver.findElement(By.xpath("(//*[@id='password'])[1]")).sendKeys("Agustina2426");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

    @Then("I should go to home page")
    public void i_should_go_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I enter wrong UserID and Password")
    public void i_enter_wrong_UserID_and_Password() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I should see the error message")
    public void i_should_see_the_error_message() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }


}
