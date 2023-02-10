package passport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReIssueApplication {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://passport.quiestatechnologies.com/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Reissue Passport']")).click();

		WebElement Reissue = driver.findElement(By.id("sel_type_appl"));
		Select select = new Select(Reissue);
		select.selectByIndex(0);

		WebElement booklet = driver.findElement(By.id("1_type_of_booklet"));
		Select select1 = new Select(booklet);
		select1.selectByIndex(0);

		driver.findElement(By.id("rad_reissue_reason")).click();

		driver.findElement(By.id("txt_expiry_date")).sendKeys("11012021");

		driver.findElement(By.id("contact_2_fname")).sendKeys("roshan");

		driver.findElement(By.id("txt_middlename")).sendKeys("ram");

		driver.findElement(By.id("txt_lastname")).sendKeys("mithal");

		driver.findElement(By.id("txt_aadharno")).sendKeys("123456789012");

		WebElement gender = driver.findElement(By.id("contact_2_gender"));
		Select select2 = new Select(gender);
		select2.selectByIndex(1);

		WebElement mart = driver.findElement(By.id("contact_2_marital_status"));
		Select select3 = new Select(mart);
		select3.selectByIndex(1);

		driver.findElement(By.id("contact_2_dob")).sendKeys("27031996");

		driver.findElement(By.id("contact_2_village")).sendKeys("wardha");

		WebElement state = driver.findElement(By.id("contact_2_state"));
		Select select4 = new Select(state);
		select4.selectByIndex(21);

		WebElement district = driver.findElement(By.id("contact_2_district"));
		Select select5 = new Select(district);
		select5.selectByVisibleText("Wardha");

		driver.findElement(By.id("txt_pan")).sendKeys("CJGPI1547P");

		WebElement educ = driver.findElement(By.id("c_2_qualification"));
		Select select6 = new Select(educ);
		select6.selectByIndex(4);// "Wardha");

		WebElement emply = driver.findElement(By.id("sel_emp_type"));
		Select select7 = new Select(emply);
		select7.selectByIndex(2);

		WebElement emp = driver.findElement(By.id("contact_2_sapouse"));
		Select select8 = new Select(emp);
		select8.selectByIndex(2);

		WebElement non_ecr = driver.findElement(By.id("contact_2_non_ecr"));
		Select select9 = new Select(non_ecr);
		select9.selectByIndex(2);

		// family details
		driver.findElement(By.id("myform_3_father_f_name")).sendKeys("ramesh");

		driver.findElement(By.id("myform_3_father_m_name")).sendKeys("jamu");

		driver.findElement(By.id("myform_3_father_l_name")).sendKeys("gaikwad");

		driver.findElement(By.id("myform_3_mother_f_name")).sendKeys("kanti");

		driver.findElement(By.id("myform_3_mother_m_name")).sendKeys("ramesh");

		driver.findElement(By.id("myform_3_mother_l_name")).sendKeys("gaikwad");

		// present residential address
		driver.findElement(By.id("contact_4_house_no")).sendKeys("house no.43 & nalwadi chowk");

		driver.findElement(By.id("contact_4_town")).sendKeys("hinjewadi");

		WebElement state1 = driver.findElement(By.id("state-list"));

		Select select10 = new Select(state1);

		select10.selectByIndex(21);

		WebElement district1 = driver.findElement(By.id("district-list"));

		Select select11 = new Select(district1);

		select11.selectByVisibleText("Wardha");
		
		WebElement pst = driver.findElement(By.id("p_station_list"));

		Select select12 = new Select(pst);

		select12.selectByVisibleText("WARDHA CITY");

		driver.findElement(By.id("contact_4_pincode")).sendKeys("442001");
		
		driver.findElement(By.id("contact_4_mobile")).sendKeys("4421212401");

		driver.findElement(By.id("contact_4_email")).sendKeys("vishalroy@gmail.com");

		//emergency contact
		
	driver.findElement(By.id("contact_5_name_address")).sendKeys("royy & roy house");
	
	driver.findElement(By.id("contact_5_mobile")).sendKeys("7845127849");
	
	driver.findElement(By.id("email5")).sendKeys("rosjo@gmal.com");
	
	//previous passport
	driver.findElement(By.id("contact_6_r_passport_no")).sendKeys("12347856");
	
	driver.findElement(By.id("contact_6_r_issue_no")).sendKeys("27021998");

	driver.findElement(By.id("txt_pc_exp_date")).sendKeys("28042021");
	
	driver.findElement(By.id("txt_passport_office")).sendKeys("nagpur");
	
	//document
	WebElement add=driver.findElement(By.id("contact_8_document_proof"));
	Select select13= new Select(add);
	select13.selectByIndex(1);
	
	WebElement id=driver.findElement(By.id("contact_8_id_proof"));
	Select select14= new Select(id);
	select14.selectByIndex(2);
	
	WebElement edu=driver.findElement(By.id("contact_8_education_proof"));
	Select select15= new Select(edu);
	select15.selectByIndex(4);
	
	WebElement dob=driver.findElement(By.id("contact_8_dob_proof"));
	Select select16= new Select(dob);
	select16.selectByIndex(2);
	
	driver.findElement(By.name("address_doc")).sendKeys("D:\\\\Un\\\\Testing");
	
	driver.findElement(By.name("id_doc")).sendKeys("D:\\\\Un\\\\Testing");

	driver.findElement(By.name("education_doc")).sendKeys("D:\\\\Un\\\\Testing");

	driver.findElement(By.name("dob_doc")).sendKeys("D:\\\\Un\\\\Testing");

	driver.findElement(By.name("submit")).click();
	
	
	
	
	}
}
