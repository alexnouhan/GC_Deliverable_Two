package unicodeCalculator;

import java.util.Scanner;

public class unicodeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Unicode Calculator
		 * by Alex Nouhan
		 * 2019-03
		 * Grand Circus Java Bootcamp
		 */

		
		//Declare variables
		
		String word1 = "-";
		String word2 = "-";
		int word1Value = 0;
		int word2Value = 0;
		int result = 0;
		
		//Get input from user
		
		System.out.println("Hi, welcome to the Unicode value difference calculator!");
		System.out.println("The prompt will ask you for two words, then display the difference"
				+ " in their respectively summed unicode values!");
		System.out.println("Type the first word and hit enter: ");
		
		word1 = sc.nextLine();
		
		System.out.println("Now type the second word and hit enter: ");

		word2 = sc.nextLine();
		
		//Convert strings to unicode value totals
		
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		
		for (int x = 0; x < word1Array.length; x++) {
			word1Value += word1Array[x];
		}
		
		for (int x = 0; x < word2Array.length; x++) {
			word2Value += word2Array[x];
		}
		
		result = Math.abs(word1Value - word2Value);
		
		//Output results
		
        System.out.println("----------------");
		System.out.println(word1 + " - " + word2 + " = " + word1Value + " - " +
		word2Value + " = " + result);	
	}
}
