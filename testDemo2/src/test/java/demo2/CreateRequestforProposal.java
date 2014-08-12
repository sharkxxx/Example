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
	
	// �������� �� ������� ����� �������� � ���������
	 @FindBy(name ="procedure_number2")
	 private WebElement numberOfPurchases; // ����� �������

	 @FindBy(name = "title")    
	 private WebElement amePurchase;   //  ������������ �������
		
	 
	 @FindBy(xpath = "//form/fieldset[6]//div[6]//div[1]/table/tbody/tr/td[5]")   
	 private WebElement deadline;   // ���� ��������� ����� ������
	 
	 
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[2]/div/input")   
	 private WebElement entryDate;   // ���� ���� ��������� ����� ������
	 
	 
	 @FindBy(xpath = "//form/fieldset[6]//div[6]//div[1]/table/tbody/tr/td[6]")   
	 private WebElement timedeadline;   //  ����� ��������� ����� ������
	
	 @FindBy(xpath = "//fieldset[6]//div[6]/div/div[2]//div[3]/div/input")   
	 private WebElement entryTimeDeadline;   // ���� ����� ��������� ����� ������
		
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[2]/table/tbody/tr/td[3]/div/span")   
	 private WebElement bidOpeningDate;   // ���� �������� ���������
	 
	 @FindBy(css = "input[class='x-form-text x-form-field x-form-focus']")   
	 private WebElement entryBidOpeningDate;   //���� ���� �������� ���������
	
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[2]/table/tbody/tr/td[4]")   
	 private WebElement timeOpeningEnvelopes;   // ����� �������� ���������
	 
	 @FindBy(xpath = "//fieldset[6]//div/div[1]/div[2]/div[4]/div/input")   
	 private WebElement entryTimeOpeningEnvelopes;   // ���� �����  �������� ���������
	 
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[3]/table/tbody/tr/td[5]")   
	 private WebElement endDateOfSummarizing;   // ���� ��������� ���������� ������
	
	 @FindBy(xpath = "//fieldset[6]//div[6]/div/div[2]//div[1]/div[2]/div[2]/div/input")   
	 private WebElement entryEndDateOfSummarizing;   // ���� ���� ��������� ���������� ������
	 
	 @FindBy(xpath = "//form/fieldset[6]//div[6]//div[3]/table/tbody/tr/td[6]")   
	 private WebElement timeSummarizing;   // ����� ��������� ���������� ������
	 
	 @FindBy(xpath = "//fieldset[6]//div[6]//div[2]/div[3]/div/input")   
	 private WebElement entryTimeSummarizing;   //���� ����� ��������� ���������� ������
	 
	 @FindBy(name = "send_to_oos")   
	private  WebElement sendToOos;   // �������� ��������� �� ���
	 
	 @FindBy(xpath = ".//fieldset[8]//div[2]//div[2]//div[1]//div[1]/input")   
	 private WebElement fileDocumentation;  //�������� ����� ������������
	 	 
	 @FindBy(xpath = "//fieldset[8]//input[@class='x-form-file']")  
	 private WebElement uploadFileDocumentation;  //�������� ����� ������������
	
	 @FindBy(xpath = "//button[text()='��������� � ������������']")   
	 private WebElement signAndPromulgate;  //��������� � ������������
	 
	 @FindBy(xpath = "//button[text()='��']")   
	 private WebElement confirmWithoutOos;  //����������� ��� ���
	 
	 @FindBy(xpath = "//button[text()='���������']")   
	 private WebElement subscribe;  //���������
	 
	// ������� ���(������� ��������)
	 
	 @FindBy(xpath = "//span[.='��� 1']")   
	 private WebElement lot;  //������� �� ������� ���

	 @FindBy(xpath = "//span[.='������� ��������']")   
	 private WebElement subjectOfContract;  //������� �� ������� ������� ��������
	 
	 @FindBy(name = "subject")   
	 private WebElement subjectField;  //���� ������� ��������
	 
	 @FindBy(name = "no_price_reason")   
	 private WebElement startingPrice;  //���� ������� ���������� ��������� ����
	 
	 @FindBy(xpath = "//fieldset[3][@class=' x-fieldset x-form-label-left']//em/button[text()='��������']")   
	 private WebElement okdp;  //����
	 
	 @FindBy(xpath = "//a[.='1200000 ���� �������������']")   
	 private WebElement selectOKDP;  //����� ����
	 
	 @FindBy(xpath = "//div[@class='x-window-br']//button[text()='�������']")   
	 private WebElement confirmOKDP;  //����������� ����
	 
	 
	 @FindBy(xpath = "//fieldset[4][@class=' x-fieldset x-form-label-left']//em/button[text()='��������']")   
	 private WebElement okved;  //�����
	 
	 @FindBy(xpath = "//a[.='17 ����������� ������������']")   
	 private WebElement selectOKVED;  //����� �����
	 
	 @FindBy(xpath = "//div[@class='x-window-br']//button[text()='�������']")   
	 private WebElement confirmOKVED;  //����������� �����
	 

	 @FindBy(name = "name")   
	 private WebElement descriptionOfGoods;  //������������ ������/������ 
	 
	// ������� ���(������� ��������)
	 
	 @FindBy(xpath = "//a[.='������� ��������']")   
	 private WebElement termsOfAnAgreement;  //������� �� ������� ������� ��������
	 
	 @FindBy(xpath = "//textarea[@name = 'quantity']")   
	 private  WebElement goods;  //���� ���������� ������������� ������/����� 
	 
	 @FindBy(name = "term")   
	 private WebElement term;  //���� ������� ������ � �������� �������/���������� 
	 
	 @FindBy(name = "address")   
	 private WebElement address;  //���� ����� �������� ������� / ���������� �����  
	 
	 
	 
	public CreateRequestforProposal(WebDriver driver) {
		
		this.driver=driver;
	}

	//����� �������� � ���������
	public void overview() {
		
		numberOfPurchases.sendKeys("23423434343423");
		amePurchase.sendKeys("������ ����������� ");
		sendToOos.click();
	//	FileDocumentation.sendKeys("����1");
		
		
				
	}
	
	
	

	//��������� ���� � ������� ��������� ����� ������
	public void receiptOfApplications(){
		deadline.click();
		entryDate.sendKeys("15.05.2014", Keys.ENTER);
		timedeadline.click();
		entryTimeDeadline.sendKeys("18:50");
		}
	
	//��������� ���� � ������� ������ �������� ���������
	
	public void theEnvelopes(){
	//	bidOpeningDate.click();
	//	entryBidOpeningDate.clear();
		//entryBidOpeningDate.sendKeys("13.05.2014", Keys.ENTER);
		timeOpeningEnvelopes.click();
		entryTimeOpeningEnvelopes.clear();
		entryTimeOpeningEnvelopes.sendKeys("18:50");
		}
	
	//��������� ���� � ������� ��������� ���������� ������
	public void summingUp(){
		endDateOfSummarizing.click();
	//	EntryEndDateOfSummarizing.clear();
		entryEndDateOfSummarizing.sendKeys("15.05.2014",Keys.ENTER);
		timeSummarizing.click();
		entryTimeSummarizing.sendKeys("15:00");
		}
	
	
	//�������� ���������
	public void fileUpload() {
		
		fileDocumentation.sendKeys("����1");
		File file=new File("C:\\Users\\������������ 2\\Downloads\\��312065_applic_open_protocol_lot_4839.rtf");
	//	uploadFileDocumentation.sendKeys(file.getAbsolutePath());			
	//	driver.findElement(By.xpath("//fieldset[8]//input[@class='x-form-file']")).sendKeys(file.getAbsolutePath());
		
		try {
			Thread.sleep(200);
							uploadFileDocumentation.sendKeys(file.getAbsolutePath());
						} catch (InterruptedException e) {
							
							e.printStackTrace();}	
				
			} 
					
					
		
     		
		
	
	
	// ������� ���(������� ��������)
	public void lotSubjectOfTheContract(){
		lot.click();
		subjectOfContract.click();
		subjectField.sendKeys("�����");
		startingPrice.sendKeys("���");
		okdp.click();
		selectOKDP.click();
		confirmOKDP.click();
		okved.click();
		selectOKVED.click();
		confirmOKVED.click();
		 descriptionOfGoods.sendKeys("�����");
		 termsOfAnAgreement.click();
		 
	}
	
	// ������� ���(������� ��������)
	public void termsOfAnAgreement(){
		termsOfAnAgreement.click();
		goods.sendKeys("�������� ��������");
		term.sendKeys("�������� ��������");
		address.sendKeys("�������� ��������");
			
				}
	// ��������� � ������������
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
