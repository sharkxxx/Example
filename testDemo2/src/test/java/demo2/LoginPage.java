package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	public WebDriver driver;

	
	@FindBy(name = "username")
	private WebElement loginField;

	@FindBy(name = "pass")
	private WebElement passwordField;

	@FindBy(className = "x-btn-mc")
	private WebElement submitButton;
	
	@FindBy(xpath = "//button[.='�����']")
	private WebElement exitbutton;

	@FindBy(css = ".ext-mb-text")
	private WebElement errorBox;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void logout(){
		
		if(driver.findElements(By.xpath("//button[.='�����']")).isEmpty()){
			System.out.println("������ ������������ kriogen �� �������, ������ �����");
		} else {
			System.out.println("������ ������������ kriogen  �������, �����");
			driver.findElement(By.xpath("//button[.='�����']")).click();
			
			
		}
		
		
	}
	

	
	public void enterLogin(String login) {
				
		loginField.clear();
		loginField.sendKeys("kriogen");
	}

	public void enterPassword(String password) {
		passwordField.clear();
		passwordField.sendKeys("kriogen");

	}

	public void clickLoginButton() {
		submitButton.click();
		}

	public HomePage login(String login, String password) throws Exception {
		logout();
		enterLogin(login);
		enterPassword(password);
		clickLoginButton();
		return PageFactory.initElements(driver, HomePage.class);
		}

	
	 

	

	














}
