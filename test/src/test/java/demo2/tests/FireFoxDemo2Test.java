﻿package demo2.tests;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import com.thoughtworks.selenium.Selenium;
import demo2.steps.MakeScreen;
import demo2.steps.CreateRequestforProposal;
import demo2.steps.HomePage;
import demo2.steps.LoginPage;
import demo2.steps.applications.ApplyingForRequestForProposals;


public class FireFoxDemo2Test extends MakeScreen   {

	
	
	 public  WebDriver driver;
	 public Selenium selenium;
	 private static String login = "";
	 private static String pass = "";

	
	
	
	@Before
	public void setUp() throws Exception {
		
	driver = new FirefoxDriver();
	
		//System.setProperty("webdriver.ie.driver","C:\\selenium-2.41.0\\IEDriverServer2.39.exe");
		// driver=new InternetExplorerDriver();
		 
		// System.setProperty("webdriver.chrome.driver","C:\\selenium-2.41.0\\chromedriver2.9.exe");
	
		// driver=new ChromeDriver();
	//	 steps = new WebDriverSteps(
	  //              new FirefoxDriver(new DesiredCapabilities())
	   //     );
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	try{
		 
		File file = new File("C:\\Users\\пользователь 2\\workspace\\screen\\testFireFox.png");

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
	public void testFireFox() throws Exception {
	driver.get("*************");
	
   LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	CreateRequestforProposal RequestforProposal=PageFactory.initElements(driver, CreateRequestforProposal.class);
	HomePage homePage = loginPage.login(login, pass);
	CreateRequestforProposal new_proc= homePage.CreateNewProc();
	HomePage  create_proc= RequestforProposal.CreateProc();
	LoginPage loginPageAfterLogout = homePage.logout();
	}
	
	//@Attach(type = AttachmentType.PNG)
  // public File makeScreenshotDemo() {
   //    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  // }
	
	
	
	@After
		
	public void tearDown() throws Exception {
		{
			try {
				
						File scrFile =
						((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(scrFile, new
						File("C:\\Users\\пользователь 2\\workspace\\screen\\testFireFox.png"));
						
						
			//	makeScreenshotDemo();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
		driver.quit();
	}
	
	
}
