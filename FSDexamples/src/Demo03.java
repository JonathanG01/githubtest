import java.util.Iterator;
import java.util.LinkedList;

public class Demo03 {

	public static void main(String[] args) {
		/*# Linked List
1. Write a Java program to append the specified element to the end of a linked list.
2. Write a Java program to iterate through all elements in a linked list. 
3. Write a Java program to iterate through all elements in a linked list starting at the specified position. 
4. Write a Java program to iterate a linked list in reverse order.
5. Write a Java program to insert the specified element at the specified position in the linked list. */
		
//append(add) specified element to the end of linked list
		LinkedList <String> x = new LinkedList<>();
		x.add("Janiva");
		x.add("Jonathan");
		x.add("Eli");
		x.add("Uli");
		x.add("Javier");
		x.add("Martha");
		
		System.out.println(x);		
		System.out.println("*****************************");
		System.out.println("this will add at the end of list:\n");//1
		x.addLast("Ivy");
		for(String name : x) {
			System.out.println(name);//2
		}
		System.out.println("also iterated linked list.");
		System.out.println("*****************************");
		
		/*x.listIterator(2);//3
		for (String name01 : x) {
			System.out.println(name01.toString());
		} failed attempt before googling it*/
		
		Iterator y = x.listIterator(2);
		while (y.hasNext()) {
			System.out.println(y.next());//3, should ask if it can be done another way.
		}
		
		//reverse order
		System.out.println("*****************************");
		System.out.println("reverse order:");
		Iterator z = x.descendingIterator();//4, looks like it can be done with while only.
		while (z.hasNext()) {
			System.out.println(z.next());
		}
		
		System.out.println("*****************************");
		System.out.println("insert element at specified list");
		x.add(0, "Daniel");//5
		System.out.println(x);
		
		
}
}
