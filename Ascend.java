// challenge: cannot use if statement
import java.util.Random;
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		Random random = new Random();
		int lim = Integer.parseInt(args[0]);

		int a = random.nextInt(lim);
		int b = random.nextInt(lim);
		int c = random.nextInt(lim);
		System.out.println(a + " " + b + " " + c);
		
		// get the smaller num between a and b, then get the larger one
		int sab = Math.min(a, b);
		int lab = Math.max(a, b);

		// get the smallest between sab and c, this must be the smallest of the 3 numbers
		int smallest = Math.min(sab, c);
		
		// get the largest the same way essentially
		int largest = Math.max(lab, c);

		// the middle must therefore be the sum of the 3 numbers subtracted by the sum of the smallest and largest 
		int middle = a + b + c - (smallest + largest); 

		System.out.println(smallest + " " + middle + " " + largest);
	}
}
