package day4_objectCreation;

public class Shark {
	String name;
	String color;//null
	
	char size;//u000
	boolean isHungry;//false
public static void main(String[] args) {
	
	//object consist of one copy of states and behavior

Shark s1= new Shark();//objeect creatiion
Shark s2= new Shark();

System.out.println(s1.name);//s1 is object reference
System.out.println(s1.color);

s1.name="vishal";
s2.isHungry=true;
s2.size='L';
s1.color="blue";
System.out.println(s1.color);
System.out.println(s1);


}
}
