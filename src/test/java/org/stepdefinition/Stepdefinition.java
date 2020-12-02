package org.stepdefinition;

import static org.junit.Assert.assertTrue;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
static WebDriver driver;

@Given("user launches browser")
public void user_launches_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\UpdatePackage\\Log\\Mani\\driver\\chromedriver.exe" );
	
	driver= new ChromeDriver();
    driver.get("https://www.facebook.com/");
}

@When("enter the email and pass")
public void enter_the_email_and_pass() {
	WebElement email = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	email.sendKeys("9700568045");
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("saimanikanta");
	
     
}

@When("user hits login btn")
public void user_hits_login_btn() {	WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
btn.click();
}

@Then("user navigate home page")
public void user_navigate_home_page() {
SoftAssert s = new SoftAssert();
s.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
}

}
