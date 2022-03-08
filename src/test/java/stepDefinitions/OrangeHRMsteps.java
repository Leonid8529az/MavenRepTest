package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRMsteps {

    public WebDriver driver;

    @Given("I launch Chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//wormi//IdeaProjects//nopCommerceV001_Cucumber//src//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("I open  orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Then("I verify that the logo preset on page")
    public void i_verify_that_the_logo_preset_on_page() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]")).isDisplayed();
        Assert.assertEquals(true,status);
    }
    @And("Close browser")
    public void close_browser() {
        driver.quit();
    }
}
