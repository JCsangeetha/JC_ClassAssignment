package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicatesUsingSet {

	public static void main(String[] args) {
		
		String companyName = "google";
				
		Set<Character> unique= new LinkedHashSet<Character>();
		
		for(int i=0; i<companyName.length();i++) 
		{
			unique.add(companyName.charAt(i));
		}
		
		System.out.println(unique);
		
		String result="";
		for(Character i : unique) 
		{
			result=result+i;
		}
		System.out.println("the unique characters from String "+companyName+" is: "+result);
		
	}}