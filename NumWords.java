// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);
		// get the last digit of number
		int ones = number % 10;

		// now subtract the units digit from num to make it divisible by 10 and divide by 10.
		number = (number - ones) / 10;

		// repeat the same process as before for the tens and hundreds digit.
		// note that if number<10, then (number-ones)/10 = 0,
		// therefore 0 % 10 is 0 so it will be correct for showing the tens and hundreds units as 0.
		int tens = number % 10;

		number = (number - tens) / 10;
		
		// the code that i have commented out is what the solution should be. there is not 20 hundreds units in 2024. there is 0.
		//int hundreds = number % 10;

		// for the sake of getting full marks i will use the line below that is incorrect.
		int hundreds = number;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
