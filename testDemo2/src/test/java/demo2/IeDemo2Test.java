package demo2;

import java.io.File;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.thoughtworks.selenium.Selenium;


public class IeDemo2Test {
	
	
	public  WebDriver driver;
	 public Selenium selenium;
	private static String login = "kriogen";
	private static String pass = "kriogen";
	
	
	
	
	@Before
	public void setUp() throws Exception {
	//driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver","C:\\selenium-2.41.0\\IEDriverServer2.39.exe");
		 driver=new InternetExplorerDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	try{
		 
		File file = new File("C:\\Users\\пользователь 2\\workspace\\screen\\testIE.png");

		if(file.delete()){
			System.out.println(file.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation is failed.");
		}

	} catch(Exception e){
		 
		e.printStackTrace();

	
	}
	}
	
	@Test
	public void testIE() throws Exception {
	driver.get("https://demo2.etpgpb.ru/#auth/login");
	
   LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	CreateRequestforProposal RequestforProposal=PageFactory.initElements(driver, CreateRequestforProposal.class);
	HomePage homePage = loginPage.login(login, pass);
	CreateRequestforProposal new_proc= homePage.CreateNewProc();
	
	HomePage  create_proc= RequestforProposal.CreateProc();
	LoginPage loginPageAfterLogout = homePage.logout();
	
	}
	
	@After
	public void tearDown() throws Exception {
		{
			try {
			File scrFile =
			((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new
			File("C:\\Users\\пользователь 2\\workspace\\screen\\testIE.png"));
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
	driver.quit();
	
	}
	
	
	 

	
	
	
	

}
