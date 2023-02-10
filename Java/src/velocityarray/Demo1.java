package velocityarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int[] num = new int[5]; // Declaration

		// initialization
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		System.out.println(num.length);
		System.out.println(num[1]);
		System.out.println(Arrays.toString(num));

		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println(i);

		}

		for (int i = 0; i <= 4; i++) {
			System.out.println(i);
		}
		
		for(int i:num) {
			System.out.println(i);
		}

	}

}
