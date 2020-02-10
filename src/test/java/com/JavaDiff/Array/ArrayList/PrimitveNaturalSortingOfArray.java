package com.JavaDiff.Array.ArrayList;

import java.util.Arrays;

public class PrimitveNaturalSortingOfArray {
	
	   public static void main(String[] args) 
	      {
		   
		   System.out.println("First Difference Interview questions");
	      Integer[] intArrays = {31, 83, 53, 97, 29, 7, 13,  47, 79};
	      String[] strArrays = {"Karthi", "Vikram", "Vijay","Simbhu", "Suriya", "Ajith"};
	      System.out.println("Before sorting: Integer Arrays\n");
	      // printing Integer Arrays
	      System.out.println(Arrays.toString(intArrays));
	      // sorting Arrays using
	      Arrays.sort(intArrays);
	      System.out.println("\nAfter sorting: Integer Arrays\n");
	      // printing Integer Arrays
	      System.out.println(Arrays.toString(intArrays));
	      System.out.println("\n\n\nBefore sorting: String Arrays\n");
	      // printing Integer Arrays
	      System.out.println(Arrays.toString(strArrays));
	      // sorting Arrays using
	      Arrays.sort(strArrays);
	      System.out.println("\nAfter sorting: String Arrays\n");
	      // printing Integer Arrays
	      System.out.println(Arrays.toString(strArrays));
	   }

}
