package week3.day1;

import java.util.Arrays;

public class printDuplicates {
	
	public static void main(String[] args) 
	{
		
		//declaring a variable
		int[] num= {2,5,7,7,5,9,2,3};
		
		//finding the length of the variable
		int array_length=num.length;
		
		//printing the length of the variable
		System.out.println("array length is "+array_length);
		
		//sorting the array
		Arrays.sort(num);
		
		//iterating through each value of the array
		for(int i=0;i<array_length-1;i++) 
		{
		
			//checking if the current value and the next value is same
			if(num[i]==num[i+1]) 
			{
				System.out.println("The value "+num[i]+" is duplicated");
			
			}
						}
		}
	}
	
	
	
	

