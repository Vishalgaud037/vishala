package day09_operatot;

public class SampleIfElseIfStatement {
public static void main(String[] args) {
	int avg=60;
	if(avg>=85) {
		System.out.println("distinction");
	}
	else if(avg>=75 && avg<85)
		
	{
		System.out.println("first class");
	}
	else if(avg>=60 && avg<75)
		
	{
		System.out.println("second class");
	}
	else if(avg>=35 && avg<60)
		
	{
		System.out.println("pass class");
	}
	else
	{
		System.out.println("fail");
	}
}
}
