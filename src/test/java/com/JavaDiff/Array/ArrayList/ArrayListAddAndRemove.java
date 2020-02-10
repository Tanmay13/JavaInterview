package com.JavaDiff.Array.ArrayList;

import java.util.ArrayList;

public class ArrayListAddAndRemove {
	   public static void main(String[] args) 
	   {
	      // creating ArrayList object of type String
	      ArrayList<String> al = new ArrayList<String>();
	      // adding elements to ArrayList object
	      al.add("Ajith Kumar");
	      al.add("Vijay Joseph"); 
	      al.add("Karthi Sivakumar"); 
	      al.add("Vikram Kennedy");
	      al.add("Dhanusk K Raja");
	      al.add("Suriya Sivakumar");
	      System.out.println("Iterating ArrayList values\n");
	      // Iterating using enhanced for-loop
	      for(String str : al){
	         System.out.println(str);
	      }
	      // removing element at 4th index
	      al.remove(4);
	      // to print all values of ArrayList
	      System.out.println("\n\nArrayList values after" + " removal at 4th index postion \n\n" + al);
	   }

}
