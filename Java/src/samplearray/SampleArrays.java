package samplearray;

import java.util.Arrays;

public class SampleArrays {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		System.out.println(nums.length);
		System.out.println(Arrays.toString(nums));

		for (int i : nums) {
			System.out.println(i + 10);
			
		}

	}

}
