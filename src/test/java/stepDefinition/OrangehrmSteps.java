package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmSteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void browser(){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("I open orange hrm homepage")
    public void homepage(){

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }
    @Then("I verify that the logo present on page and login")
    public void login() throws InterruptedException {

        boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
        Thread.sleep(4000);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("menu_admin_Job")).click();
        driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Test Engineer");
        driver.findElement(By.id("btnSave")).click();

    }
    @And("close browser")
    public void closeBrowser(){

        driver.quit();

    }



}
