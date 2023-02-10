package samplearray;

import java.util.Arrays;

public class SampleArraysPrint {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		System.out.println(nums);
		System.out.println(nums.length);
		System.out.println(nums[2]);
		System.out.println(Arrays.toString(nums));
		
		System.out.println("................");
		
		for (int i : nums) {
			System.out.println(i+100);
		}
	}

}
