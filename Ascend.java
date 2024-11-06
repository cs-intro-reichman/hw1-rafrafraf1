// challenge: cannot use if statement
import java.util.Random;
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		Random random = new Random();
		int lim = 100;

		int a = random.nextInt(lim);
		int b = random.nextInt(lim);
		int c = random.nextInt(lim);
		System.out.println("num1: " + a + "\nnum2: " + b + "\nnum3: " + c);
		
		// get the smaller num between a and b, then get the larger one
		int sab = Math.min(a,b);
		int lab = Math.max(a, b);

		// get the smallest between s1 and c, this must be the smallest of the 3 numbers
		int smallest = Math.min(sab, c);
		
		// get the 
		int middle = Math.min(lab, c);
		int largest = Math.max(lab, c);

		System.out.println("\nascending order:\nnum1: " + smallest + "\nnum2: " + middle + "\nnum3: " + largest);
	}
}
