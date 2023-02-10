package day3;

class A {
	static void testA(String s) {
		System.out.println(s);
	}

	static void testA(int i) {
		System.out.println(i);
	}
}

class B {
	static void testB(Object obj) {
		System.out.println(obj);
	}
}

public class Demo2 {
	public static void main(String[] args) {
		A.testA("bhanu");
		A.testA(123);

		B.testB("bhanu");
		B.testB(123);
		B.testB(true);
	}
}
