package day25;

import java.util.Scanner;

/*
 * oops
 * class -blue print; collection of DM (v) +MF (m)
 * object- instance
 * inh--parent to child 
 * poly-object behave diff under diff situation --methods overloading & overriding
 * enc
 * abstraction-hiding implementation details and showing only functionality
 * 
 * example
 * class-ChromeDriver,FireFoxDriver Actions select
 * object--new ChromeDriver(), new Actions(driver);new Select listBox
 * inheritance --RemoteWebDriver --FireFoxDriver
 * 
 * method overloading-driver.navigate.to(arg1);
 * driver.switchTo.frame(arg1);int String
 * 
 * overriding
 * all the method in selenium are overridden
 * wrapping up data and method together
 * 
 * what is encapsulation?
 * binding data member (variable)with member function(method) to behave as a single unit
 * 
 * how to we achieve it?
 * by hidning the data and providing req access through getter and setter method
 * 
 * in encapsulation we follow 3 steps
 * 
 * 1.declartion-private
 * initialization --constructor
 * utilization--method
 * 
 */
class Account
{
	private static int count;
	private String aNumber;
	private int balance;
	private String aPwd;
	private String aName;
	
	Account(String name,int initialAmount,String newPwd)
	{
		count++;
		aName=name;
		balance=initialAmount;
		aNumber="A"+count;
		aPwd=newPwd;
		
	}
	
	public void printBalance() 
	{
		System.out.println("Print Balance");
		if(verifyUser()) {
			System.out.println("Balance is:"+balance);
		}
		else 
		{
			System.out.println("not authorised! sorry");
		}
	}
	
	public void printAccountNumberAndName() 
	{
		System.out.println("Print A/C & name");
		if(verifyUser()) {
			System.out.println("A/c No is:"+aNumber);
			System.out.println("Name is:"+aName);
		}
		else 
		{
			System.out.println("not authorised! sorry");
		}
	}
	private boolean verifyUser() 
	{
		System.out.println("Please enter ur PIN:");
		Scanner sc=new Scanner(System.in);
		String pwd=sc.nextLine();
		return pwd.equals(aPwd);
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		Account bhanuAccount=new Account("Bhanu",1000,"ABC");

//		bhanuAccount.balance=100000;
		bhanuAccount.printAccountNumberAndName();
		bhanuAccount.printBalance();

		Account akashAccount=new Account("Akash",10000,"XYZ");
		akashAccount.printAccountNumberAndName();
		akashAccount.printBalance();
	}

}