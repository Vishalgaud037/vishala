package day4_objectCreation;

public class TShirt {

	String color;
	char size;
	
	public static void main(String[] args) {
		//object creation
		TShirt t1= new TShirt();
		TShirt t2= new TShirt();
		System.out.println(t1.color);//null
		System.out.println(t2.size);//null
		System.out.println(t1.size);//'\u0000'
		System.out.println(t2.color);//'\u0000'
	
	
	t1.color="blue";
	t2.color="red";
	
	System.out.println(t1.color);
	System.out.println(t2.color);
	
	}
}
