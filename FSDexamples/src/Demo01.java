import java.util.ArrayList;
import java.util.Collections;
//import java.util.*; Imports all!!

public class Demo01 {

	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<String>();//created arraylist
		x.add("Red");
		x.add("Blue");
		x.add("Orange");
		x.add("White");
		x.add("Yellow");
		System.out.println(x);
		
		System.out.println("******************************");
		
		
		//iterate through elements
		System.out.println("iterate through elements\n");
		for(String name: x){
	        System.out.println(name);
	}
		System.out.println("******************************");
		System.out.println("Element inserted at first position\n");
		
		x.add(0, "Purple"); //insert element at the first position
		for(String name: x){
	        System.out.println(name);
	        
	    }
		 System.out.println("******************************");
		 System.out.println("Element retrieved from certain index");
	       System.out.println(x.get(2));//retrieve element from certain index
	       
	     //update specific element by given element	       
	       System.out.println("******************************");
	       System.out.println("Update specific element\n");
	       x.set(2,"Black");
	       for(String name: x){
		        System.out.println(name);
		        
		    }
	       
	       System.out.println("******************************");
	       System.out.println("Remove 3rd element from list\n");
	       //remove 3rd element from arraylist
	       x.remove(3);
	       for(String name: x){
		        System.out.println(name);
		        
		    }
	       
	       System.out.println("******************************");
	       System.out.println("Search element in arraylist\n");
	       x.contains("Purple");//search element in array list
	       
	       System.out.println("******************************");
	       System.out.println("Sort given arraylist\n");
	       //sort given array
	       Collections.sort(x);
	       System.out.println("Array sorted\n");
	       for(String name: x){
		        System.out.println(name);
		        
		    }
	       //Copy array list into another
	       System.out.println("******************************");
	       System.out.println("arraylist copied into another arraylist\n");
	       ArrayList<String> clone = ( ArrayList<String>) x.clone();
	         
	        System.out.println(clone);
	        
	
	        //or maybe like this
	        System.out.println("******************************");
	        System.out.println("different way of copying an arraylist I think\n");
	        clone.addAll(x);
	        for(String name: x){
		        System.out.println(name);
		        
		    }
	        //this will shuffle elements
	        System.out.println("******************************");
	        System.out.println("Shuffle elements given\n");
	        Collections.shuffle(x);
	        for(String name: x){
		        System.out.println(name);
		        
		    }
	        
	        //this will reserve elements
	        System.out.println("******************************");
	        System.out.println("Elements reversed\n");
	        Collections.reverse(x); 
	        
	        for(String name: x){
		        System.out.println(name);
		        
		        
		    }
	        //partial portion of arraylist
	        System.out.println("******************************");
	        System.out.println("Partial portion of arraylist\n");
	        //x.subList(0, 2);
	        System.out.println(x.subList(0, 2));
	        
	        //swap elements
	        System.out.println("******************************");
	        System.out.println("Swapped elements in arraylist\n");
	        System.out.println(x);
	        Collections.swap(x, 0, 3);
	        System.out.println(x);
	       
	      
	       
	       
	        
}
	
	
	
}
