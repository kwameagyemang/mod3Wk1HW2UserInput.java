/*User entered inputs (Scanner): 
1. Write Fibonnaci series between the user entered start and end values
2. Determine whether a user entered number is an Armstrong number
3. Write a program to see if a user entered string is a palindrome or not*/

package week1homework2;

import java.util.Scanner;

public class mod3Wk1Hw2UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide input:");
		System.out.println("--------------------");

		int input = scan.nextInt(); // input value read as integer
		
		//3 variables below storing default values
		int previous = 0, next = 1, result = 0;
		
		/*using for loop to calculate Fibonnaci series The Fib series is made up of
		 * numbers where the next term is the sum of previous two terms e.g 0112358132134*/
		for (int i = 0; i <= input; i++) {
			System.out.println(previous + " ");
			result = previous + next; previous = next; next = result;

		}

	}

}
