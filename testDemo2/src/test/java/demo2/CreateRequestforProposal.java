package demo2;

import org.eclipse.jetty.util.thread.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import com.thoughtworks.selenium.Selenium;




public class CreateRequestforProposal {
	
	
	static WebDriver driver;
	// static Selenium selenium;
	
	// элементы на вкладке общие сведения у процедуры
	 @FindBy(name ="procedure_number2")
	 private WebElement numberOfPurchases; // Номер закупки

	 @FindBy(name = "title")    
	 private WebElement amePurchase;   //  Наименование закупки
		
	 
	 @FindBy(xpath = "//form/fieldset[6]//div[6]//div[1]/table/tbody/tr/td[5]")   
	 private WebElement deadline;   // дата окончания приёма заявок
	 
	 
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[2]/div/input")   
	 private WebElement entryDate;   // ввод дата окончания приёма заявок
	 
	 
	 @FindBy(xpath = "//form/fieldset[6]//div[6]//div[1]/table/tbody/tr/td[6]")   
	 private WebElement timedeadline;   //  время окончания приёма заявок
	
	 @FindBy(xpath = "//fieldset[6]//div[6]/div/div[2]//div[3]/div/input")   
	 private WebElement entryTimeDeadline;   // ввод время окончания приёма заявок
		
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[2]/table/tbody/tr/td[3]/div/span")   
	 private WebElement bidOpeningDate;   // дата вскрытия конвертов
	 
	 @FindBy(css = "input[class='x-form-text x-form-field x-form-focus']")   
	 private WebElement entryBidOpeningDate;   //ввод дата вскрытия конвертов
	
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[2]/table/tbody/tr/td[4]")   
	 private WebElement timeOpeningEnvelopes;   // время вскрытия конвертов
	 
	 @FindBy(xpath = "//fieldset[6]//div/div[1]/div[2]/div[4]/div/input")   
	 private WebElement entryTimeOpeningEnvelopes;   // ввод время  вскрытия конвертов
	 
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[3]/table/tbody/tr/td[5]")   
	 private WebElement endDateOfSummarizing;   // дата окончания подведения итогов
	
	 @FindBy(xpath = "//fieldset[6]//div[6]/div/div[2]//div[1]/div[2]/div[2]/div/input")   
	 private WebElement entryEndDateOfSummarizing;   // ввод дата окончания подведения итогов
	 
	 @FindBy(xpath = "//form/fieldset[6]//div[6]//div[3]/table/tbody/tr/td[6]")   
	 private WebElement timeSummarizing;   // время окончания подведения итогов
	 
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[2]/div[3]/div/input")   
	 private WebElement entryTimeSummarizing;   //ввод время окончания подведения итогов
	 
	 @FindBy(name = "send_to_oos")   
	private  WebElement sendToOos;   // передать процедуру на оос
	 
	 @FindBy(xpath = ".//fieldset[8]//div[2]//div[2]//div[1]//div[1]/input")   
	 private WebElement fileDocumentation;  //описание файла документации
	 	 
	 @FindBy(xpath = "//fieldset[8]//input[@class='x-form-file']")  
	 private WebElement uploadFileDocumentation;  //загрузка файла документации
	
	 @FindBy(xpath = "//button[text()='Подписать и опубликовать']")   
	 private WebElement signAndPromulgate;  //подписать и опубликовать
	 
	 @FindBy(xpath = "//button[text()='Да']")   
	 private WebElement confirmWithoutOos;  //подтвердить без оос
	 
	 @FindBy(xpath = "//button[text()='Подписать']")   
	 private WebElement subscribe;  //Подписать
	 
	// вкладка лот(предмет договора)
	 
	 @FindBy(xpath = "//span[.='Лот 1']")   
	 private WebElement lot;  //Переход на вкладку Лот

	 @FindBy(xpath = "//span[.='Предмет договора']")   
	 private WebElement subjectOfContract;  //Переход на вкладку Предмет договора
	 
	 @FindBy(name = "subject")   
	 private WebElement subjectField;  //поле Предмет договора
	 
	 @FindBy(name = "no_price_reason")   
	 private WebElement startingPrice;  //поле причина отсутствия начальной цены
	 
	 @FindBy(xpath = "//fieldset[3][@class=' x-fieldset x-form-label-left']//em/button[text()='Добавить']")   
	 private WebElement okdp;  //ОКДП
	 
	 @FindBy(xpath = "//a[.='1200000 РУДЫ РАДИОАКТИВНЫЕ']")   
	 private WebElement selectOKDP;  //выбор ОКДП
	 
	 @FindBy(xpath = "//div[@class='x-window-br']//button[text()='Выбрать']")   
	 private WebElement confirmOKDP;  //подтвердить ОКДП
	 
	 
	 @FindBy(xpath = "//fieldset[4][@class=' x-fieldset x-form-label-left']//em/button[text()='Добавить']")   
	 private WebElement okved;  //ОКВЭД
	 
	 @FindBy(xpath = "//a[.='17 ТЕКСТИЛЬНОЕ ПРОИЗВОДСТВО']")   
	 private WebElement selectOKVED;  //выбор ОКВЭД
	 
	 @FindBy(xpath = "//div[@class='x-window-br']//button[text()='Выбрать']")   
	 private WebElement confirmOKVED;  //подтвердить ОКВЭД
	 

	 @FindBy(name = "name")   
	 private WebElement descriptionOfGoods;  //Наименование товара/услуги 
	 
	// вкладка лот(условия договора)
	 
	 @FindBy(xpath = "//a[.='Условия договора']")   
	 private WebElement termsOfAnAgreement;  //Переход на вкладку Условия договора
	 
	 @FindBy(xpath = "//textarea[@name = 'quantity']")   
	 private  WebElement goods;  //поле Количество поставляемого товара/объем 
	 
	 @FindBy(name = "term")   
	 private WebElement term;  //поле Условия оплаты и поставки товаров/выполнения 
	 
	 @FindBy(name = "address")   
	 private WebElement address;  //поле Место поставки товаров / выполнения работ  
	 
	 
	 
	public CreateRequestforProposal(WebDriver driver) {
		
		this.driver=driver;
	}

	//общие сведения у процедуры
	public void overview() {
		
		numberOfPurchases.sendKeys("23423434343423");
		amePurchase.sendKeys("Запрос предложений ");
		sendToOos.click();
	//	FileDocumentation.sendKeys("Файл1");
		
		
				
	}
	
	
	

	//установка даты и времени окончания приёма заявок
	public void receiptOfApplications(){
		deadline.click();
		entryDate.sendKeys("15.05.2014", Keys.ENTER);
		timedeadline.click();
		entryTimeDeadline.sendKeys("18:50");
		}
	
	//установка даты и времени начала вскрытия конвертов
	
	public void theEnvelopes(){
	//	bidOpeningDate.click();
	//	entryBidOpeningDate.clear();
		//entryBidOpeningDate.sendKeys("13.05.2014", Keys.ENTER);
		timeOpeningEnvelopes.click();
		entryTimeOpeningEnvelopes.clear();
		entryTimeOpeningEnvelopes.sendKeys("18:50");
		}
	
	//установка даты и времени окончания подведения итогов
	public void summingUp(){
		endDateOfSummarizing.click();
	//	EntryEndDateOfSummarizing.clear();
		entryEndDateOfSummarizing.sendKeys("15.05.2014",Keys.ENTER);
		timeSummarizing.click();
		entryTimeSummarizing.sendKeys("15:00");
		}
	
	
	//Загрузка документа
	public void fileUpload() {
		
		fileDocumentation.sendKeys("Файл1");
		File file=new File("C:\\Users\\пользователь 2\\Downloads\\ГП312065_applic_open_protocol_lot_4839.rtf");
	//	uploadFileDocumentation.sendKeys(file.getAbsolutePath());			
	//	driver.findElement(By.xpath("//fieldset[8]//input[@class='x-form-file']")).sendKeys(file.getAbsolutePath());
		
		try {
			Thread.sleep(200);
							uploadFileDocumentation.sendKeys(file.getAbsolutePath());
						} catch (InterruptedException e) {
							
							e.printStackTrace();}	
				
			} 
					
					
		
     		
		
	
	
	// вкладка лот(предмет договора)
	public void lotSubjectOfTheContract(){
		lot.click();
		subjectOfContract.click();
		subjectField.sendKeys("Товар");
		startingPrice.sendKeys("Нет");
		okdp.click();
		selectOKDP.click();
		confirmOKDP.click();
		okved.click();
		selectOKVED.click();
		confirmOKVED.click();
		 descriptionOfGoods.sendKeys("товар");
		 termsOfAnAgreement.click();
		 
	}
	
	// вкладка лот(условия договора)
	public void termsOfAnAgreement(){
		termsOfAnAgreement.click();
		goods.sendKeys("согласно договору");
		term.sendKeys("согласно договору");
		address.sendKeys("согласно договору");
			
				}
	// подписать и опубликовать
	public void subscribe(){
		signAndPromulgate.click();
		confirmWithoutOos.click();
		subscribe.click();
	}
	
	
	
	
		
		public HomePage CreateProc()
		
		{   
			overview ();
			fileUpload();
			receiptOfApplications();
			theEnvelopes();
			summingUp();
			lotSubjectOfTheContract();
			termsOfAnAgreement();
			subscribe();
			
			return PageFactory.initElements(driver, HomePage.class);
		}
		
		
	

}
