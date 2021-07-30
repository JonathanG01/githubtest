import java.util.HashMap;

public class Demo02 {

	public static void main(String[] args) {
		/*. Write a Java program to associate the specified value with the specified key in a HashMap. 
		2. Write a Java program to count the number of key-value (size) mappings in a map.
		3. Write a Java program to copy all of the mappings from the specified map to another map.*/
		HashMap <Integer,String> x = new HashMap<Integer,String>();
		x.put(1, "Jonathan");
		x.put(2, "Eli");
		x.put(3, "Uli");
		System.out.println(x); //(1)
		
		System.out.println("******************************");
        System.out.println("count the number of key-value\n");//(2)
      System.out.println(x.size());
      
      System.out.println("******************************");
      System.out.println("Copy all mappings to another");//(3)
     HashMap <Integer,String> y = new HashMap<Integer,String>();
      y.putAll(x);
      System.out.println(y);
      
      
	}

}
