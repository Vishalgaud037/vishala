package day7_method_basis;
//instead of creating object and calling with object reference 
// i am using static to call method directly
public class Printer
{
	int price;
static void print() {
	System.out.println("hello world");
}
public static void main(String[] args) {
	print();
	print();	
	print();
} }
