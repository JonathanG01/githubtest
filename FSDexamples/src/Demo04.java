import java.util.HashSet;

public class Demo04 {

	public static void main(String[] args) {
		/*# HashSet
		1. Write a Java program to append the specified element to the end of a hash set. 
		2. Write a Java program to iterate through all elements in a hash list. 
		3. Write a Java program to get the number of elements in a hash set. 
		4. Write a Java program to empty an hash set.*/
		HashSet <String> x = new HashSet<>();
		x.add("1");
		x.add("2");
		x.add("3");
		x.add("4");
		x.add("5");
		System.out.println(x);
		System.out.println("*****************************");
		System.out.println("add element to the end and Iterated hashset");
		x.add("6");//1
		//System.out.println(x.add("6")); not sure why this comes as true.
		for( String name02 : x) {System.out.println(name02);}//2 iterate
		System.out.println("*****************************");
		System.out.println("get number of elements");
		System.out.println(x.size());//3 
		
		System.out.println("*****************************");
		System.out.println("emptied hashset");//4
		//System.out.println(x.removeAll(x)); not sure if I can do it this way too.
		x.removeAll(x);
		System.out.println(x);
		
	}

}
