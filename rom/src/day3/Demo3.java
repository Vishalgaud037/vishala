package day3;
/*
 * After up-casting if u call a method which is
 * present in both parent and it always execute
 * child method
 * 
 */
class parent {
	void hi() {
		System.out.println("hi");
	}
}
class child extends parent
{
	void hi() {
		System.out.println("hello");
	}
}
public class Demo3 {
public static void main(String[] args) {
//	 par;
	
	 parent par= new child();
	
	par.hi();
}
}
