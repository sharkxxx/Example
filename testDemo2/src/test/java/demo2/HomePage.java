package demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	final WebDriver driver;
	
	@FindBy(xpath = "//a/img")
	private WebElement logo;

	@FindBy(xpath = "//button[text()='Процедуры']")
	private WebElement Procedures;

	@FindBy(xpath = "//a[@href='#com/procedure/new']")
	private WebElement New;

	@FindBy(xpath = "//button[.='Выход']")
	private WebElement exitbutton;




	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}



	public void clickProcedures() {
		Procedures.click();
	}

	public void clickProceduresNew() {
		New.click();
	}



	public void clickExitButton() {
	exitbutton.click();
	}




	public CreateRequestforProposal CreateNewProc()
	{
		clickProcedures();
		clickProceduresNew();
		return PageFactory.initElements(driver, CreateRequestforProposal.class);
	}

	public LoginPage logout() {
	clickExitButton();
	return PageFactory.initElements(driver, LoginPage.class);
	}





}
