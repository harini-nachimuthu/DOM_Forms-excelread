package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Tests.formfilling_Tests;
import basemethod.basemethod;

public class Editpage extends Formfilling_page{
	public Editpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
	}

	Formfilling_page form;
	 WebDriverWait wait;
	 
	@FindBy(xpath="//body//table//tbody//tr//td[2]//table//tbody//tr[2]//td[5]//button[1]")
	WebElement namechange;
	
	@FindBy(xpath="//body//table//tbody//tr//td[2]//table//tbody//tr[3]//td[5]//button[1]")
	WebElement citychange;
	
	@FindBy(xpath="//body//table//tbody//tr//td[2]//table//tbody//tr[4]//td[5]//button[1]")
	WebElement salarychange;
	
	@FindBy(xpath="//body//table//tbody//tr//td[2]//table//tbody//tr[5]//td[5]//button[1]")
	WebElement namechange1;
   
	public Editpage namechange() throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(namechange));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	    Thread.sleep(1000);
	    web_fullname.clear();
	    webwait("fullname", "Abinaya");
	    formsubmit();
	    Thread.sleep(2000);
		return new Editpage(driver);
	}
	
	public Editpage salarychange() throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(salarychange));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	    Thread.sleep(1000);
	    salary.clear();
	    webwait("salary", "54000");
	    formsubmit();
	    Thread.sleep(2000);
		return new Editpage(driver);
	}
	
	public Editpage citychange() throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(citychange));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	    Thread.sleep(1000);
	    city.clear();
	    webwait("city", "Delhi");
	    formsubmit();
	    Thread.sleep(2000);
		return new Editpage(driver);
	}
	
	public Editpage namechange1() throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(namechange1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	    Thread.sleep(1000);
	    web_fullname.clear();
	    webwait("fullname", "Rajewari");
	    formsubmit();
	    Thread.sleep(2000);
	    return new Editpage(driver);
	}
	
}
