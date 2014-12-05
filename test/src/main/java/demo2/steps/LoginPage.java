package demo2.steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Attach;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.model.AttachmentType;


public class LoginPage {
	public WebDriver driver;

	
	@FindBy(name = "username")
	private WebElement loginField;

	@FindBy(name = "pass")
	private WebElement passwordField;

	@FindBy(className = "x-btn-mc")
	private WebElement submitButton;
	
	@FindBy(xpath = "//button[.='Выход']")
	private WebElement exitbutton;

	@FindBy(css = ".ext-mb-text")
	private WebElement errorBox;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void logout(){
		
		if(driver.findElements(By.xpath("//button[.='Выход']")).isEmpty()){
			System.out.println("Сессия пользователя  не активна, начало новой");
		} else {
			System.out.println("Сессия пользователя   активна, выйти");
			driver.findElement(By.xpath("//button[.='Выход']")).click();
			
			
		}
		
		
	}
	
	
	

	@Step("Ввод логина")
	public void enterLogin(String login) {
				
		loginField.clear();
		loginField.sendKeys("*****");
	}
	
	@Step("Ввод пароля")
	public void enterPassword(String password) {
		passwordField.clear();
		passwordField.sendKeys("*****");

	}
	
	@Step("Нажатие кнопки вход")
	public void clickLoginButton() {
		submitButton.click();
		}
	@Step("Авторизация на площадке")
	public HomePage login(String login, String password) throws Exception {
		logout();
		enterLogin(login);
		enterPassword(password);
		clickLoginButton();
		makeScreenshotDemo2Autorization();
		return PageFactory.initElements(driver, HomePage.class);
		}

	@Attach(type = AttachmentType.PNG)
    public File makeScreenshotDemo2Autorization() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    }

}
