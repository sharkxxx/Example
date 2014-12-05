package demo2.steps;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Attach;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.model.AttachmentType;



public class HomePage {
	final WebDriver driver;
	
	

	@FindBy(xpath = "//button[text()='Процедуры']")
	private WebElement Procedures;

	@FindBy(xpath = "//a[@href='#com/procedure/new']")
	private WebElement New;

	@FindBy(xpath = "//button[.='Выход']")
	private WebElement exitbutton;




	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}


@Step("Нажать кнопку Процедуры")
	public void clickProcedures() {
		Procedures.click();
	}

@Step("Нажать кнопку Новая")
	public void clickProceduresNew() {
		New.click();
	}


@Step ("Нажать кнопку Выход")
	public void clickExitButton() {
	exitbutton.click();
	
	}




	public CreateRequestforProposal CreateNewProc()
	{
		clickProcedures();
		clickProceduresNew();
		return PageFactory.initElements(driver, CreateRequestforProposal.class);
	}

	
	
	
	
	
	public LoginPage logout() throws Exception {
	clickExitButton();
	makeScreenshotDemo2Logout();
	return PageFactory.initElements(driver, LoginPage.class);
	}

	@Attach(type = AttachmentType.PNG)
    public File makeScreenshotDemo2Logout() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    }



}
