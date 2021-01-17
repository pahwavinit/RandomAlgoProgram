package com.vinit.pgm;

/**
 * @author pahwa
 * 
  array: [5, 1, 22, 25, 6, -1, 8, 10],
  sequence: [4, 5, 1, 22, 25, 6, -1, 8, 10]

 */

import java.util.ArrayList;
import java.util.List;

public class ValidateSubSequence {
	
	 public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
			// Write your code here.
				int arrIndex = 0;
				int seqIndex = 0;
				
				while (arrIndex < array.size() && seqIndex < sequence.size())
				{
					if(array.get(arrIndex).equals(sequence.get(seqIndex)))
					{
						seqIndex++;
					}
					arrIndex++;
				}
				return seqIndex == sequence.size();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List arr  = new ArrayList<Integer>();
		List seq  = new ArrayList<Integer>();
		arr.add(3);
		arr.add(7);
		arr.add(6);
		arr.add(5);
		arr.add(4);
		
		seq.add(3);
		seq.add(6);
		seq.add(0);
		
		System.out.println(" Validate Sub Sequence"+ValidateSubSequence.isValidSubsequence(arr, seq));
	}

}
