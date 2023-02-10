package day4;
class B
{
	static {
		System.out.println("hi");
	}
	static {
		System.out.println("namste");
	}
	public static void testB() {
		System.out.println("testB");
	}
}
public class Demo3 {
public static void main(String[] args) {
	
	System.out.println("hello");
	B.testB();
	B.testB();
	
	/*
	 * hello 
	 * hi
	 * namste
	 * testB
	 * testB
	 */


}
}
