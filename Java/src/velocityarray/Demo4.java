package velocityarray;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		int[] n = new int[5];
		n[0] = 27;
		n[1] = 34;
		n[2] = 20;
		n[3] = 29;
		n[4] = 22;

		System.out.println(n.length);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(Arrays.toString(n));

		System.out.println("........Ascending order..........");

		Arrays.sort(n);
		for (int i = 0; i <= n.length - 1; i++) {
			System.out.println(n[i]);
		}

		System.out.println("........Descending order..........");

		Arrays.sort(n);
		for (int i = n.length - 1; i >= 0; i--) {
			System.out.println(n[i]);
		}
	}

}
