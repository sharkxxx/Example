package demo2.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;




public class AutomationDate {
	

	public static  Date today;
	public static String date_bid;
	public static String date_open;
	public static String itogi_date;
	public static String time_bid;
	public static String open_time;
	public static String itogi_time;
	
	DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	
	{
	
	
		// Дата окончания приёма заявок
				 today = new Date();
				
//				date_bid="25.06.2014";
			   //	String date_bid;
				date_bid=today.toString();
				date_bid=dateFormat.format(today);
			 //   System.out.println(" Date today :" + date_bid);
				
			   
				
				
			    // Дата начала вскрытия конвертов
				
			      
					
//				String date_open;
				date_open=today.toString();
				date_open= dateFormat.format(today);
//				System.out.println(" Date open :" + date_open);
				
				
				 // Дата окончания подведения итогов
				      
				Date itogi = new DateTime(today).plusDays(1).toDate();
						
						
				//String date_itogi;
				itogi_date=itogi.toString();
				itogi_date=dateFormat.format(itogi);
//				System.out.println(" Date itogi :" + itogi_date);
						
						
				
				
				 
				//время окончания приёма заявок
				LocalTime priem_time = LocalTime.now().plusMinutes(15);
				
				DateTimeFormatter fmtp = DateTimeFormat.forPattern("HH:mm");
				//String time_bid = priem_time.toString(fmtp);
				time_bid = priem_time.toString(fmtp);
				
				// System.out.println(" Time today :" + time_bid);
				 
				 
				 //время начала вскрытия конвертов
				 
				 LocalTime time_open =  LocalTime.now().plusMinutes(20);
				 DateTimeFormatter fmto = DateTimeFormat.forPattern("HH:mm");
				  open_time = time_open.toString(fmto);
//				 System.out.println(" Time opening :" + open_time);
				 
				 
				 
				 
				// время окончания подведения итогов
				 LocalTime time_itogi =  LocalTime.now().plusMinutes(30);
				 DateTimeFormatter fmti = DateTimeFormat.forPattern("HH:mm");
				  itogi_time = time_itogi.toString(fmti);
				// System.out.println(" Time itogi :" + itogi_time);
				   
			   
	   
	
	
}
	
}
