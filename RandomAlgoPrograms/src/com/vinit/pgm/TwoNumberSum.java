/*
 * Two Number Sum
 * This function takes non empty array of distinct integers and sum of these two integer 
 * should be equal to final number
 */
package com.vinit.pgm;

public class TwoNumberSum {
	
  public static int[] twoNumberSumFunc(int[] array, int targetSum) {
    // Write your code here.
		for(int i=0;i<array.length;i++)
		{
			int value = array[i];
			for(int j=0;j<array.length;j++)
			{
				if(value != array[j])
				{
				int sum = array[i] + array[j];
				if(sum == targetSum)
				{
					 return new int[] {array[i] , array[j]};
				}
				}
			}
			
		}
    return new int[0];
  }
	public static void main(String args[])
	{
		int iniArray[] = {3,5,-4,8,9,-1,1,6};
		int finalArray[] = TwoNumberSum.twoNumberSumFunc(iniArray,10);
		for(int i = 0 ; i <finalArray.length;i++ )
		System.out.println(finalArray[i]);
	}
}
