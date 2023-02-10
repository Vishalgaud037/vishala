package samplearray;

import java.util.Arrays;

public class SampleArray {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		System.out.println(num.length);
		System.out.println(Arrays.toString(num));
		System.out.println(4);
		
		for(int i : num) {
			System.out.println(i+5);
		}
		
		
		String[] fruits = {"Mango","apple","Banana"};
		System.out.println(fruits.length);
		System.out.println(Arrays.toString(fruits));
		
		for(int i = 0; i<=fruits.length-1;i++) {
			System.out.println(fruits[i]);
		}
		
		
	}

}
