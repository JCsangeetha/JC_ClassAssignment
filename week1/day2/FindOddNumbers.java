package week1.day2;

public class FindOddNumbers {
	/* Assignment Details:
Create a class named FindOddNumbers with integer variable as maxRange with value 10
 -Write a logic to print the odd numbers from 1 */
	
	public static void main (String[] args) 
	{
		int maxRange = 10;
				
		for(int i=1; i<=maxRange; i++) 
		{
			if((i%2)!=0) 
			{
				System.out.println(i);
			}
		}
	}

}
