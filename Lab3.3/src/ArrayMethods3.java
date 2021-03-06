//Array Methods Lab 3.3
//Cristina Chen
//February 15
//not done

import java.util.Arrays;

public class ArrayMethods3 
{
	public static void quickSort(int [] list1, int front, int back)
	{
		//base case
		//front >= back, but you don't do anything to it 
		
		if (back > front)
		{
			int pivotPos = partition(list1, front, back);
			
			//left side
			quickSort(list1, front, pivotPos - 1);
			
			//right side
			quickSort(list1, pivotPos + 1, back);
		}
	}
	
	
	public static String[] mergeSort(String[] list)
	{
		//returns the sorted string array
		//side effect: list1 sorted in ascending order
		//write a method that recursively separates the list into 
		//	two halves and calls mergesort on both halves
		//	when we reach two halves that haven length 1, then merge the arrays together
		
		//Base case
		if(list.length <= 1) 
		{
			return list;
		}
		
		//Recursive step
		//split array in half into left and right
		int middle = list.length/2;
		//String[] left = (list.length/2);		//goes from 0 to middle
		//String[] right = {};	//goes from middle to length
		
		
		//build in function
		//copyofrange, to copy the array
		String[] left = list.copyOfRange(list, 0, middle);
			for (int i : left)
			{
				System.out.print(i + " ");
			}
			
		
		return(merge(mergeSort(left), mergeSort(right)));
		//need merge method ^^^^
		
	}
	
	public static int partition (int[] list, int front, int back)
	{
		//return pivot pos
		
		
	}
	
	
}
