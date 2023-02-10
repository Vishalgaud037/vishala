package day09_operatot;

public class Sample2 {
public static void main(String[] args) {
	int x=15;
	int y=20;
	//&--bitwise and operator
	boolean result=++x<15 & ++y>20;
	System.out.println(x);
	System.out.println(y);
	System.out.println(result);

}
}
//&& is a logical and operator if first condition is
//false
//then it will never execute and second condition

//&-- is a bitwise operator if first condition is false
//still it will execute the second condition