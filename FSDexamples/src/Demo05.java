import java.util.Iterator;
import java.util.TreeSet;

/*# TreeSet
Write a Java program to create a new tree set, add some colors (string) and print out the tree set. 
2. Write a Java program to iterate through all elements in a tree set.
3. Write a Java program to add all the elements of a specified tree set to another tree set. 
4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
5. Write a Java program to get the first and last elements in a tree set*/
public class Demo05 {

	public static void main(String[] args) {
		
		TreeSet<String> x = new TreeSet<>();
		System.out.println("*******************************");
		System.out.println("iterated treeset:");
		x.add("red");
		x.add("blue");
		x.add("green");
		x.add("yellow");
		x.add("black");
		for(String var : x) {System.out.println(var);}//1
		System.out.println("*******************************");
		System.out.println("cloned treeset: ");
		TreeSet<String> y= new TreeSet<>();//3, new tree with addAll() and clone().
		y.addAll(x);
		System.out.println(y);
		System.out.println("or maybe like this");
		System.out.println(x.clone());
		System.out.println("*******************************");
		System.out.println("reversed elements:");
		Iterator i = x.descendingIterator();
		while(i.hasNext()) {System.out.println(i.next());}//4 reverse order view of elements
		
		System.out.println("*******************************");
		System.out.println("returns first element:");
		System.out.println(x.first());//returns first element of treeset.
		System.out.println("Returns last element:");
		System.out.println(x.last());//returns last element of treeset.
		
		
			
		
		
	}

}
