package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonHomePage_PF;

public class AmazonStepDefinition {

    WebDriver driver;
    AmazonHomePage_PF amazonHomePage_pf;

    @Given("amazon webpage is launched")
    public void amazonWebpageIsLaunched() {
        String ProjDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        amazonHomePage_pf = new AmazonHomePage_PF(driver);
    }

//    @When("users enter the product name")
//    public void usersEnterTheProductName() {
//        amazonHomePage_pf.enterSearchBox("Iphone");
//    }

    @When("user enters a product name{string} in the search box")
    public void userEntersAProductNameInTheSearchBox(String arg0) {
        amazonHomePage_pf.enterSearchBox(arg0);
    }


    @And("clicks on search button")
    public void clicksOnSearchButton() {
        amazonHomePage_pf.clickOnSearchButton();
    }

    @Then("search results should be displayed")
    public void searchResultsShouldBeDisplayed() {
        driver.close();
        System.out.println("Test Successful");
    }



}
