package day25;
/* what is Encapsulation?
* binding data member (variable) with member function (method) to behave as a single unit 
* 
* How to we achieve it?
*  by hiding the data and providing req access through getter & setter method
* 
* in encapsulation we follow 3 steps
* 
* 1. declaration - private
* 2. initialization - constructor
* 3. utilization - method
*/
class A
{
	private int i;//declaration
	
	A()
	{
		i=10;//initialization
	}
	
	void getValue() 
	{
		System.out.println(i);//utilization
	}	
}
public class Demo2 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.getValue();
//		a1.i=1000;
	}
}
