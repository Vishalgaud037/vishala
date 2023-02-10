package velocityarray;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		String[] name = new String[3];
		
		name[0] = "Akshay";
		name[1] = "Vishal";
		name[2] = "Pratik";
		
		System.out.println(name.length);
		System.out.println(name[1].length());
		System.out.println(name[2]);
		System.out.println(Arrays.toString(name));
		
		for(int i = 0;i<=name.length;i++) {
			System.out.println(i);
			
		}
		System.out.println("...........Ascending ordr ............");
		
		Arrays.sort(name);
		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("...........Descending ordr ............");
		Arrays.sort(name);
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
		}
		
	}

}
