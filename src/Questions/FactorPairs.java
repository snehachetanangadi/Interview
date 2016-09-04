package Questions;

import java.util.Hashtable;

public class FactorPairs {
	public static void main(String args[]) {
		int a = 12;
		System.out.println(" Factors of " + a +" is " + factors(a));
	}
	
	public static int factors(int element) {
		int number;
		/* https://www.careercup.com/question?id=5759894012559360 
		 * Write a program that takes an integer and prints 
		 * out all ways to multiply smaller integers that equal 
		 * the original number, without repeating sets of factors. 
		 * In other words, if your output contains 4 * 3, 
		 * you should not print out 3 * 4 again as that would be
		 *  a repeating set. Note that this is not asking for prime
		 *   factorization only. Also, you can assume that the input
		 *    integers are reasonable in size; correctness is more 
		 *    important than efficiency. 

		Eg: PrintFactors(12) 12 * 1 6 * 2 4 * 3 3 * 2 * 2*/
		Hashtable<Integer, Integer> store = new Hashtable<Integer, Integer>();
		for(int i = 1; i < element/2; i++) {
			if(element % i == 0) {
				number = element/i;
				//System.out.println(number + " Contains " + store.containsKey(number)
				//		+ " value " + store.containsKey(number) + " i " + i);
				if(!store.containsKey(number) && !store.containsValue(i)) {
					System.out.println(number + " " + i);
					store.put(i, number);
				}
			}
		}
		return 0;
	}
}
