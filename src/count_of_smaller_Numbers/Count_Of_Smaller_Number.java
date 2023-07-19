package count_of_smaller_Numbers;

import java.util.Arrays;
import java.util.Scanner;

/*
	Given an integer array nums,
	return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].
	Example 1:
	Input: nums = [5,2,6,1]
	Output: [2,1,1,0]
	
	Explanation:
	To the right of 5 there are 2 smaller elements (2 and 1).
	To the right of 2 there is only 1 smaller element (1).
	To the right of 6 there is 1 smaller element (1).
	To the right of 1 there is 0 smaller element.
	
	Example 2:
	Input: nums = [-1]
	Output: [0]
	
	Example 3:
	Input: nums = [-1,-1]
	Output: [0,0]
 */
public class Count_Of_Smaller_Number {
	
	private static void count_numbers(int[] array) {
		
		int answer[]=new int[array.length];
		for(int i=0;i<array.length-1;i++)
		{
			int count=0;
		
			for(int j=i+1;j<array.length;j++)
			{
			
				if(array[i]>array[j])
				{
					count++;
				}
			}
			answer[i]=count;
		}
		
		System.out.println(Arrays.toString(answer));
	}

	public static void main(String[] args) {
		
		

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		count_numbers(array);

	}
}
