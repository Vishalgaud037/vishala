package passport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewApplication {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://passport.quiestatechnologies.com/new-passport.php");
		driver.manage().window().maximize();
		WebElement listbox = driver.findElement(By.id("1_application_for"));

		Select select = new Select(listbox);
		select.selectByIndex(0);

		WebElement listbox1 = driver.findElement(By.xpath("//select[@class='form-control select']"));
		Select select1 = new Select(listbox1);
		select1.selectByIndex(1);

		WebElement listbox2 = driver.findElement(By.id("1_type_of_booklet"));
		Select select2 = new Select(listbox2);
		select2.selectByIndex(1);

		WebElement first = driver.findElement(By.id("contact_2_fname"));
		first.sendKeys("vishal");

		WebElement middle = driver.findElement(By.id("txt_middlename"));
		middle.sendKeys("ram");

		driver.findElement(By.name("2_sname")).sendKeys("yadav");

		driver.findElement(By.name("2_aadhar_no")).sendKeys("123456789012");

		WebElement gender = driver.findElement(By.name("2_gender"));
		Select select3 = new Select(gender);
		select3.selectByIndex(2);

		WebElement maritialSt = driver.findElement(By.name("2_marital_status"));
		Select select4 = new Select(maritialSt);
		select4.selectByIndex(4);

		WebElement birth = driver.findElement(By.id("sel_place_birth"));
		Select select5 = new Select(birth);
		select5.selectByIndex(0);

		driver.findElement(By.id("contact_2_village")).sendKeys("wardha");

		WebElement state = driver.findElement(By.id("contact_2_state"));
		Select select6 = new Select(state);
		select6.selectByIndex(21);

		WebElement citizen = driver.findElement(By.id("sel_citizenship"));
		Select select7 = new Select(citizen);
		select7.selectByIndex(1);

		driver.findElement(By.id("txt_pan")).sendKeys("abcdg1254g");

		WebElement edu = driver.findElement(By.id("c_2_qualification"));
		Select select8 = new Select(edu);
		select8.selectByIndex(4);

		WebElement empl = driver.findElement(By.id("sel_emp_type"));
		Select select9 = new Select(empl);
		select9.selectByIndex(1);

		WebElement parent = driver.findElement(By.id("contact_2_sapouse"));
		Select select10 = new Select(parent);
		select10.selectByIndex(2);

		WebElement nonecr = driver.findElement(By.id("contact_2_non_ecr"));
		Select select11 = new Select(nonecr);
		select11.selectByIndex(1);

		driver.findElement(By.id("txt_visible_dmark")).sendKeys("dot ");

		WebElement oName = driver.findElement(By.id("sel_any_aliases"));
		Select select12 = new Select(oName);
		select12.selectByIndex(1);

		driver.findElement(By.id("myform_3_father_f_name")).sendKeys("ramesh");

		driver.findElement(By.id("myform_3_father_m_name")).sendKeys("jantarao");

		driver.findElement(By.id("myform_3_father_l_name")).sendKeys("gaud");

		driver.findElement(By.id("myform_3_mother_f_name")).sendKeys("sandhaya");

		driver.findElement(By.id("myform_3_mother_m_name")).sendKeys("ramesh");

		driver.findElement(By.id("myform_3_mother_l_name")).sendKeys("gaud");

		driver.findElement(By.id("myform_3_gard_f_name")).sendKeys("sandhaya");

		driver.findElement(By.id("myform_3_gard_m_name")).sendKeys("ramesh");

		driver.findElement(By.id("myform_3_gard_l_name")).sendKeys("gaud");

		driver.findElement(By.id("contact_4_house_no")).sendKeys("House No.32 and Shivaji chowk");

		driver.findElement(By.id("contact_4_town")).sendKeys("wardha");

		WebElement statelist = driver.findElement(By.id("state-list"));
		Select select13 = new Select(statelist);
		select13.selectByIndex(21);
		Thread.sleep(10000);
		WebElement dist = driver.findElement(By.id("district-list"));
		Select select14 = new Select(dist);
		select14.selectByIndex(34);

//		WebElement station = driver.findElement(By.id("p_station_list"));
	//	Select select15 = new Select(station);
		//select15.selectByIndex(13);

		driver.findElement(By.id("contact_4_pincode")).sendKeys("442001");

		driver.findElement(By.id("contact_4_mobile")).sendKeys("1478523690");

		driver.findElement(By.id("contact_4_email")).sendKeys("425225@gmail.com");

		WebElement yes=driver.findElement(By.id("sel_permanent_adr"));
		Select select16= new Select(yes);
		select16.selectByIndex(1);
	
	driver.findElement(By.id("contact_5_name_address")).sendKeys("vishal raut, lic colony wardha");
	
	driver.findElement(By.id("contact_5_mobile")).sendKeys("9503858547");
	
	driver.findElement(By.id("email5")).sendKeys("vishal@gmail.com");
	
WebElement	hold=driver.findElement(By.id("sel_identity_cer"));
	Select select17= new Select(hold);
	select17.selectByIndex(1);
	
	WebElement address=driver.findElement(By.id("contact_8_document_proof"));
	Select select18= new Select(address);
	select18.selectByIndex(1);
	
	WebElement id=driver.findElement(By.id("contact_8_id_proof"));
	Select select19= new Select(id);
	select19.selectByIndex(2);
	
	WebElement education=driver.findElement(By.id("contact_8_education_proof"));
	Select select20= new Select(education);
	select20.selectByIndex(2);
	
	WebElement dob=driver.findElement(By.id("contact_8_dob_proof"));
	Select select21= new Select(dob);
	select21.selectByIndex(1);
	
	
	driver.findElement(By.name("address_doc")).sendKeys("D:\\Un\\Testing");
	
	
	driver.findElement(By.name("id_doc")).sendKeys("D:\\Un\\Testing");;
	
	driver.findElement(By.name("education_doc")).sendKeys("D:\\Un\\Testing");;
	
	driver.findElement(By.name("dob_doc")).sendKeys("D:\\Un\\Testing");;
	
	driver.findElement(By.name("submit")).click();
	/*
	 * JavascriptExecutor j= (JavascriptExecutor)driver ;
	 
	for(int i=1;i<=10; i++)
	{
		j.executeScript("window.scrollBy(250,0)");
		
		Thread.sleep(1500);
	}
		*/	{
		
			
		
		
		
	}
	
	
	
	
	
	}

}
