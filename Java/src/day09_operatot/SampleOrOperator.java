package day09_operatot;

public class SampleOrOperator {
	public static void main(String[] args) {
		int x = 14;
		int y = 13;
		boolean result = x++ >= ++y | ++x >= y++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(result);
	}
}
//unary !