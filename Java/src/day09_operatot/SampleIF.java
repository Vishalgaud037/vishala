package day09_operatot;

public class SampleIF {
	public static void main(String[] args) {
		int age = 16;
		char gender='F';
		
		if (age >= 18 && gender=='M') {
			System.out.println("eligigble to vote");
		} else {
			System.out.println("not eligible to vote");
		}
	}
}
